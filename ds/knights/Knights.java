/*
Tiffany Wong
Emma Wingreen
Chaouiki Hadjahmed
*/

import java.io.*;
import java.util.*;

public class Knights{


  // the board is of ints rather than chars like the maze
  // since we want to track the moves by number

  private int[][] board;
  private int rows;
  private int cols;
  private int size;
  private String clearScreen="[0;0H\n";

  private void delay(int n){
    try
	  {Thread.sleep(n);}
    catch(InterruptedException e)
	  {}

  }

  public Knights(int size){
  	rows = size;
  	cols = size;
  	this.size = size;
  	int row,col;

  	// Notice that the board is 4 bigger in both directions with 0's
  	// in the middle and a 2 row/col border of -1.
  	// Why are we doing this?
  	board = new int[cols+4][rows+4];
  	for (row = 0; row < rows+4; row++){
  	    for (col = 0; col < cols+4 ; col++){
  		      board[col][row] = -1;
  	    }
  	}

    for (row = 2; row < rows+2; row++){
  	    for (col = 2; col < cols+2 ; col++){
  		      board[col][row] = 0;
  	    }
  	}
  }

  public String toString(){
  	int row,col;
  	int value;
  	String result = "";

    for (row = 0; row < rows+4; row++){
  	    for (col = 0; col < cols+4; col++){
          value = board[col][row];

      		// Why do we have this if as opposed to
      		// just adding the next value to the string?

          //A: for formatting & even spacing reasons
      		if (value < 10 && value >= 0){
      		    result = result + "0" + value + " "; //changes 1 to 01
          } else {
            result = result + value + " "; //numbers greater than 9 or less than 0 don't change
          }
	       }

      result = result +"\n";
	   }

  return result;
  }

  public boolean solve(int col,int row, int count){

     boolean solved = false; //set the default "solved" value to false
     count++; //increase the count of what step you are at

  	// This should return true when we've solved the problem
  	// What should CHANGETHIS be?
  	// in the maze we knew we were done when we found the exit
  	// here, when do we know when we're done?
  	// HINT: you have an nxn board and are done when you've visited
  	// every board location
  	if (count > rows * cols){ //if you have filled all the spots in the board...
  	    System.out.println(this); //...print out the board because...
        return true;
  	}

  	// this should return false when we're at an illegal location
  	// change CHANGETHIS to the appropriate boolean
  	// HINT: we are tracking our moves in the board
  	// and also built that border of -1 values.
  	if (board[col][row] == -1 || board[col][row] > 0){
      return false; //Tried to visit a spot out of bounds
  	}

    // what do we put into the board
    // Change CHANGETHIS
    board[col][row] = count;

    delay(500);
  	System.out.println(clearScreen+this);

  	// Here we need to do try to do the 8 recursive calls
  	// one for each knight's move.
  	// It should be almost the same as the maze routine except:
  	// 1. The maze had only four calls.
  	// 2. The parameters for the call are a little different.
  	// Add the recursive calls here
    solved = solve(col+1,row+2,count);
    //System.out.println("call 1");

    if (!solved) {
      solved = solve(col+1,row-2,count);
      //System.out.println("call 2");
    }

    if (!solved) {
      solved = solve(col+2,row-1,count);
      //System.out.println("call 3");
    }

    if (!solved) {
      solved = solve(col-2,row-1,count);
      //System.out.println("call 4");
    }

    if (!solved) {
      solved = solve(col-1,row+2,count);
      //System.out.println("call 5");
    }

    if (!solved) {
      solved = solve(col-1,row-2,count);
      //System.out.println("call 6");
    }

    if (!solved) {
      solved = solve(col+2,row+1,count);
      //System.out.println("call 7");
    }

    if (!solved) {
      solved = solve(col-2,row+1,count);
      //System.out.println("call 8");
    }


  	// Here we unset where we were for the backtracking
    // If the board is not yet filled, undo the incorrect moves

    count--;  //backtrack and decrease count by 1
    board[col][row] = 0;

    return solved;

    }
}
