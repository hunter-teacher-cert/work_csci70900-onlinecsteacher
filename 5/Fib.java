//AlexMoore,Emma Wingreen, Stephannia Kabanakis
public class Fib {

  public static void main(String[] args) {

    //Initialize a variable to print out max number of Fibonacci values
    int max = 10;

    //Use a for loop to print out the values of the Fibonacci sequence,
    //from fib(0) to fib(max)
    for(int i = 0; i <= max; i++){
      System.out.printf("Fib(%d) = %d\n",i,FibRec(i));
    }

    /*
    for(int i = 0; i < max; i++){
      System.out.println("Fib(" + i + ") = " + FibRec(i));
    }
    */
  }

  //Function FibRec returns the value of the nth term in the Fibonacci sequence
  public static int FibRec(int n){
    // Create a base case when n = 0
    if (n == 0){
       return 0;
     }
     // Create a base case when n = 1
     else if (n == 1){
       return 1;
     }
     //recursion calls FibRec for all other values of n
     else {
       return (FibRec(n-2) + FibRec(n-1));
    }
  }
}


// fib(0) -> 0
// fib(1) -> 1
// fib(2) -> 1
// fib(3) -> 2
// fib(4) -> 3
// fib(5) -> 5

// A BASE CASE, which is a simple case value we know how to evaluate without a recursive call. It stops the recursion.
  // a.k.a. "exit case."
// E.g., 0! => 1 for factorial(n)

//To find fib(n)
  //fib(n) = fib(n-1) + fib(n-2)
// + (n-2)
