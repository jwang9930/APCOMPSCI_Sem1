public class BiggestNumber
{
	static int[] numbers;
	public static void main(String[]args)
	{
		numbers = new int[10];
		fillArray();
		printArray();
		System.out.println("the biggest number is " + getBiggest() + ".");
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
	
	public static int getBiggest()
	{
		int max = 0;
		for(int number: numbers)
		{
			if(number > max)
			{
				max = number;
			}
		}
		return max;
	}
}