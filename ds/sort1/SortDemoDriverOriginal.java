import java.io.*;
import java.util.*;

public class SortDemoDriver {
    public static void main(String[] args) {

	SortDemo sd = new SortDemo();
	System.out.println("sd: " + sd);

	SortDemo sd2 = new SortDemo(20);
	System.out.println("sd2: " + sd2 + "\n");


	int i;
	i = sd.findSmallestIndex(0);
	System.out.println("sd[" + i + "] = "+sd.get(i)+" : " + sd);
  System.out.println("What index is 0 at in sd? " + sd.linearSearch(0) + "\n");

	i = sd2.findSmallestIndex(0);
	System.out.println("sd2[" + i + "] = "+sd2.get(i)+" : " + sd2);
  System.out.println("What index is 0 at in sd2? " + sd2.linearSearch(0));

  /* part 2 test lines */


	/* part 3 test lines */

  System.out.println("\n" + sd);
  sd.sort();
  System.out.println("sd(sorted): " + sd);

  System.out.println("\n" + sd2);
  sd2.sort();
  System.out.println("sd2(sorted): " + sd2);

  System.out.println("\nWhat index is 0 at in sd? " + sd.linearSearch(0));
  System.out.println("What index is 0 at in sd2? " + sd2.linearSearch(0));



  }
}
