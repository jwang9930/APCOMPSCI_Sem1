import java.util.Scanner;

public class MagpiePart2Runner
{
	public static void main(String[] args)
	{
		MagpiePart2 maggie = new MagpiePart2();
		
		System.out.println (maggie.getGreeting());
		Scanner in = new Scanner (System.in);
		String statement = in.nextLine();
		
		while (!statement.equals("Bye"))
		{
			System.out.println (maggie.getResponse(statement));
			statement = in.nextLine();
		}
	}
}
