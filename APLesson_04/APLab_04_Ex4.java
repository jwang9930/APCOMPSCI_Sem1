import java.util.Scanner;

public class APLab_04_Ex4
{
	public static void main(String[]args)
	{
		APLab_04_Ex4 volume = new APLab_04_Ex4();
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the height (in inches): ");
		double height = kb.nextDouble();
		System.out.println("Enter the length (in inches): ");
		double length = kb.nextDouble();
		System.out.println("Enter the width (in inches): ");
		double width = kb.nextDouble();
		double conversion = volume.math(height, length, width);
		System.out.println("The volume of your box is " + conversion + " cubic feet.");		
	}
	
	public double math(double height, double length, double width)
	{
		return((height*length*width)/(12*12*12));
	}
}