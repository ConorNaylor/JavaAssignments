package casino;

public class Hand {
	
	private Card[] cards;
	private int counter = 0;
	public Hand(int n){
	}
	
	
	/*
	 * This method adds a Card to the cards array
	 */
	
	public void addCard(Card card){
		//TODO you need to insert a Card to the array
		//You'll need to have kept track of how many cards have been added already
		//so that you add the card in the right place (i.e. immediately after the last added one)
		//keep track of position of card
		cards[counter] = card;
		counter = counter + 1;
	}
	
	/*
	 * This method prints out the hand
	 * e.g. Ace of Clubs, 3 of Diamonds, Jack of Hearts, etc
	 */
	
	public void show() {
		// TODO Auto-generated method stub
		for(int i = 0; i < counter; i++) {
			System.out.print(cards[i].toString() + ", ");
		}
	}

}
