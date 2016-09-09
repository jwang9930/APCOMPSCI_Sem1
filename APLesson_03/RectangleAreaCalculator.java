import java.util.Scanner;

public class RectangleAreaCalculator
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("What is the length?");
		double length = kb.nextDouble();
		
		kb.nextLine();
		
		Scanner kb1 = new Scanner(System.in);
		System.out.println("What is the width?");
		double width = kb.nextDouble();
		
		double RecArea = length*width;
		System.out.println("The area of your rectangle is " + RecArea);
		
	}
}