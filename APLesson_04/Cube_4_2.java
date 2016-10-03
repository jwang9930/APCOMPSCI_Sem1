import java.util.Scanner;

public class Cube_4_2
{
	static double side;
	static double sa;

	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter cube side length: ");
		side = kb.nextDouble();
		format(sa);
	}

	public static double calculate()
	{
		return sa = 6*side*side;
	}
	
	public static void format(double calculate)
	{
		System.out.printf("The surface area of a cube with " + side + " sides is " + "%.5f.", calculate());
	}
} 