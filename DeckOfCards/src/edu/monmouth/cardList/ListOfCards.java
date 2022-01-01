package edu.monmouth.cardList;

import edu.monmouth.card.*;

public class ListOfCards {

	public static void main(String[] args) {
		// verify constructor, toString and insert
		ListCardNode fullList = new ListCardNode();
		for (Rank rank : Rank.values()) { 
			for (Suit suit : Suit.values()) { 
				fullList.insert(new Card(rank, suit));
			}
		}
		System.out.println(fullList);
		
		// new list to verify new methods
		ListCardNode list = new ListCardNode();
		System.out.println("List in reverse: " + list.printReverse());
		list.insert(new Card(Rank.ACE, Suit.CLUB));
		list.insert(new Card(Rank.KING, Suit.CLUB));
		list.insert(new Card(Rank.JACK, Suit.SPADE));
		list.insert(new Card(Rank.ACE, Suit.HEART));
		System.out.println("List after 4 cards: " + list);
		System.out.println("List in reverse: " + list.printReverse());
		
		list.insertAfter(new Card(Rank.JACK, Suit.SPADE), new Card(Rank.THREE, Suit.HEART));
		System.out.println("List after card added: " + list);
	
		list.insertEnd(new Card(Rank.FIVE, Suit.SPADE));
		System.out.println("List after card added at end: " + list);
		
		System.out.println("List with unique Insert:");
		list.uniqueInsert(new Card(Rank.FOUR, Suit.SPADE));
		System.out.println(list.printReverse());
		// System.out.println(list.getTail());
		// System.out.println(list.printReverse());
	}

}