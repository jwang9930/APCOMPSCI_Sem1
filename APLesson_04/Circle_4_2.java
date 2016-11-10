import java.util.Scanner;

public class Circle_4_2
{
	static double r;
	static double area;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter circle radius: ");
		r = kb.nextDouble();
		calculate();
		format();
	}
	
	public static void calculate()
	{
		area = 3.14*r*r;
	}
	
	public static void format()
	{
		System.out.printf("The area of a circle with a radius of " + r + " is " + "%.5f.", area);
	}
}