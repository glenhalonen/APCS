/**
 * This is a class that tests the Card class.
 */
import java.util.ArrayList;
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		ArrayList<Card> card = new ArrayList<Card>();
		
		card.add( new Card( "Ace", "Spades", 1)    );
		card.add( new Card( "5", "Hearts", 5)      );
		card.add( new Card( "Queen", "Clubs", 12)  );
		
		System.out.println( card.get(0).suit());
		System.out.println( card.get(0).pointValue());
		System.out.println( card.get(0).rank());
		System.out.println( card.get(0).matches(card.get(1)) );
		System.out.println(card);
	}
}
