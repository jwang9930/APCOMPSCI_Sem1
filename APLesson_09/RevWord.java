import java.util.Scanner;
public class RevWord
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		String [] words = new String[5];
		System.out.println("Pleases enter 5 words: ");
		
		for(int i = 0; i < words.length; i++)
		{
			words[i] = kb.next();
		}
		
		for(String word : words)
		{
			System.out.print(word + ", ");
		}
		
		System.out.println();
		System.out.println("Reversed...");
		
		reverse(words);
	}
	
	public static void reverse(String[] w)
	{
		for(int j = w.length- 1; j >= 0; j--)
		{
			System.out.print(w[j] + " ");
		}
	}
}