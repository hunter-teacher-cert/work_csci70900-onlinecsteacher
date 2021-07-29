import java.io.*;
import java.util.*;

public class Driver{

  public static void main(String[] args) {

    //Initialize a new Mode using the default constructor
    Mode m = new Mode();

    System.out.println("Print out mode m: ");
  	System.out.println(m);

    System.out.println("Test findSmallestValue():");
    System.out.println(m.findSmallestValue());

    System.out.println("Test frequency(0):");
    System.out.println(m.frequency(0));

    System.out.println("Test frequency(1):");
    System.out.println(m.frequency(1));

    System.out.println("Test frequency(2):");
    System.out.println(m.frequency(2));

    System.out.println("Test calcMode():");
    System.out.println(m.calcMode());

    System.out.println("Test calcModeOriginal():");
    System.out.println(m.calcModeOriginal());

    System.out.println("Test fastMode():");
    System.out.println(m.fastMode());

/*
------------------------------------------------------
Test timing
*/

    long start, elapsed;
    int size;

    size = 200000;
    // SortDemo sds = new SortDemo(size);
    // start = System.currentTimeMillis();
    // sds.sort();
    // elapsed = System.currentTimeMillis() - start;
    // System.out.println("Selection on size " + size + " : " + elapsed);

/*
    Mode mode2 = new Mode(size);
    start = System.currentTimeMillis();
    //mode2.findSmallestValue();
    mode2.calcMode();
    elapsed = System.currentTimeMillis() - start;
    //System.out.println("Find smallest value on size " + size + " : " + elapsed);
    System.out.println("Calculate mode on size " + size + " : " + elapsed);

    Mode mode3 = new Mode(size);
    start = System.currentTimeMillis();
    //mode3.findSmallestValue();
    mode3.calcModeOriginal();
    elapsed = System.currentTimeMillis() - start;
    //System.out.println("Find smallest value (additional loop) on size " + size + " : " + elapsed);
    System.out.println("Calculate mode on size " + size + " : " + elapsed);

  */
  }

}
