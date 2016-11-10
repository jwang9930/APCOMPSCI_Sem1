import java.util.Scanner;

public class Average
{
	static double num1;
	static double num2;
	static double num3;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter Number 1: ");
		num1 = kb.nextDouble();
		System.out.println("Enter Number 2: ");
		num2 = kb.nextDouble();
		System.out.println("Enter Number 3: ");
		num3 = kb.nextDouble();
		format(num1, num2, num3, calculate(num1, num2, num3));
		
	}
	
	public static double calculate(double num1, double num2, double num3)
	{
		return (num1+num2+num3)/3;
	}
	
	public static void format(double num1, double num2, double num3, double average)
	{
		System.out.printf("The average of " + num1 + ", " + num2 + ", and " + num3 + " is " + "%.5f" + ".", average);
	}
}