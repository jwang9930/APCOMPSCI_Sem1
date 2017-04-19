import java.util.Scanner;

public class MagpiePart3Runner
{
	public static void main(String[] args)
	{
		MagpiePart3 maggie = new MagpiePart3();
		
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
