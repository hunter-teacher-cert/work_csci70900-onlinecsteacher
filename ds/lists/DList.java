public class DList{

  //Create a new class DList which would be a doubly linked list
  //That is, you have a next and a previous Node reference.
      Node head; // head of list

      /* Doubly Linked list Node*/
      class Node {
          int data;
          Node prev;
          Node next;

          // Constructor to create a new node
          // next and prev is by default initialized as null
          Node(int d) { data = d; }
      }
  }
