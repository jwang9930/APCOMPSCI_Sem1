import java.util.Scanner;
public class GPACalculator
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter subject:");
		String s1 = kb.nextLine();
		System.out.println("Enter letter grade: ");
		String g1 = kb.next();
		kb.nextLine();
		
		System.out.println("Enter subject: ");
		String s2 = kb.nextLine();
		System.out.println("Enter letter grade: ");
		String g2 = kb.next();
		kb.nextLine();
		
		System.out.println("Enter subject:");
		String s3 = kb.nextLine();
		System.out.println("Enter letter grade: ");
		String g3 = kb.next();
		kb.nextLine();
		
		System.out.println("Enter subject: ");
		String s4 = kb.nextLine();
		System.out.println("Enter letter grade: ");
		String g4 = kb.next();
		kb.nextLine();
		
		System.out.println("Enter subject:");
		String s5 = kb.nextLine();
		System.out.println("Enter letter grade: ");
		String g5 = kb.next();
		kb.nextLine();
		
		System.out.println("Enter subject: ");
		String s6 = kb.nextLine();
		System.out.println("Enter letter grade: ");
		String g6 = kb.next();
		kb.nextLine();
		
		System.out.println("Enter subject: ");
		String s7 = kb.nextLine();
		System.out.println("Enter letter grade: ");
		String g7 = kb.next();
		kb.nextLine();
		
		double gPoints = (calcPoints(g1) + calcPoints(g2) + calcPoints(g3)+ calcPoints(g4) + calcPoints(g5) + calcPoints(g6) + calcPoints(g7))/7;
		
		System.out.println(gPoints);
	}
	
	public static double calcPoints(String grade)
	{
		if (grade.equals("A"))
			return 4.0;
		else if (grade.equals("B"))
			return 3.0;
		else if (grade.equals("C"))
			return 2.0;
		else if (grade.equals("D"))
			return 1.0;
		else
			return 0.0;
	}
}