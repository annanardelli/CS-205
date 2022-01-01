package edu.monmouth.sept27;

public class Card {
	
	private int rank, suit;
	public final int MAXRANK = 13, MINRANK = 1, MAXSUIT = 4, MINSUIT = 1;

	public Card(int rank, int suit) {
		this.rank = rank;
		this.suit = suit;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public int getSuit() {
		return suit;
	}

	public void setSuit(int suit) {
		this.suit = suit;
	}
	
	public String toString() {
		return rank + " of " + suit;
	}
}
