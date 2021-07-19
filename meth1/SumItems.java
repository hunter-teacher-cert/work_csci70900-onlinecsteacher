public class SumItems{
/* precondition : 0 is less than or equal to  y
    y < z < length of the integer array x */
  public static int sumItems( int[] x, int y, int z) {
    int s = 0;
    int i = y;
    while  ( i < z ) {
      s = s + x[i];
      i = i + 1;
    }
   return s;
  }

  public static void main( String[] args) {
  //Consider the following segment
  int [] a= {1,2,3,4,5,6,7,8,9,10};
  int r =  sumItems(a, 2, 5) + sumItems(a, 4, 6);
  }
}
