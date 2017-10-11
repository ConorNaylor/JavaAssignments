package casino;



public class Deck {

	private Card[] cards = null; 
	private int counter = 0;
	/*
	 * public Constructor with arguments.
	 */
	public Deck() {
		//TODO initialise the cards array (size 52)
		//then insert a new unique (and valid) Card for each of the array slots
		//Your deck can't include duplicates
		for(int s = 0; s < 4; s++ ){
			for (int r = 0; r < 13; r++){
				cards[counter] = new Card(s, r);
				counter ++;
			}
		}
	} 

	
	/*
	 * returns a String representation of the array of Card
	 * e.g Ace of Clubs, Two of Clubs, Three of Clubs,..
	 */
	public String toString(){
		//TODO
		String deck = new String();
		for( int i = 0; i < counter; i++){
			deck += cards[i].toString() + ", ";
		}
		return deck;
	}
	
	
	/*
	 * This method shuffles the deck.
	 * There are many ways to do this
	 * One such way would be to select two random positions in the deck and swap the cards
	 * Then do this a number of times
	 */
	public void shuffle(){
		//TODO 
		//To get a random position in the deck you could use the math.random() function
		for (int swap = 0; swap < 11; swap++){
		int pos1 = (int)(Math.random()*52);
		int pos2 = (int)(Math.random()*52);
		if (pos1 != pos2){
			Card temp = new Card(0, 0);
			temp = cards[pos1];
			cards[pos1] = cards[pos2];
			cards[pos2] = temp;
		}
		}
		
		
	}
	
	/*
	 * This method selects the top card from the Deck
	 * It then copies all the Cards (except the top Card) in the cards array into a new array 
	 * and then sets the cards variable to point to that array
	 * This has the effect of reducing the size of he deck by one every time this 
	 * method is called
	 * The method returns the Card selected in the first step
	 */
	
	public Card removeTopCard(){
		
		// I had trouble with this part of the assignment I wasn't quite sure how to solve this particular problem.
		// I wasn't quiet sure how to update the array to remove the top cards.
		
		return null;
	}
	
}


