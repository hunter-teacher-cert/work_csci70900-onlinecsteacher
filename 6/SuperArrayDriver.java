//Emma
//Peter
//Michele

import java.io.*;
import java.util.*;

public class SuperArrayDriver
{
  public static void main( String[] args )
  {

    System.out.println("Testing default constructor.");
    SuperArray sa = new SuperArray(); //creates empty data with 10 indexes array within super array
    System.out.println("Testing empty print:");
    System.out.println(sa);

    System.out.println("\nTesting custom constructor:");
    SuperArray sa2 = new SuperArray(40);
    System.out.println(sa2);

    // YOUR HOMEGROWN/HOUSEMADE/ROLL-YOUR-OWN TEST METHODS HERE...

    System.out.println("\nTesting isEmpty (should be true)");
    System.out.println("Is sa empty? " + sa.isEmpty());
    System.out.println("Is sa2 empty? " + sa2.isEmpty());

    System.out.println("\nTesting toString:");
    System.out.println(sa.toString());


    //precondition: newly-instantiated SuperArray of default capacity
    System.out.println("\nTesting calling add():");
    for (int i=3; i<8; i++) {
      sa.add(i);
    }//for i

    //Print out the new sa SuperArray and check that it is not empty
    System.out.println(sa);
    System.out.println("Is sa empty? " + sa.isEmpty());

    //Test out get() method
    System.out.println("\nTesting get() at given index:");
    System.out.println("Value at sa.data[0] = " + sa.get(0));
    System.out.println("Value at sa.data[1] = " + sa.get(1));

    //Testing out add() at specified indexes
    System.out.println("\nTesting add at index 5, 0 and 17(end)");
    System.out.println(sa);
    sa.add(5, 100);
    System.out.println(sa);
    sa.add(0, 100);
    System.out.println(sa);
    // sa.add(17, 100);
    //System.out.println(sa);

    System.out.println("\nTesting remove at 0, 5, and 15 (end)");
    sa.remove(0);
    System.out.println(sa);
    sa.remove(5);
    System.out.println(sa);
    //sa.remove(15);
    //System.out.println(sa);

  /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    //precondition: newly-instantiated SuperArray of default capacity
    System.out.println("Testing overfill (calling grow() in add)");
    for (int i=0; i<15; i++) {
      sa.add(i);
    }//for i

    System.out.println(sa);
    System.out.println(sa.isEmpty());

    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/

  }//main

}//class SuperArrayDriver
