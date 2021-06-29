import java.util.Arrays;
import java.lang.*;


class Main {

  public static double[] powArray(double[] a, int b) {
    for (int i = 0; i < a.length; i++){

      //Create a new array that raises each element in the a array to a given power b
      a[i] = Math.pow(a[i], b);

    }
    return a;
  }

  public static int[] histogram(int[] scores, int counters) {

    //Create a new array that holds a given number of counters (see histogram args)
    int[] counts = new int[counters];

    //Traverse the score array and add 1 to the counts array every time a number appears
    for (int score : scores) {
      counts[score]++;
    }

  return counts;
  }

  public static int indexOfMax(int[] a) {
   //You can use either an enhanced for loop or a regular for loop to traverse the array and return the highest value. However, to return the index of the highest value you need a regular for loop because and enhanced for loop does not keep track of the indices.

   //Set maxIndex to 0
   int maxIndex = 0;

   //Set maxIndexValue to 0
   int maxIndexValue = 0;

   //Traverse the given array, find the index of the highest value and set it to maxIndex
   for (int i = 0; i < a.length; i++) {
     if (a[i] > maxIndexValue) {
       maxIndexValue = a[i];
       maxIndex = i;
     }
   }

   //Set max to 0
   int max = 0;

   //Use an enhanced for loop to traverse the array
   for (int count: a){
     if (count > max) {
       max = count;
     }
   }

   //Return the highest index
   return maxIndex;
 }

   public static boolean[] sieve(int n) {

    //Create a numbers array to hold all the numbers from 0 to n-1
    int[] numbers = new int[n];

    for (int i = 0; i < n; i++) {
      numbers[i] = i;
    }

    //Print out the array of numbers 0 to n-1 to check that the array was properly initialized
    //System.out.println(Arrays.toString(numbers));

    //Create a boolean array to store whether the numbers in the numbers array are prime
    boolean[] isItPrime = new boolean[n];

    //Initialize all values except 0 and 1 in isItPrime array to true
    for (int i = 0; i < n; i++) {
      if (i < 2) {
        isItPrime[i] = false;
      } else {
        isItPrime[i] = true;
      }
    }

    //Iterate through the numbers array to determine which values are prime
    for (int i = 2; i < Math.sqrt(n); i++) {

      //If the boolean value in isItPrime is set to "true" evaluate it to see if it is actually a prime number. If it is divisible by a multiple of i, set it to false
      if (isItPrime[i] == true) {

        //Iterate through the isItPrime array and set all multiples of i to false
        for (int j = i*i; j < n; j += i) {
          isItPrime[j] = false;
        }
      }
    }

    //Return the boolean array
    return isItPrime;
  }

  public static void main(String[] args) {

    double[] values = {1, 2, 3};
    //System.out.println(Arrays.toString(values));

    powArray(values, 3);
    //System.out.println(Arrays.toString(values));

    int[] scores = {9, 15, 3, 3};
    //System.out.println(Arrays.toString(histogram(scores, 16)));

    //Create a new array for the indexOfMax method
    int[] newArray = {1, 23, 17};

    //Call and print out the indexOfMax method
    System.out.println(indexOfMax(newArray));

    //Initialize the number
    int num = 8;
   
    //Call the sieve method and print the array
    System.out.println(Arrays.toString(sieve(num)));
  }
}
