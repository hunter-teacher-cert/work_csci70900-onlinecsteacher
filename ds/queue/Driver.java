public class Driver {

  public static void main(String[] args){

    Queue queue1 = new Queue();
    System.out.println("Size of queue: " + queue1.size());
    queue1.enqueue(123);
    System.out.println("Size of queue: " + queue1.size());
    System.out.println(queue1.front());

    System.out.println(queue1.isEmpty());
  }

}
