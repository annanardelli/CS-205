package edu.monmouth.cardList;

import edu.monmouth.card.*;

public class CardNode 
{
	private Card info;
	private CardNode next, previous;
  
  public CardNode(Card info) {
    this.info = info;
    next = previous = null;
  }
 
  public CardNode getNext() {
	return next;
}

public void setNext(CardNode next) {
	this.next = next;
}

public void setInfo(Card info) {
    this.info = info;
  }

  public Card getInfo() {
    return info;
  }

  public void setPrevious(CardNode link) {
	    this.previous = link;
  }

 public CardNode getPrevious() {
	    return previous;
 }

}
	