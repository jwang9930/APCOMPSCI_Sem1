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
		calculate();
		format();
	}

	public static void calculate()
	{
		sa = 6*side*side;
	}
	
	public static void format()
	{
		System.out.printf("The surface area of a cube with " + side + " sides is " + "%.5f.", sa);
	}
} 