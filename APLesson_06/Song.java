public class Song
{
	static String word1 = "Na";
	static String word2 = "Hey";
	static String word3 = "Goodbye!";
	
	static int num1 = 4;
	static int num2 = 3;
	static int num3 = 1;
	
	public static void main(String[]args)
	{
		sing(word1, num1);
		sing(word1, num1);
		sing(word2, num2);
		sing(word3, num3);
		
	}
	
	public static void sing(String word, int num)
	{
		for(int i = 0; i < num; i++)
		{
			System.out.print(word + " ");
		}
		System.out.println();
	}
}