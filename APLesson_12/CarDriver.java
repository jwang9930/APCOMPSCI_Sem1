import java.util.Scanner;
public class CarDriver
{
	public static void main(String[]args)
	{
		String p = "";
		String i = "";
		String e = "";
		String t = "";
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter the paint color: ");
		p = kb.nextLine();
		System.out.println("Enter the interior type: ");
		i = kb.nextLine();
		System.out.println("Enter the engine type: ");
		e = kb.nextLine();
		System.out.println("Enter the tire types: ");
		t = kb.nextLine();
		
		Car_Class object = new Car_Class(p, i, e, t);
		
		System.out.println("Your vehicle is ready.....");
		System.out.printf("Paint:\t%s\n", object.getPaint());
		System.out.printf("Interior:\t%s\n", object.getInterior());
		System.out.printf("Engine:\t%s\n", object.getEngine());
		System.out.printf("Tires:\t%s", object.getTires());
	}
}