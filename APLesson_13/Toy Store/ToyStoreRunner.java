public class ToyStoreRunner
{
	public static void main(String[]args)
	{
		ToyStore toystore = new ToyStore("Hotwheel, Car, G.I.Joe, AF, PennyRacer, Car, Matchbox, Car, Star Wars, AF, Pullback, Car, Star Wars, AF");
		System.out.println(toystore);
		System.out.println(toystore.getMostFrequentToy());
		System.out.println(toystore.getMostFrequentType());
	}
}