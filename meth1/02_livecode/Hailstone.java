public class Hailstone{
  public static String hailstone(int n) {
            String series = n + " ";

            while (n != 1) {
              if (n % 2 == 0)
                n = n / 2;
              else
                n = (3 * n) + 1;
              series += n + " ";
            }
            return series;
          }
    public static void main(String[] args){
      System.out.println(hailstone(5));
    }
}
