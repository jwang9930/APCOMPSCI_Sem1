import java.util.Scanner;
public class HumanDriver
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter your hair color: ");
		String h = kb.nextLine();
		System.out.println("Enter your eye color: ");
		String e = kb.nextLine();
		System.out.println("Enter you skin color: ");
		String s = kb.nextLine();
		
		System.out.println("My info...");
		System.out.println("Hair: " + h + "\nEyes: " + e + "\nSkin: " + s);
		
		System.out.println();
		
		Human_Class object = new Human_Class(h, e, s);
		
		object.setHES("Blonde", "Blue", "White");
		System.out.println("Friend's info...");
		System.out.printf("Hair: %s\nEyes: %s\nSkin: %s", object.getHair(), object.getEyes(), object.getSkin());
	}
}