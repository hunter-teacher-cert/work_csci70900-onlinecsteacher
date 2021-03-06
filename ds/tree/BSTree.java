import java.io.*;
import java.util.*;

public class BSTree {
  private TreeNode root;

  public BSTree(){
    root = null;
  }

  public void delete(int key){

    // if the tree is empty, nothing to delete
    if (root==null){
      return;
    }

    // find the node that we want to delete
    // and the node above it using piggybacking
    TreeNode front = root;
    TreeNode trailer = root;

    // do the piggyback loop
    // until we either find the node or
    // find null if the key isn't present
    while (front != null && front.getData() != key ){
      if (front.getData() < key){
        trailer = front;
        front = front.getRight();
      } else {
        trailer = front;
        front = front.getLeft();
      }
    }

    // if the key wasn't in the tree
    if (front == null){
      return;
    }

    // if we get here
    // front points to the node we want to delete
    // and trailer points to the one above it

    // case 1 -- the node we want to delete is a leaf
    if (front.getLeft() == null &&
    front.getRight() == null) {
      //System.out.println("no children");
      // repoint front's parent to null...
      if (key > trailer.getData()){
        trailer.setRight(null); //...on the right side
      } else {
        trailer.setLeft(null); //...on the left side
      }

      /* check to see if front has one child */
      //Node has one child on the left
    } else if (front.getLeft() != null && front.getRight() == null) {
      //System.out.println("one child on left");
      trailer.setLeft(front.getLeft());

      //Node has one child on the right
    } else if (front.getLeft() == null && front.getRight() != null) {
      //System.out.println("one child on right");
      trailer.setRight(front.getRight());
    }
      // repoint front's parent to front's child
    else {
    System.out.println("2 children");
      // front has two children

      //Create a temporary Node
      TreeNode temp = new TreeNode();

      // find the node with the largest value on fronts left subtree
      // and replace front with it.
      //i.e. go left once and go as far right as possible
      front = front.getLeft();
      while (front.getRight() != null){ //while a right node exists
        front = front.getRight(); //keep processing right node
        System.out.println("looped");
      }


      System.out.println(front.getData());
      //then connect the trailer to the new front Node
      if(front.getData() < trailer.getData())
      { //if key is to the left of trailer
        front.setRight(trailer.getLeft().getRight());

        //If the node being deleted has a child on the left,
        if (trailer.getLeft().getLeft().getLeft() != null) {
          //Point the new parent node to that child
          front.setLeft(trailer.getLeft().getLeft());

          //The node before the new front node now points to null
          front.getLeft().setRight(null);
        }

        //Point trailer to the new node
        trailer.setLeft(front);

        // System.out.println("Key to the left of trailer");
        // System.out.println(front.getData());
      }
      else
      { //if key is to the right of trailer
        front.setLeft(trailer.getRight().getLeft());

        //If the node being deleted has a child on the right,
        if (front.getRight() != null) { //change to temp trailer
          //Point the new parent node to that child
          front.setRight(trailer.getRight().getRight());

          //The node before the new front node now points to null
          front.getLeft().setRight(null);
        }

        //Point trailer to the new node
        trailer.setRight(front);

        // System.out.println("Key to the right of trailer");
        // System.out.println(front.getData());
      }

      //have the new front node point to what the old node pointed to
      //on the left and the right

    }

  }

  private void preorderTraverse(TreeNode current){
    if (current == null)
    return;

    //process the current node
    System.out.print(current.getData()+", ");

    // recursively print out the left subtree
    preorderTraverse(current.getLeft());

    // recursively print out the right subtree
    preorderTraverse(current.getRight());
  }

  public void preorderTraverse(){
    preorderTraverse(root);
    System.out.println();
  }

  private void postorderTraverse(TreeNode current){
    if (current == null)
    return;

    // recursively print out the left subtree
    postorderTraverse(current.getLeft());

    // recursively print out the right subtree
    postorderTraverse(current.getRight());

    //process the current node
    System.out.print(current.getData()+", ");

  }

  public void postorderTraverse(){
    postorderTraverse(root);
    System.out.println();
  }

  private void inorderTraverse(TreeNode current){
    if (current == null)
    return;


    // recursively print out the left subtree
    inorderTraverse(current.getLeft());

    //process the current node
    System.out.print(current.getData()+", ");

    // recursively print out the right subtree
    inorderTraverse(current.getRight());
  }

  public void inorderTraverse(){
    inorderTraverse(root);
    System.out.println();
  }


  public void insert(int key){

    TreeNode newNode = new TreeNode(key);

    // if the tree is empty
    // manually insert the new node as the root
    if (root == null){
      root = newNode;
      return;
    }

    TreeNode front = root;
    TreeNode trailer = null;

    while (front != null){
      int frontValue = front.getData();
      if (frontValue == key){
        // if we're here, it means the key is
        // already in the tree so we can
        // update this node in some way
        // and then return
        return;
      } else if (frontValue < key){
        trailer = front;
        front = front.getRight();
      } else {
        trailer = front;
        front = front.getLeft();
      }
    }
    if (key > trailer.getData()){
      // insert on the right
      trailer.setRight(newNode);
    } else {
      // insert on left
      trailer.setLeft(newNode);
    }
  }


  public int search(int key){
    TreeNode current = root;

    while (current != null){

      int currentValue = current.getData();

      if (current.getData() == key){ //current value is equal to key value
        currentValue = current.getData();
        return currentValue;
      }
      else if (currentValue < key){ //current value is less than key, move right
        current = current.getRight();
      }
      else if (currentValue > key){ //current value is greater than key, move left
        current = current.getLeft();
      }
    }
    //Return -1 if key not found in tree
    return -1;
  }

  public void seed(){
    TreeNode t;

    t = new TreeNode(10);
    root = t;
    t = new TreeNode(5);
    root.setLeft(t);
    t = new TreeNode(20);
    root.setRight(t);

    root.getLeft().setRight( new TreeNode(8));

    t = new TreeNode(15);
    root.getRight().setLeft(t);

    t = new TreeNode(22);
    root.getRight().setRight(t);

  }


}
