import java.util.Scanner;

public class APLab_04_Part2
{
	public static void main(String[]args)
	{
		APLab_04_Part2 form = new APLab_04_Part2();
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter your first name:");
		String name1 = kb.next();
		
		System.out.println("Enter your last name:");
		String name2 = kb.next();
		
		System.out.println("Enter your title:");
		String title = kb.next();
		kb.nextLine();
		
		System.out.println("Enter the school site:");
		String school = kb.nextLine();
	
		System.out.println("Enter the school year:");
		String year = kb.next();
		kb.nextLine();
		
		System.out.println("What is your subject?");
		String subject = kb.nextLine();
		
		System.out.println("****************************************");
		form.format(school, year);
		form.format(name1, name2);
		form.format(title, subject);
		System.out.println("****************************************");
	}
	
	public void format(String word, String word1)
	{
		System.out.printf("*  "+ "%15s" + "%20s" + " *\n", word, word1);
	}
}