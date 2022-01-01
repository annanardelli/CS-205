package edu.monmouth.card;

public class Card {
		private Suit suit;
		private Rank rank;
	  
	  public Card(Rank rank, Suit suit) {
		  super();
			this.rank = rank;
			this.suit = suit;  
	  }
			  
	public Rank getRank() {
		return rank;
	}

	public void setRank(Rank rank) {
		this.rank = rank;
	}

	public Suit getSuit() {
		return suit;
	}

	public void setSuit(Suit suit) {
		this.suit = suit;
	}

	@Override
	public boolean equals(Object other) {
		if (other == null) {
			return false;
		}
		if (!(other instanceof Card)) {
			return false;
		}
		Card otherCard = (Card)other;
		return otherCard.rank == this.rank &&
				otherCard.suit == this.suit;
	}

	@Override
	public String toString() {
		return "Card [rank=" + rank + ", suit=" + suit + "]";
	}

}