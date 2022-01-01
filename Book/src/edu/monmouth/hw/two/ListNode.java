package edu.monmouth.hw.two;

import edu.monmouth.book.*;

public class ListNode {

  private Node head; 

  public ListNode() {
    head = null;
  }
  
  public Node removeFirst() {
	  if (isEmpty()) {
		 return null;
	  }
	  
	  Node first = head;
	  head = head.getNext();
	return first;
  }
  
  
  public Node first() {
	return head;
  }
  
  public Node last() {
	   Node current = head;
	   Node next = null;
	   while (current.getNext() != null) {
		   current = current.getNext();
		   next = current.getNext();
	   }
	   
	return current; 
  }

  public void insert(Book book) {
    Node newNode = new Node(book);
    newNode.setNext(head);
    head = newNode;
  }

  public void insertEnd(Book book) {
	Node last = last();
	Node newNode = new Node(book);
	last.setNext(newNode);
	return; 
}

 public boolean isEmpty() { 
	if (head == null) {
		return true;
	}
	return false;              
  }
  
  public int size() {
	  if (isEmpty()) {
		  return HW2Constants.ZERO;
	  }
	  else {
		  Node current = head;
		  Node next;
		  int size = 1;
		    
		    while (current.getNext() != null) {
		    	current = current.getNext();
		    	next = current.getNext();
		    	size++;
		    }
		    return size;
	  }
    
  }
    
  public void clear() {
    head = null;
  }

@Override
  public String toString() {
	StringBuilder logString = new StringBuilder();
    Node node;
    node = head;
    int count = 0;
    
    while (node != null) {
      count++;
      logString.append(count + " . " + node.getInfo() + "\n");
      node = node.getNext();
    }
    return logString.toString();
  }
}