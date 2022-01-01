package edu.monmouth.sept27;


public class DeckOfCards {

	public static void main (String[] args) {
		int cardsToDeal = 0;
		try {
			String test = args[0];
		} catch (ArrayIndexOutOfBoundsException e){
			System.err.println("Out of Bounds: " + e.getMessage());
			System.exit(DeckOfCardsConstants.BADINT);
		}
		
		cardsToDeal = Integer.parseInt(args[0]);
		Deck cards = new Deck();
		
		try {
			Card player1Hand[] = cards.deal(cardsToDeal);
		
		} catch (DeckException e) {
			System.err.println("Cannot deal " + e);
			e.printStackTrace();
		}
		Card[] player1 = new Card[cardsToDeal];
		Card[] player2 = new Card[cardsToDeal];
		Card[] player3 = new Card[cardsToDeal];
		Card[] player4 = new Card[cardsToDeal];
		player1 = cards.deal(cardsToDeal);
		player2 = cards.deal(cardsToDeal);
		player3 = cards.deal(cardsToDeal);
		player4 = cards.deal(cardsToDeal);

		System.out.println(player1);
		System.out.println(player2);
		System.out.println(player3);
		System.out.println(player4);
		
		System.out.println(cards);
	}
}
