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

  private Node head;    //head Node
  private Node tail;    //tail Node
  private int size = 0; //size of queue

  //default constructor method
  public Queue(){
   head = null;
   tail = null;
  }

  // Add value to the end of the queue
  public void enqueue(int value) {

    // make the new node
    Node n = new Node(value);

    // If this is the first node in the queue set it to the head
    if (head == null){

      //Set head and tail to new node n
      head = n;
      tail = n;

    } //Else if it's not the first node in the queue, update the tail
    else
    {

      // Else set the tail to point to the new Node
      tail.setNext(n);

      //Set the new node to be the new tail
      tail = n;

    }

    //increment size variable
    size++;
  }

  // Remove and return the value at the front of the queue
  public int dequeue() {

    //If queue is empty, print a warning and return
    if (size == 0) {
      throw new NullPointerException();
    }

    //Find the value at the front
    int value = head.getValue();

    // Point head to the next value
    head = head.getNext();

    //Decrement size variable
    size--;

    // Return front value
    return value;
  }

  // Return but don't remove the value at the front
  public int front() {

    //If front() is called on an empty queue throw an exception
    if (head == null) {
      throw new NullPointerException();
    }

    int value = head.getValue(); //find the value at the front
    return value;
  }

  // Returns true if the queue is empty
  public boolean isEmpty() {
    if (head == null) { //if the head node is empty...
      return true;      //...return true
    } else {
      return false;     //...else return false
    }
  }

  // Returns the number of items in the queue
  public int size() {
    return size;
  }
}
