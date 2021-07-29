public class Driver {

  public static void main(String[] args){

    //Create a new object of Queue class, called queue1
    System.out.println("Create queue1:");
    Queue queue1 = new Queue();

    //Check is queue2 is empty
    System.out.println("Queue 1 is empty: " + queue1.isEmpty()); //returns true

    //Check size of queue after initializing
    System.out.println("Size of queue: " + queue1.size()); //returns 0

    //Add values to the queue
    queue1.enqueue(4);
    queue1.enqueue(5);
    queue1.enqueue(6);
    queue1.enqueue(7);
    queue1.enqueue(8);

    System.out.println("Size of queue: " + queue1.size()); //returns 5

    //Check front() method
    System.out.println("Front value in queue: " + queue1.front());

    //Check is queue2 is empty
    System.out.println("Queue 1 is empty: " + queue1.isEmpty()); //returns false

    //Check dequeue() method
    System.out.println("Take from front of queue: " + queue1.dequeue());
    System.out.println("Take from front of queue: " + queue1.dequeue());
    System.out.println("Take from front of queue: " + queue1.dequeue());
    System.out.println("Take from front of queue: " + queue1.dequeue());
    System.out.println("Take from front of queue: " + queue1.dequeue());
    queue1.dequeue();
    queue1.dequeue();


    //Create a new object of Queue class, called queue2
    System.out.println("\nCreate queue2:");
    Queue queue2 = new Queue();

    //Check size of queue after initializing
    System.out.println("Size of queue: " + queue2.size()); //returns 0

    //Check is queue2 is empty
    System.out.println("Queue 2 is empty: " + queue2.isEmpty()); //returns true

    //Check dequeue() method on empty queue
    queue1.dequeue();
  }
}
