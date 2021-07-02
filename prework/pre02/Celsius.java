import java.util.Scanner;

class Celsius {
  public static void main(String[] args) {
    double line;
    Scanner in = new Scanner(System.in);

    System.out.print("Type in a temperature in Celsius: ");
    line = in.nextDouble();

    double fahrenheit = (line * 9/5) + 32.0;

    System.out.println(line);
    System.out.printf("%.1f C = %.1f F", line, fahrenheit);
  }
}
