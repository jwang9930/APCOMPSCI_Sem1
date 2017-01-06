import java.util.Scanner;
public class MPHRunner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter distance traveled: ");
		distance = kb.nextInt();
		System.out.println("Enter the number of hours: ");
		hours = kb.nextInt();
		System.out.println("Enter the minutes: ");
		minutes = kb.nextInt();
		
		MPHRunner MilesPerHour = new MPHRunner(int d, int h, int m);
		
		System.out.println(distance + " miles in " + hours " = " + mph + " mph");
		
		MilesPerHour(distance, hours, minutes);
		
		System.out.println(distance + " miles in " + hours " = " + mph + " mph");
	}
}