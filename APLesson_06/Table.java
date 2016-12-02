import java.util.Scanner;
public class Table
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the number of floors: ");
		int size = kb.nextInt();
		System.out.println("Enter the start number: ");
		int start = kb.nextInt();
		System.out.println("# of Floors:" + "\t# of Faces:");
		
		for(int i = 1; i <= size; i++)
		{
			System.out.println(i + "\t\t\t" + start*i);
		}
	}
}