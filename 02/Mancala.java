//pvp Mancala game

import java.io.*;
import java.util.*;

class Mancala {

  public static void printGameboard(int[] gameBoard){

    //Print p2's row
    System.out.print("p2 ");

    //Decrement from the last index in the array to index 7. Output as P2's row.
    for(int i = 13; i > 6; i--)  {
      System.out.print(gameBoard[i] + " ");
    }

    //Print a new line and a space before P1's row
    System.out.println();
    System.out.print("     ");

    //Increment from the first index to index 6. Output as P1's row.
    for(int i = 0; i < 7; i++)  {
      System.out.print(gameBoard[i] + " ");
      }
      System.out.println("p1");
    }

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    //Create a static array to represent the starting gameboard
    int[] startingBoard = {4,4,4,4,4,4,0,4,4,4,4,4,4,0};

    //showing users initial game board
    printGameboard(startingBoard);

    //pocket is index from which we're drawing stones
    //stones is the number of stones in that pocket
    int pocket, stones;

    while( (startingBoard[0] + startingBoard[1] +startingBoard[2] + startingBoard[3] + startingBoard[4] + startingBoard[5] != 0) && (startingBoard[7] + startingBoard[8] +startingBoard[9] + startingBoard[10] + startingBoard[11] + startingBoard[12] != 0) ) {

      //First player's turn.
      do {
        //Send prompting message.
        System.out.println("Player 1's turn. Choose a pocket to draw from. Input a number from 0 to 5: ");

        //Read in their response.
        pocket = in.nextInt();

        //If user enters an invalid number prompt them again to enter a number correctly.
        if(pocket < 0 || pocket > 5 || startingBoard[pocket] == 0){
          System.out.println("Invalid choice.");
        }
      } while(pocket < 0 || pocket > 5);

      //Go to index specified, output the value of stones, then set the value to 0
      stones = startingBoard[pocket];

      //user picks up all stones from that pocket
      startingBoard[pocket] = 0;

      while(stones > 0){
        //wrapping around from p2's pit to p1's row
        if(pocket == 12){
          //going from p2's pit(13th item) to p1's row(0th item)
          pocket = -1;
        }
        startingBoard[pocket + 1]++; //Drop one stone in each subsequent pit
        pocket++; //Increase the pit index by 1
        stones--; //Decrease the stones in your hand by 1
      }
      printGameboard(startingBoard);
    }
  }
//if last stone is in your pit, it's first player's turn again
}


//gameboard as single array, starting off with 4 stones in each pit
//condition code to select only numbers within their index

// M p p p p p p
//   p p p p p p M

// 0 4 4 4 4 4 4
//   4 4 4 4 4 4 0

// 13th(p) 12th 11th 10th 9th 8th 7th
//         0th  1st  2nd  3rd 4th 5th  6th(p)
