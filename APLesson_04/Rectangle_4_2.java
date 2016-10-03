import java.util.Scanner;
public class Rectangle_4_2
{
	static double length;
	static double width;
	static double perimeter;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter length: ");
		length = kb.nextDouble();
		System.out.println("Enter width: ");
		width = kb.nextDouble();
		print();
		
	}
	
	public static double calculate()
	{
		return perimeter = (2*length + 2*width);
	}
	
	public static void print()
	{
		System.out.printf("Your Rectangle is " + "%.5f" + " ft around.", calculate());
	}
 }