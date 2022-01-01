package edu.monmouth.cardList;

import edu.monmouth.card.*;

public class ListCardNode {
	  private CardNode head; 
	  private CardNode tail;

	  public ListCardNode() {
	    head = null;
	    tail = null;
	  }
	  
	  public CardNode remove(Card searchValue) { 
		CardNode searchNode = head;
		boolean found = false;
		while(!found) {
			while (searchNode != null) {
				if(searchNode.getInfo().equals(searchValue)) {
					searchNode.getNext().setPrevious(searchNode.getPrevious());
					searchNode.setNext(searchNode.getNext());
					return searchNode;
				}
			}
		}
		return null;
	  }
	  
	 public CardNode insertAfter(Card searchValue, Card element) { 
		CardNode searchNode = head;
		boolean found = false;
		while(!found) {
			while (searchNode != null) {
				if(searchNode.getInfo().equals(searchValue)) {
					CardNode newNode = new CardNode(element);
					newNode.setNext(searchNode.getNext());
					searchNode.setNext(newNode);
					newNode.setPrevious(searchNode);
					searchNode.getNext().setPrevious(newNode);
					found = true;
					return newNode;
				}
				else {
				searchNode = searchNode.getNext();
				}
			}
		}
		return null;
	}
	 

	  public void insert(Card element) {
		  CardNode newNode = new CardNode(element); 
		    newNode.setNext(head); 
		    newNode.setPrevious(null);
		    if (tail == null) {
		    	setTail(newNode);
		    }
		    if (head != null) {
		        head.setPrevious(newNode);
		    }
		    head = newNode;
	  }
	  
	  public void uniqueInsert(Card element) {
		  CardNode newNode = new CardNode(element);
		  if(howMany(element) == 0) {
			  newNode.setNext(head); 
			  newNode.setPrevious(null);
			  if (tail == null) {
			    	setTail(newNode);
			    }
			  if (head != null) {
			        head.setPrevious(newNode);
			    }
			  head = newNode;
		  }
	  }

	  public void insertEnd(Card element) {
		  CardNode newNode = new CardNode(element);
		  if (tail != null) {
			  newNode.setNext(null);
			  newNode.setPrevious(tail);
		  }
		  tail = newNode;
		  
	} 

	  public boolean isEmpty() {              
	    return head==null;
	  }
	  
	  public int size() {
	    int count = 0;
	    CardNode node;
	    node = head;
	    while (node != null) {
	      count++;
	      node = node.getNext();
	    }
	    return count;
	  }
	  
	  public int howMany(Card card) {
		  CardNode node = head;
		  int count = 0;
		  while(node != null) {
			  if (node.getInfo().equals(card)) {
				  count++;
			  }
			  node = node.getNext();
		  }
		  return count;
	  }
	  
	  public void clear() {
	    head = null;
	  }
	  
	  public void setTail(CardNode tail) {
			 this.tail = tail;
		 }
		 
	  public CardNode getTail() {
			 return tail;
		 }

	@Override
	  public String toString() {
		StringBuilder logString = new StringBuilder();
	    CardNode node;
	    node = head;
	    
	    while (node != null) {
	      logString.append(node.getInfo().toString() + "\n");
	      node = node.getNext();
	    }
	    return logString.toString();
	  }

	public String printReverse() {
		StringBuilder stringB = new StringBuilder();
		CardNode node;
		node = getTail();
		
		while (node != null) {
			stringB.append(node.getInfo().toString() + "\n");
			node = node.getPrevious();
		}
		return stringB.toString();
	}
}
