import java.io.*;
import java.util.*;

public class Node {

  private int data;
  private Node next;

  public Node() {
    data = 0;
    next = null;
  }//default constructor

  public Node(int value) {

    data = value;
    next = null;
  }//constructor(vale)

  public Node(int value, Node next) {
    data = value;
    this.next = next;
  }//constructor(value, next)

  public void setData(int value) {
    data = value;
  }//setData

  public void setNext(Node n) {
    next = n;
  }//setNext

  public int getValue() {
    return data;
  }//end getValue

  public Node getNext() {
    return next;
  }//getNext

  public void printNodeList(){
    Node s = this;
    while(s != null){
      System.out.println(s);
      s = s.getNext();
    }
  }

}//class Node
