/*
Instructions:
*/

public class LessonPlan2_code {

  public static void oneParameter(int x){
    int a = 5;
    int b = x;

    b = b + a;
    System.out.println(b);
  }

  public static void twoParameters(int x, int y){
    int a = 5;
    int b = x;
    int c = y;

    while (b < a) {

      System.out.println("Blueberry"); //Step 1
      //System.out.println(b*2); //Step 2
      b = b + 1; //What would happen without this line?
    }

    if (c == 3){

      c = c*2; //Will this value ever change, why or why not?
      System.out.println("Apple"); //Step 1
      //System.out.println(c); //Step 2

    } else if (c < 3) {

      System.out.println("Banana"); //Step 1
      //System.out.println("c = " + c); //Step 2
      c++;

    } else if (c > 3) {

      System.out.println("Orange"); //Step 1
      //System.out.println("c " + (c - 1)); //Step 2
      c--;

    }

    //Steps 1 and 2:
    //What is the value of x?
    //What is the value of y?
    //What is the value of a?
    //What is the value of b?
    //What is the value of c?
    //Which if any of the variables will remain constant?

  }

  public static void main(String[] args) {

    //Teacher Demo

    //x = 2
    oneParameter(2);

    //x = 3
    oneParameter(-10);


    //Step 1:
    //Consider the following inputs and trace through their outputs:

    //Teacher Demo
    //x = 2, y = 3;
    twoParameters(2, 3);

    //int x = 4, y = 1;
    twoParameters(4, 1);

    //int x = 5, y = 5;
    twoParameters(5, 5);


    //Step 2:
    //Uncomment the Step 2 code (and comment out the Step 1 code)
    //Consider the following inputs and trace through their outputs:

    //x = 2, y = 3;
    twoParameters(2, 3);

    //int x = 4, y = 1;
    twoParameters(4, 1);

    //int x = 5, y = 5;
    twoParameters(5, 5);

  }
}
