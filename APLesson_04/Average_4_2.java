import java.util.Scanner;

public class Average_4_2
{
	static double num1;
	static double num2;
	static double num3;
	static double average;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter Number 1: ");
		num1 = kb.nextDouble();
		System.out.println("Enter Number 2: ");
		num2 = kb.nextDouble();
		System.out.println("Enter Number 3: ");
		num3 = kb.nextDouble();
		calculate();
		format();
		
	}
	
	public static void calculate()
	{
		average = (num1+num2+num3)/3;
	}
	
	public static void format()
	{
		System.out.printf("The average of " + num1 + ", " + num2 + ", and " + num3 + " is " + "%.5f" + ".", average);
	}
}