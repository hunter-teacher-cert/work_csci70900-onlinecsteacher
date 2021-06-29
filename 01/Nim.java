import java.io.*;
import java.util.*;

public class Nim {

  public static void main(String[] args) {

    //Initialize variables
    int stones = 12;
    int stonesTaken;

    //Set up scanner
    Scanner in = new Scanner(System.in);
    Random random = new Random();

    //while loop while game is running, i.e. while there are still stones in the bag
    while (stones >= 0) {
      //user takes stones
      do {
        //prompt user for how many stones they want to remove
        System.out.println("How many stones would you like to remove? Take 1, 2, or 3.");
        stonesTaken = in.nextInt();

        if (stonesTaken != 1 && stonesTaken != 2 && stonesTaken != 3){
          System.out.println("Invalid turn. Enter a number 1, 2, or 3.");
          stonesTaken = 0;
        }
      } while(stonesTaken != 1 && stonesTaken != 2 && stonesTaken != 3);

      //remove those stones and update user
      stones = stones - stonesTaken;

      //Output how many stones are left
      System.out.println("There are " + stones + " stones left");

      if(stones == 0){
        System.out.print("You win!");
        break;
      }

      // computer's turn to pick a random number of stones, but only if there are that many stones left
  		do {
    		stonesTaken = random.nextInt(2) + 1;
  		} while(stones - stonesTaken < 0);

  		//calculate number of stones left and tell user
  		stones = stones - stonesTaken;
  		System.out.println("The computer took " + stonesTaken + " stones.");
  		System.out.println("There are " + stones + " stones left.");

  		//computer wins if stones is 0 at this point
  		if(stones == 0) {
  			System.out.println("The computer won. Better luck next time.");
  			break;
  		}
    }
  }
}
