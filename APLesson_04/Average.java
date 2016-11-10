import java.util.Scanner;

public class Average
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter Number 1: ");
		double num1 = kb.nextDouble();
		System.out.println("Enter Number 2: ");
		double num2 = kb.nextDouble();
		System.out.println("Enter Number 3: ");
		double num3 = kb.nextDouble();
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