import java.util.Scanner;
public class LeftTri
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter your word: ");
		String word = kb.next();
		int length = word.length();
		
		for(int i = 0; i <= length; i++)
		{
			System.out.println(word.substring(i));
		}
	}
}