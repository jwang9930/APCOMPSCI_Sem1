import java.util.Scanner;

public class Cube
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter cube side length: ");
		double side = kb.nextDouble();
		format(side, calculate(side));
	}
	
	public static double calculate(double side)
	{
		return 6*side*side;
	}
	
	public static void format(double side, double sa)
	{
		System.out.printf("The surface area of a cube with " + side + " sides is " + "%.5f.", sa);
	}
}