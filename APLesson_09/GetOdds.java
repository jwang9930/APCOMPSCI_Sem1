public class GetOdds
{
	static int[] numbers;
	public static void main(String[]args)
	{
		numbers = new int[10];
		fillArray();
		printArray();
		System.out.print("there are " + getOdds() + " odd numbers.");
	}
	
	public static void fillArray()
	{
		for(int i = 0; i < numbers.length; i++)
		{
			numbers[i] = (int)(Math.random() * 100) + 1;
		}
	}
	
	public static void printArray()
	{
		System.out.print("For the following numbers... ");
		for(int i = numbers.length - 1; i >= 0; i--)
		{
			System.out.print(numbers[i] + ", ");
		}
	}
	
	public static int getOdds()
	{
		int odds = 0;
		for(int number: numbers)
		{
			if(number%2 > 0)
			{
				odds += 1;
			}
		}
		return odds;
	}
}