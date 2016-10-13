import java.util.Scanner;
public class Password
{
	public static void main(String[]args)
	{
		String username = "appleseed";
		String password = "applejuice";
		recursive(username,password);
	}
	
	public static void recursive(String username, String password)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter your username.");
		String inputuser = kb.nextLine();
		System.out.println("Please enter your password.");
		String inputpass = kb.nextLine();
		
		if (inputuser.equals(username)&&(inputpass.equals(password)))
		{
			System.out.println("You are granted access!");
		}
		else
		{
			if(inputuser.equals(username)&&!(inputpass.equals(password)))
			{		
				System.out.println("Your password is incorrect!");
				recursive(username, password);
			}
			else
			{
				if (!(inputuser.equals(username))&&(inputpass.equals(password)))
				{
					System.out.println("Your username is incorrect!");
					recursive(username, password);
				}
				else
				{
					System.out.println("Your username and password are incorrect!");
					recursive(username, password);
				}
			}
		}
	}
}