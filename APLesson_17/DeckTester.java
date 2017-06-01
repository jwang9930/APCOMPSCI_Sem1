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
		String[] r1 = {"Ace", "Queen"};
		String[] s1 = {"Hearts", "Hearts"};
		int[] v1 = {11, 10};
		
		Deck d1 = new Deck(r1, s1, v1);
		System.out.println("The size is 4: " + d1.size());
		
		String[] r2 = {};
		String[] s2 = {};
		int[] v2 = {};
		
		Deck d2 = new Deck(r2, s2, v2);
		System.out.println("The deck is empty: " + d2.isEmpty());
		
		String[] r3 = {"7", "Ace", "Queen"};
		String[] s3 = {"Spades", "Hearts", "Hearts"};
		int[] v3 = {7, 11, 10};
		
		Deck d3 = new Deck(r3, s3, v3);
		System.out.println("Card dealt: " + d3.deal());
	}
}
