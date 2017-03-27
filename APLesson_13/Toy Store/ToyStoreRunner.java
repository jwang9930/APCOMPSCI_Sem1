import java.util.Scanner;

public class ToyStoreRunner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Input toy list:");
		String toys = kb.nextLine();
		ToyStore toystore = new ToyStore(toys);
		System.out.println(toystore);
	}
}