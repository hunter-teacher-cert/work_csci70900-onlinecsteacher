class Main {

  //Create a new method that raises double x to exponent n
  public static double power(double x, int n){

    //Initialize a new temporary variable temp to the value of x
    double temp = x;

    //Create a for loop that multiplies temp by itself n times
    for (int i = 1; i < n; i++){
      temp = temp*x;
    }
    return temp;
  }

  //Create a new method that calculates the factorial of n
  public static int factorial(int n){

     //Initialize a new temporary variable temp to the value of n
     int temp = n;

     //Create a for loop that multiplies temp by itself, then itself - 1, etc. n times
     for (int i = 1; i < n - 1; i++) {
       temp = temp*(n-i);
     }
     return temp;
  }

  //Create a function called myexp that takes a double x and int n (the number of terms in the sequence)
  public static double myexp(double x, int n){

     //Initialize the value of e^x to 1.0, initialize the numerator of each term to x and the denominator to the factorial of x's exponent
     double epowerx = 1.0;
     double nextTerm = 1.0;

     //Create a for loop that iterates through the values up to n and adds each successive term to the running sum e^x
     for (int i = 1; i < n; i++) {

       //Set the next term to be x raised to the power of the number term in the sequence over the factorial of the term
       nextTerm = (nextTerm*x)/(i);

       //Add the next term to the running sum e^x
       epowerx = epowerx + nextTerm;
     }

     return epowerx;
   }

   //Create a method called check that takes two parameters and compares the output from myexp(x, n) to Math.exp(x)
   public static String check(double x, int n) {
     String s = x + "   " + myexp(x, n) + "   " + Math.exp(x);
     return s;
   }

 public static void main(String[] args) {
   //Call and print out the result of power()
   System.out.println(power(3.0,5));

   //Call and print out the result of factorial()
   System.out.println(factorial(7));

   //Initialize the values of x and n
   double x = 1.0;
   int n = 100;

   System.out.println(check(x, n));

   //As x increases by a factor of 10,
   // the accuracy of the myexp() function decreases,
   // most significantly from 10.0 to 100.0.
   // For .1 and 1.0 there are 16 digits of agreement,
   // for 10.0 there are 14 digits of agreement,
   // and for 100.0 there 0 digits of agreement.
   for (double i = .1; i < 101.0; i *= 10) {
     System.out.println(check(i, 100));
   }

   //As x increases by a factor of 10,
   // the accuracy of the myexp() function decreases,
   // most significantly from -10.0 to -100.0.
   // For -.1 and -1.0 there are 15 digits of agreement,
   // for -10.0 there are 8 digits of agreement,
   //and for -100.0 there 0 digits of agreement.
   for (double i = -.1; i > -101.0; i *= 10) {
     System.out.println(check(i, 100));
   }
 }

}
