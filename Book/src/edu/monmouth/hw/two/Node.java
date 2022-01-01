package edu.monmouth.hw.two;

import edu.monmouth.book.*;

public class Node 
{
  /* change this attribute to store a reference to a Book */
	private Book book;
	private Node next;
  
  /* change this constructor so it accepts a reference to a Book */
  public Node(Book book) {
    this.book = book;
    next = null;
  }
 
  /* change this method so it accepts a reference to  Book */
  public void setInfo(Book book) {
    this.book = book;
  }

  /* change this method so it returns a reference to a Book */
  public Book getInfo() {
    return book;
  }

  public void setNext(Node link) {
    this.next = link;
  }

  public Node getNext() {
    return next;
  }
  
  @Override 
  public String toString() {
	  /* change to invoke Book's toString */
	  return book.toString();
  }
}