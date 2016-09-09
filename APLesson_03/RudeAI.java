import java.util.Scanner; //import Statement

public class RudeAI
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = keyboard.next();
		System.out.println("I'm sorry. I would hate to be called " + name + " :/");

		keyboard.nextLine();
		
		keyboard.nextLine();
		
		Scanner keyboard1 = new Scanner(System.in);
		System.out.println("How old are you?");
		int age = keyboard1.nextInt();
		System.out.println("Wow! " + age + " is pretty old. You should probably retire soon.");
	
		keyboard.nextLine();
		
		Scanner kb = new Scanner(System.in);
		System.out.println("What do you do for fun?");
		String stuff = kb.next();
		System.out.println(stuff + "???" + " What a scrub.");
		
		keyboard.nextLine();
		
		Scanner kb1 = new Scanner(System.in);
		System.out.println("What kind of music do you like?");
		String music = kb1.next();
		System.out.println(music + " is pretty outdated. Have you been living under a rock?");
		
		keyboard.nextLine();
		
		Scanner kb2 = new Scanner(System.in);
		System.out.println("How many siblings do you have?");
		int siblings = kb2.nextInt();
		System.out.println("Wow!" + siblings + " is a lot! Are you the runt of the litter?");
		
		keyboard.nextLine();
		
		Scanner kb3 = new Scanner(System.in);
		System.out.println("What do you want to be when you grow up?");
		String job = kb3.next();
		System.out.println(job + "? What are you, 5?");
	}
}