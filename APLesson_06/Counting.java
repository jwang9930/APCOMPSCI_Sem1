import java.util.Scanner;
public class Counting
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the range: ");
		int range = kb.nextInt();
		System.out.println("Enter the number to count by: ");
		int x = kb.nextInt();
		
		for(int start = 0; start <= range; start+=x)
		{
			System.out.println(start);
		}
	}
}