import java.util.Scanner;
public class Story
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Oops, you lost your car keys! Where do you look?" +
							"\n1. I think I'll check the gym." + 
							"\n2. Maybe I left it at school.");
		int choice1 = kb.nextInt();
		if (choice1 == 1)
		{
			System.out.println("It's not there! Where else can you look?" + 
								"\n1. Let's see if it's at work then..." + 
								"\n2. Hmmm. What if it's at my friend's house?");
			int choice2 = kb.nextInt();
			if (choice2 == 1)
			{	
				System.out.println("Nope, look's like it's not there either... What do you do?" +
									"\n1. Let's see if it's at home..." + 
									"\n2. Rip me forget it, gonna go buy a new one.");
				int choice3 = kb.nextInt();
				if (choice3 == 1)
				{
					System.out.println("Congratulations, you found them!!!");
				}
				else
					System.out.println("You're parents are pissed, but at least you have a car again.");
			}	
			else 
			{
				System.out.println("Whelp life is hard; it's not there either. What do you do?" +
									"\n1. Let's see if it's at home..." + 
									"\n2. Rip me forget it, gonna go buy a new one.");
				int choice3 = kb.nextInt();
				if (choice3 == 1)
				{
					System.out.println("Congratulations, you found them!!!");
				}
				else
					System.out.println("You're parents are pissed, but at least you have a car again.");
			}
		}
		else
		{
			System.out.println("It's not there! Where else can you look?" + 
								"\n1. Let's see if it's at work then..." + 
								"\n2. Hmmm. What if it's at my friend's house?");
			int choice2 = kb.nextInt();
			if (choice2 == 1)
			{	
				System.out.println("Nope, look's like it's not there either... What do you do?" +
									"\n1. Let's see if it's at home..." + 
									"\n2. Rip me forget it, gonna go buy a new one.");
				int choice3 = kb.nextInt();
				if (choice3 == 1)
				{
					System.out.println("Congratulations, you found them!!!");
				}
				else
					System.out.println("You're parents are pissed, but at least you have a car again.");
			}	
			else 
			{
				System.out.println("Whelp life is hard; it's not there either. What do you do?" +
									"\n1. Let's see if it's at home..." + 
									"\n2. Rip me forget it, gonna go buy a new one.");
				int choice3 = kb.nextInt();
				if (choice3 == 1)
				{
					System.out.println("Congratulations, you found them!!!");
				}
				else
					System.out.println("You're parents are pissed, but at least you have a car again.");
			}
		}
	}
}