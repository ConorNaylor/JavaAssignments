package casino;

public class Hand {
	
	private Card[] cards;
	private int index = 0;
	
	public Hand(int n){
		
		this.cards = new Card[n];
		
	}
	
	
	/*
	 * This method adds a Card to the cards array
	 */
	
	public void addCard(Card card){
		
		this.cards[index] = card;
		this.index++;
		
	}
	
	/*
	 * This method prints out the hand
	 * e.g. Ace of Clubs, 3 of Diamonds, Jack of Hearts, etc
	 */
	
	public void show() {
		System.out.print("Hand: ");
		for (int i = 0; i < cards.length; i++) {
			System.out.print(cards[i]);
			System.out.print("; ");
        }
		System.out.println("");
		
	}

}
