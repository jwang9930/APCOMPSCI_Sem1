import java.util.Scanner;
public class User_Runner
{
	public static void main(String[]args)
	{
		String f, l, YorN, a;
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter your first name: ");
		f = kb.next();
		System.out.println("Enter your last name: ");
		l = kb.next();
		System.out.println("Would you like to use a public avatar? (y or n): ");
		YorN = kb.next();
		
		
		if(YorN.equals("n"))
		{
			User_Class object = new User_Class(f, l);
			System.out.println(object);
		}
			
		else
		{
			System.out.println("Enter your avatar name: ");
			a = kb.next();
			User_Class object1 = new User_Class(f, l, a);
			System.out.println(object1);
		}
	}
}