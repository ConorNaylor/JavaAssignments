package casino;

public class Dealer {
	
	private Deck deck;
	

	public static void main(String[] args) {
	
		int cards_In_Hand = Integer.parseInt(args[0]); // number of card in each hand
		int numHands = Integer.parseInt(args[1]);  // number of hands
		
		Hand[] hands = new Hand[numHands]; // create an array to hold the number of hands required
		
		Dealer dealer = new Dealer(); // new Dealer object
		dealer.newDeck(); // creates a new Deck
		dealer.shuffle(); // then shuffles the Deck
		
		
		for (int i = 0; i< hands.length; i++){ // for the number of hands required
			Hand hand = dealer.deal(cards_In_Hand); // create a new  hand
			hands[i]=hand; // store each hand in the array
		}
		
		
		for (int i = 0; i< hands.length; i++){ // for each of the hands
			hands[i].show(); // print out the cards in each hand
		}
		
	}

	
	/*
	 * This method removes n cards from the top of the deck and inserts them one by one into a new Hand object
	 * which is then returned
	 * 
	 */

	public Hand deal(int n) {
		// TODO write the code to deal out n cards from the deck
		// You will need to create a Hand object and add these cards to it.
		return null;
	}


	/*
	 * This method calls the shuffle method of the deck object
	 * 
	 */
	
	public void shuffle() {
		deck.shuffle();

	}

	
	/*
	 * This method creates a new Deck object and assigns it to the variable deck
	 */

	public void newDeck() {
		deck= new Deck();
		
	}

}
