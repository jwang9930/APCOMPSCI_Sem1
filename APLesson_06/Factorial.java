import java.util.Scanner;
public class Factorial
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter your number: ");
		int num = kb.nextInt();
		
		for(int factorial = 1; factorial < num; factorial++)
		{
			System.out.println(factorial*(factorial+1));
		}
	}
}