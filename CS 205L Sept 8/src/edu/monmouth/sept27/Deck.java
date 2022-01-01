package edu.monmouth.sept27;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Deck {

	private final int NUM_OF_CARDS = 52;
	int cards;
	Card[] deck = new Card[NUM_OF_CARDS];
	public final int MAXRANK = 13, MINRANK = 1, MAXSUIT = 4, MINSUIT = 1;
	
	public Deck() {
		int count = 0;
		for (int value = MINRANK; value <= MAXRANK; value++) {
    		for (int suit = MINSUIT; suit <= MAXSUIT; suit++) {
    			Card card = new Card(value, suit);
    			deck[count] = card;
    			count++;
    	cards = NUM_OF_CARDS;
	}
		

	}
		
	}
	
	public void shuffle() {
		java.util.List<Card> deckList = Arrays.asList(deck);
		Collections.shuffle(deckList);
		deckList.toArray(deck);
	}
	
	public Card draw() throws DeckException {
		int count = 0;
		Random r = new Random(cards);
		Card drawnCard = null;
		boolean done = false;
		while(!done) {
			boolean hasCards = true;
			if(deck[0] != null) {
				hasCards = false;
			}
			if(hasCards == false) {
				throw new DeckException("Out of Cards");
			}
			int rand = r.nextInt(cards);
			drawnCard = deck[rand];
			deck[rand] = null;
			cards--;
			done = true;
			}
		Card[] newDeck = new Card [deck.length-1];
		for (Card card: deck) {
			if (card !=null) {
				card = newDeck[count];
				count++;
			}
			deck = newDeck;
		}
		return drawnCard;
		}
	
	public Card[] deal(int cardsToDeal) throws DeckException {
		Card[] playerHand = new Card[cardsToDeal];
		for (int i = 0; i < cardsToDeal; i++) {
			playerHand[i] = draw();
		}
		return playerHand;
	}
	
	public int cardsLeft() {
		return cards;
	}
	
	public String printReverse() {
		
	}

	@Override
	public String toString() {
		return deck.toString();
	}
	

}
