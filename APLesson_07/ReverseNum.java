import java.util.Scanner;
public class ReverseNum
{
	static int number;
	static int rev = 0;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter an integer value: ");
		number = kb.nextInt();
		getReverse();
	}
	
	public static void getReverse()
	{
		int num = number;
		while(num > 0)
		{
			rev *= 10;
			rev = (rev + (num % 10));
			num /= 10;
		}
		System.out.println(number + " reversed is " + rev);
	}
}