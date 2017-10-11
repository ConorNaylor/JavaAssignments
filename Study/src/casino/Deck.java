package casino;



public class Deck {

	private Card[] cards = null; 
	
	/*
	 * public Constructor with arguments.
	 */
	public Deck() {
		//TODO initialise the cards array (size 52)
		//then insert a new unique (and valid) Card for each of the array slots
		//Your deck can't include duplicates
	} 

	
	/*
	 * returns a String representation of the array of Card
	 * e.g Ace of Clubs, Two of Clubs, Three of Clubs,..
	 */
	public String toString(){
		//TODO
		return null;
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
		int pos1 = (int)(Math.random()*52);
		
		
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
		
		//TODO
		
		return null;
	}
	
}


