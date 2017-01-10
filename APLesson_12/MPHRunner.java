import java.util.Scanner;
public class MPHRunner
{
	public static void main(String[]args)
	{
		int dist = 0;
		int hrs = 0;
		int min = 0;
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter distance traveled: ");
		dist = kb.nextInt();
		System.out.println("Enter the number of hours: ");
		hrs = kb.nextInt();
		System.out.println("Enter the minutes: ");
		min = kb.nextInt();
		
		MilesPerHour object = new MilesPerHour(dist,hrs,min);
		
		System.out.printf("%d miles in %d hours and %d minutes = %.2f mph\n", object.getDistance(), object.getHours(), object.getMinutes(), object.getMPH());
		
		object.setValues(73,12,23);
		System.out.printf("%d miles in %d hours and %d minutes = %.2f mph", object.getDistance(), object.getHours(), object.getMinutes(), object.getMPH());
	}
}