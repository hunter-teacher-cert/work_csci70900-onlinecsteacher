/*
Assignment:
Create a live-code experience by writing code (or using existing code) and annotating it with teacher-facing comments that would explain how to develop that code live.
Include questions for students, when to pause, when to ask for predictions, purposeful mistakes, etc.
Here's an example for linear search:
*/

class Main {

  //Create a new method that raises double x to exponent n
  public static double power(double x, int n){
    //Start with a method stub
    //Ask students:
    //How many parameters do we want? Of what types?
    //How should we call them?


    //Initialize a new temporary variable (what can we call it? temp)
    //to the value of x
    // Questions:
    // Why do we need a temporary variable?
    // What would happen if we kept x?
    double temp = x;

    //Create a for loop that multiplies temp by itself n times
    for (int i = 1; i < n; i++){
      //Why n times?
      //Why start i at 1 and not 0?

      temp = temp*x;
      //What is another way of writing this? temp *= x;
    }
    return temp;
    //What do we need to return?
    //Can we trace this out with an example power(2.0, 3)?

    public static void main(String[] args) {
      System.out.println(power(2.0, 3));
    }
}
