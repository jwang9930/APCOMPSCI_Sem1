import java.util.Scanner;
public class RightTri
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter your word: ");
		String word = kb.next();
		int length = word.length();
		
		for(int i = length; i >= 0; i--)
		{
			System.out.println(word.substring(i));
		}
	}
}