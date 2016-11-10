import java.util.Scanner;

public class Rectangle
{	
	static double length;
	static double width;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter length: ");
		length = kb.nextDouble();
		System.out.println("Enter width: ");
		width = kb.nextDouble();
		print(calculate(length, width));
		
	}
	
	public static double calculate(double length, double width)
	{
		return 2*length + 2*width;
	}
	
	public static void print(double perimeter)
	{
		System.out.printf("Your Rectangle is " + "%.5f" + " ft around.", perimeter);
	}
}