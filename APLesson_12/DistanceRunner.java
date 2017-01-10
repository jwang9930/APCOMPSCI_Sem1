import java.util.Scanner;
public class DistanceRunner
{
	public static void main(String[]args)
	{
		int x1 = 0;
		int y1 = 0;
		int x2 = 0;
		int y2 = 0;
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter x1: ");
		x1 = kb.nextInt();
		System.out.println("Please enter y1: ");
		y1 = kb.nextInt();
		System.out.println("Please enter x2: ");
		x2 = kb.nextInt();
		System.out.println("Please enter y2: ");
		y2 = kb.nextInt();
		
		Distance object = new Distance(x1, y1, x2, y2);
		
		System.out.printf("Distance = %.2f\n", object.getDist());
		
		object.setValues(5,16,37,98);
		System.out.printf("Distance = %.2f", object.getDist());
	}
}