import static java.lang.Math.random;
import java.util.Scanner;

class Main {

  // roll() accepts an integer parameter and returns a random number between 1 and that number, inclusive
  public static int roll(int num) {
    int randomRoll = (int)(Math.random()*(num)+1);
    return randomRoll;
  }

  public static int shoot(int numDice, int maxValue) {
    //Initialize variables for each roll and the overall result (sum of the rolls)
    int roll = 0;
    int result = 0;

    //For each die played, roll once. Sum the roll to the running total (result)
    for (int i = 0; i < numDice; i++) {
      roll = roll(maxValue);
      result += roll;
    }

    //Print out the result
    System.out.println(result);
    return result;
  }

  public static String round(){
    //Create a string variable to hold the outcome of each round
    String outcome;

    //Roll the dice by calling the shoot() method
    int result = shoot(2,6);

      //If the player rolls a 7 or 11 they win
    if ((result == 7) || (result == 11)){
      outcome = "WIN";

      //Else if the player rolls a 2, 3, or 12 they lose
    } else if ((result == 2) || (result == 3) || (result == 12)){
      outcome = "LOSE";

     //Else if the player rolls another number they keep rolling until they roll that same number again (Win) or until they roll a 7 (Lose)
    } else {

      //Set the outcome to "Point" and initialize the point variable to the result of the initial roll
      outcome = "Point";
      int point = result;

      //While you have not yet rolled a 7 or the value of point keep rolling the dice
      while ((outcome == "Point")) {

        //Roll the dice and store the outcome in the result variable
        result = shoot(2,6);

          //If you roll a 7 you lose
        if (result == 7){
          outcome = "LOSE";

          //Else if you roll the value of the point you win
        } else if (result == point) {
          outcome = "WIN";
        }
      }

    }

    //Print the outcome of the round (Win or Lose) and return
    System.out.println(outcome);
    return outcome;
  }

  public static void main(String[] args) {

    //Read in input from the command line
    Scanner in = new Scanner(System.in);

    //Prompt the user to enter a number of rounds and store that variable as the number of rounds played
    System.out.print("How many rounds do you want to play? ");
    int rounds = in.nextInt();

    //Use a for loop to play the number of rounds indicated in the command line
    for (int i = 0; i < rounds; i++) {
      System.out.print("Round " + (i + 1) + ": ");
      round();
    }
  }
}
