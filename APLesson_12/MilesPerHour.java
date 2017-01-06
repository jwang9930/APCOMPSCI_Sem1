import java.util.Scanner;
public class MPH
{
	private int distance, hours, minutes; 
	private double mph; 
	
	public MPH()
	{
		distance = 0;
		hours = 0;
		minutes = 0;
		mph = 0;
	}
	
	public MPH(int dist, int hr, int min)
	{
		distance = dist;
		hours = hr;
		minutes = min;
		mph = 0;
	}
	
	public void modifyValues()
	{
		
	}
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter distance traveled: ");
		distance = kb.nextInt();
		System.out.println("Enter the number of hours: ");
		hours = kb.nextInt();
		System.out.println("Enter the minutes: ");
		minutes = kb.nextInt();
		
		MPH MilesPerHour = new MPH(int distance, int hours, int minutes);
		
		System.out.println();
	}
}