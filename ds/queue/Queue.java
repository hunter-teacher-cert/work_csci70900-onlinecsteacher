/*
Queue Folder: ds/queue

Create a class that represents a queue.
This class should use a linked list that you build (not the built in Java class)
with at least two pointers. Your class should implement the following methods:

constructor(s)
enqueue(value) <-- add value to the end of the queue
x = dequeue() <-- remove and return the value at the front of the queue
x = front() <-- return but don't remove the value at the front
isEmpty() <-- returns true if the queue is empty
size() <-- returns the number of items in the queue
*/

//Create a public class for Queue, called from Driver
public class Queue {

  //Create a private Node class within queue
  private class Node {

    private int data;
    private Node next;

    public Node() {
      int data;
      next = null;
    }//default constructor

    public Node(int value) {
      data = value;
      next = null;
    }//constructor(value)

    /*
    public Node(int value, Node next) {
    data = value;
    this.next = next;
  }//constructor(value, next)
  */

    public int getValue() {
      return data;
    }//end getValue
  }


private Node head;    //head Node
private Node tail;    //tail Node
private int size = 0; //size of queue

// Add value to the end of the queue
public void enqueue(int value) {

  // make the new node
  Node n = new Node(value);

  // If this is the first node in the queue set it to the head
  if (head == null){
    head = n;
  } else {
    // Else set the new node as the tail
    tail = n;
  }

  //increment size variable
  size++;

}

// Remove and return the value at the front of the queue
public int dequeue() {
  return 0;
}

// Return but don't remove the value at the front
public int front() {
  int value = head.getValue(); //find the value at the front
  return value;
}

// Returns true if the queue is empty
public boolean isEmpty() {
  return true;
}

// Returns the number of items in the queue
public int size() {
  return size;
}

}
