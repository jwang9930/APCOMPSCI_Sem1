import java.util.Scanner;
public class Inventory_Runner
{
	public static void main(String[]args)
	{
		String m, n, c, YorN;
		int u;
		double p;
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the manufacturer: ");
		m = kb.next();
		System.out.println("Enter the name: ");
		n = kb.next();
		System.out.println("Will you be entering category and price information? (y or n) ");
		YorN = kb.next();
		
		if(YorN.equals("n"))
		{
			Inventory_Class object = new Inventory_Class(m, n);
			System.out.println(object);
		}
		else
		{
			System.out.println("Enter the category: ");
			c = kb.next();
			System.out.println("Enter the price");
			p = kb.nextDouble();
			Inventory_Class object1 = new Inventory_Class(m, n, c, p);
			System.out.println(object1);
		}
	}
}