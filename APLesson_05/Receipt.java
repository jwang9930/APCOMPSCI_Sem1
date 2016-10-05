import java.util.Random;
import java.util.Scanner;

public class Receipt
{
	static double total, discount;
	static String Total, Discount;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter item 1:");
		String item1 = kb.next();
		System.out.println("Enter the price for item 1:");
		double price1 = kb.nextInt();
		
		System.out.println("Enter item 2:");
		String item2 = kb.next();
		System.out.println("Enter the price for item 2:");
		double price2 = kb.nextInt();
		
		System.out.println("Enter item 3:");
		String item3 = kb.next();
		System.out.println("Enter the price for item 3:");
		double price3 = kb.nextInt();
		
		System.out.println("Enter item 4:");
		String item4 = kb.next();
		System.out.println("Enter the price for item 4:");
		double price4 = kb.nextInt();
		
		total = price1+ price2 + price3 + price4;
		
		dis();
		
		System.out.println("<<<<<<<<<<< Receipt >>>>>>>>>>>>>>");
		format(item1, price1);
		format(item2, price2);
		format(item3, price3);
		format(item4, price4);
		format("Total", total);
		format("Discount", discount);
		System.out.println("\n__________________________________");
	}
	
	public static void dis()
	{
		
		if(total >= 2000)
		{
			discount = 0.15*total;
			total = total - .15*total;
		}
		
		if(total < 2000)
		{
			total = total;
			discount = 0;
		}
		
	}
	
	public static void format(String item1, double price1)
	{
		System.out.printf("\n%10s ..... %.2f", item1, price1);
	}
}