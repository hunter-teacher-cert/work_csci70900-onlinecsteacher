class Main {

    public static boolean isDivisible(int n, int m) {
       //If the first integer is evenly divisible by the
       //second integer return true, else return false
      if (n % m == 0) {
        return true;
      } else {
        return false;
      }

    }

    public static boolean isTriangle(int a, int b, int c) {
      ////If the sum of two sides of the triangle are smaller
      //than the third side return false (not a real triangle),
      //else return true
     if ((a > b + c) || (b > a + c) || (c > a + b)) {
       return false;
     } else {
       return true;
     }
   }

   public static int ack(int m, int n) {
     //If the first integer is 0,
     //return the second integer n + 1
     if (m == 0) {
       return n + 1;
     }

     //Else if m > 0 and n is equal to 0 return ack(m-1,1)
     else if ((m > 0) && (n == 0)) {
       return ack(m - 1, 1);
     }
     //In any other case return ack(m - 1, ack(m, n - 1))
     else {
       return ack(m - 1, ack(m, n - 1));
     }
   }

     public static void main(String[] args) {
    //Initialize variables for isDivisible
    int n = 6;
    int m = 3;
    System.out.println(isDivisible(n,m));

    //Initialize variables for isTriangle
    int side1 = 12;
    int side2 = 1;
    int side3 = 1;
    System.out.println(isTriangle(side1,side2,side3));

    //Initialize variables for the Ackermann function
    int f = 1;
    int g = 2;
    System.out.println(ack(f,g));
  }

}
