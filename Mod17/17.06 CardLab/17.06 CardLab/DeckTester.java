import java.util.ArrayList;
/**
 * This is a class that tests the Deck class.
 */

public class DeckTester {
	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		ArrayList<Deck> deck = new ArrayList<Deck>();
		//object0
		String[] ranks = {"Jack", "King", "Queen"};
		String[] suits = {"Spades", "Clubs", "Hearts"};
		int[] values = {10, 11, 12};
		deck.add( new Deck(ranks, suits, values)); 
		//object1
		String[] ranks1 = {"Eight", "King", "Ace"};
		String[] suits1 = {"Diamonds", "Clubs", "Clubs"};
		int[] values1 = {10, 11, 3};
		deck.add( new Deck(ranks1, suits1, values1));
		//object2
		String[] ranks2 = {"Two", "Queen", "Jack"};
		String[] suits2 = {"Diamonds", "Hearts", "Spades"};
		int[] values2 = {9, 7, 12};
		deck.add( new Deck(ranks2, suits2, values2));
		
		//test objects
		System.out.println(deck.get(0).isEmpty());
		System.out.println(deck.get(1).size());
		System.out.println(deck.get(2).deal());
	}
}
