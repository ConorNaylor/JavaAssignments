package casino;



public class Deck {

	private Card[] cards = null; 
	
	/*
	 * public Constructor with arguments.
	 */
	public Deck() {
		int numCards = Card.suits.length * (Card.ranks.length-1);
		this.cards = new Card[numCards];
		int index=0;
		
		for (int suit = 0; suit < Card.suits.length; suit++) { // for each suit
			for (int rank = 1; rank < Card.ranks.length; rank++) { // for each rank
				cards[index] = new Card(suit, rank); // create a new Card Object
				index++;
			} 
		}
	} 

	
	/*
	 * returns a String representation of the array of Card
	 * e.g Ace of Clubs, Two of Clubs, Three of Clubs,..
	 */
	public String toString(){
		
		String out = "";
		for (int i = 0; i < cards.length; i++) {
			out = out+ cards[i] + "\n";
        }
		return out;
	}
	
	
	/*
	 * This method shuffles the deck.
	 * There are many ways to do this
	 * One such way would be to select two random positions in the deck and swap the cards
	 * Then do this a number of times
	 * 
	 */
	public void shuffle(){
		
		for (int i = 0; i< 100; i++){
			int pos1 = (int)(Math.random()*cards.length);
			int pos2 = (int)(Math.random()*cards.length);
			
			Card card1 = cards[pos1];
			Card card2 = cards[pos2];
			cards[pos1] = card2;
			cards[pos2] = card1;	
		}
		
	}
	
		
	/*
	 * This method returns the nth Card in the Deck
	 */
	public Card getCard(int n){
		return this.cards[n];
	}
	
	public Card removeTopCard(){
		Card[] cards2 = new Card[cards.length-1];
		Card card = cards[0]; // top card
		for (int i =0; i <cards2.length;i++){
			cards2[i]=cards[i+1];
		}
		this.cards = cards2;
		return card;
	}
	
}


