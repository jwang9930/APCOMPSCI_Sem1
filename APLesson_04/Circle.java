import java.util.Scanner;

public class Circle
{
	static double r;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter circle radius: ");
		r = kb.nextDouble();
		format(r,calculate(r));
	}
	
	public static double calculate(double r)
	{
		return 3.14*r*r;
	}
	
	public static void format(double r, double area)
	{
		System.out.printf("The area of a circle with a radius of " + r + " is " + "%.5f.", area);
	}
}