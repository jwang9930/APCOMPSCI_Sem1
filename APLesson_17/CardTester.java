/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card c1 = new Card("Queen", "Diamonds", 12);
		Card c2 = new Card("Jack", "Spades", 11);
		Card c3 = new Card("Jack", "Spades", 11);
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		System.out.println(c3.toString());
		
		System.out.println();
		
		System.out.println("The statement that cards c1 and c2 matches is " + c1.matches(c2) + ".");
		System.out.println("The statement that cards c1 and c3 matches is " + c1.matches(c3) + ".");
		System.out.println("The statement that cards c2 and c3 matches is " + c2.matches(c3) + ".");
	}
}