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

public class SortDemo{

  /* Instance Variables */
  private ArrayList<Integer> data;  // to store the data

  private Random r;


  public SortDemo(){
  	data = new ArrayList<Integer>();
  	r = new Random();
  	for (int i=0;i<15;i++){
  	    data.add(r.nextInt(20));
  	}
  }

  public SortDemo(int size){
  	data = new ArrayList<Integer>();
  	r = new Random();
  	for (int i=0;i<size;i++){
  	    data.add(r.nextInt(20));
  	}
  }

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
  public int findSmallestIndex(int start){
	   int smallIndex = start;

	// start a variable at the one after start
	// your code here

	// loop from that variable to end and update smallIndex as needed
	// your code here
  	int i;
  	for (i = smallIndex + 1; i < this.data.size(); i++){
      if (this.data.get(i) < this.data.get(smallIndex)){
  		      smallIndex = i;
  	   }
  	}
	 return smallIndex;
  }


  public void sort(){
  	int i;
  	int smallIndex;
  	int tmp;
  	for (i=0;i < data.size()-1; i++){
  	    smallIndex = findSmallestIndex(i);
  	    tmp = data.get(smallIndex);
  	    data.set(smallIndex,data.get(i));
  	    data.set(i,tmp);
  	}
    }



    /* If you finish the lab early you can get started on this */
    public int linearSearch(int value){


	     return 0; // replace this return
	   }

	/* If you finish the lab early you can get started on this */
	public int binarySearch(int value){
	    return 0;

	}


    public String toString(){
	return ""+data;
    };

    /*------------------------- MERGESORT STUFF -----------------*/


    // Preconditions: a and b are ArrayLists of Integers and
    //                both are in increasing order
    // Return: a new ArrayList of Integers that is the result
    //         of merging a and b. The new ArrayList
    //         should be in increasing order
    private ArrayList<Integer> merge(ArrayList<Integer> a,
				     ArrayList<Integer> b){

        //Initialize variables to store the index of ArrayList a and ArrayList b
        int indexA = 0;
        int indexB = 0;

        //Make a new ArrayList<Integer> of size a.size + b.size to return
        ArrayList<Integer> sorted = new ArrayList<Integer>();

        //Iterate through the two arrays to merge them

        //Testing to see if either ArrayList is already full.
        //If so, add the next remaining element to the ArrayList
        //and increment that ArrayList's counter.
//while (!(indexA>19 && indexB>19))
        for (int i = 0 ; i < (a.size()+b.size()) ; i=i+1){

          if (indexA > 19)
          {
            sorted.add(b.get(indexB)); //add to ArrayList sorted, the value in ArrayList b
            indexB++; //increment the index in ArrayList b
          }
          else if (indexB > 19)
          {
            sorted.add(a.get(indexA)); //add to ArrayList sorted, the value in ArrayList a
            indexA++; //increment the index in ArrayList a
          }

          //Else both lists have at least one space, and the values can be compared, and the element can be added, and the index can be incremented.
          else
          {
            //If the element in ArrayList a is greater than
            //the element in ArrayList b...
            if (a.get(indexA) > b.get(indexB)){

              sorted.add(b.get(indexB)); //add to ArrayList sorted, the value in ArrayList b
              indexB++; //increment the index in ArrayList b
            }

            //If the element in ArrayList b is greater than
            //the element in ArrayList a...
            else if (a.get(indexA) < b.get(indexB)){
              sorted.add(a.get(indexA)); //add to ArrayList sorted, the value in ArrayList a
              indexA++; //increment the index in ArrayList a
            }

            //If the elements in the 2 ArrayLists are equal...
            else if (a.get(indexA) == b.get(indexB)){
              sorted.add(a.get(indexA)); //add to ArrayList sorted, the value in ArrayList a
              indexA++; //increment the index in ArrayList a
              // sorted.add(b.get(indexB));
              // indexB++;
              // i++;
            }
          }
        }//end of for loop



        //Have pointers to look at each index in ArrayList a and ArrayList B
        return sorted;
    }

  private ArrayList<Integer> fillForMerge(int size){
  	ArrayList<Integer> a = new ArrayList<Integer>();
  	int lastVal = r.nextInt(10);
  	for (int i = 0 ; i < size ; i=i+1){
  	    a.add(lastVal);
  	    lastVal = lastVal + r.nextInt(10);
  	}
	return a;

  }

  public void testMerge(){

  	ArrayList<Integer> a = new ArrayList<Integer>();
  	ArrayList<Integer> b = new ArrayList<Integer>();
  	a = fillForMerge(20);
  	b = fillForMerge(20);
  	System.out.println(a);
  	System.out.println(b);

    //Call merge method
    System.out.println(merge(a,b));

    }
}
