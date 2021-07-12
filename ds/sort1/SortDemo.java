import java.io.*;
import java.util.*;
/*
Setup:
 1.Make a folder under your work repo named: ds
 2. Make another folder under that named sort1
 3. Copy this file and SortDemoDriver.java into the ds/sort1 folder
Lab:
Part 1:
  1. Analyze the two constructors - try to figure out how they work.
  2. Compile and run the program (SortDemoDriver.java and SortDemo.java) and confirm
   the behavior of the constructors.
Part 2:
  1. Read the description of findSmallestIndex and complete the method.
  2. Uncomment the lines in SortDemoDriver to test.
Part 3:
  1. Complete the sort method - read comments for description
  2. Uncomment the lines in sortDemoDriver to test.
*/
//ArrayList is a built in class (we built superArray which is an example of an ArrayList)
//with methods to add, remove, etc.
public class SortDemo{

  /* Instance Variables */
  private ArrayList<Integer> data;  // to store the data
  private Random r;

  //SortDemo default constructor
  //Generates and stores in an ArrayList 15 random integers that are between 0 and 19
  public SortDemo(){
    data = new ArrayList<Integer>();
    r = new Random(); //r is a variable that will store a number of type "Random"

    for (int i=0;i<15;i++){ //generate 15 integers
        data.add(r.nextInt(20)); //generate a random number from 0-19
      }
  }

  //SortDemo constructor with parameters
  //Generates and stores in an ArrayList "size" number of random integers that are between 0 and 19
  public SortDemo(int size){
    data = new ArrayList<Integer>();
    r = new Random();

    for (int i=0;i<size;i++){
        data.add(r.nextInt(20));
      }
  }

  //get() method returns the value at a given index
  public int get(int index){
    return this.data.get(index);
  }

  /*
    return the index of the ArrayList data from index start to the end
    Example, if the arraylist has:
    5,3,10,6,8
    if start was 2 (start at index 2, value 10) then it woudl return 3 which is the index of the value
    6 which is the index with the smallest value from start to end
  */
  //What is the smallest value in this array and
  //return the index of that value;

  public int findSmallestIndex(int start){
    int smallIndex = start;
    int i; // start a variable at the one after start

    // loop from that variable to end and update smallIndex as needed
    for (i = smallIndex + 1; i < this.data.size(); i++){

      //compare value at smallIndex to current value
      //if the current value is smaller, store that value's index as the new smallIndex
      if (this.data.get(i) < this.data.get(smallIndex)){
        smallIndex = i;
      }
    } return smallIndex;
  }

  //sort() method calls SmallestIndex
  //For example, swap 5 and 3 but need to store 3 in integer temp
  public void sort(){

    int i;
    int temp; //Create a temp variable to store the value being swapped

    //Iterate through the data array to sort all values by swapping
    for (i = 0; i < data.size() - 1; i++){

      int j = findSmallestIndex(i);  // find the smallest index from i to end

      //Swap the item at that index and i
      temp = this.data.get(j); //set temp to value at smallest index
      this.data.set(j,this.data.get(i)); //set value at smallest index to value at i
      this.data.set(i,temp); //set value at i to the value stored in temp
      //System.out.println(this.data.toString()); test how sort() works
    }
  }
  /* If you finish the lab early you can get started on this */
  public int linearSearch(int value){

    // Loop through the ArrayList data
    for (int i = 0; i < data.size(); i++){

      //If the value you're searching for is in the ArrayList...
      if(this.data.get(i) == value){
        return i;  //...return the index
      }
    }
    return -1; // return -1 if it isn't there.
  }

  /* If you finish the lab early you can get started on this */
  public int binarySearch(int value){
    int lowerIndex = 0;
    int upperIndex = data.size();
    int middleIndex = data.size()/2;
    /* if upper crosses lower it's not there and the lop should exit the loop
      and if the item is at middle you should exit the loop
            you have to replace the "replacethiswithrealexpression" boolean
            with a correct expression based on lowerIndex and upperIndex
    */
    // update lower and upper.
      // remember if value is less than data.get(middleIndex) you want to search next time
      // from lower to the middle and otherwise from the middle to the upper.
      //
      // then update middleIndex based on new lowerIndex and upperIndex.
      /* replace this return to either return the value if it was found and -1
      if upperIndex and lowerIndex crossed
    */
    while (lowerIndex <= upperIndex) {
      if (value < this.data.get(middleIndex)){
        upperIndex = middleIndex -1;
        middleIndex = (lowerIndex+upperIndex)/2;
      }
      else
        if (value > this.data.get(middleIndex)){
           lowerIndex = middleIndex +1;
           middleIndex = (lowerIndex+upperIndex)/2;
        }
        else {
          return middleIndex;
        }
      }
    return -1; // replace this return
  }

  public String toString(){
    return ""+data;
  };
}
