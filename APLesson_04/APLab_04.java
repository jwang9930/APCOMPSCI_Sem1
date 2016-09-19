import java.util.Scanner;

public class APLab_04
{
	public static void main(String[]args)
	{
		APLab_04 form = new APLab_04();
		
		System.out.println("<<<<<<<<<<<<<<<__Receipt__>>>>>>>>>>>>>>>>");
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter item 1");
		String word1 = kb.nextLine();
		System.out.println("Please enter the price");
		double number1 = kb.nextDouble();
		String throwaway1 = kb.nextLine();
		
		System.out.println("Please enter item 2");
		String word2 = kb.nextLine();
		System.out.println("Please enter the price");
		double number2 = kb.nextDouble();
		String throwaway2 = kb.nextLine();

		System.out.println("Please enter item 3");
		String word3 = kb.nextLine();
		System.out.println("Please enter the price");
		double number3 = kb.nextDouble();
		
		String word4 = "Subtotal:";
		double number4 = 9.01;
		
		String word5 = "Tax:";
		double number5 = 0.63;
		
		String word6 = "Total";
		double number6 = 9.64;
		
		form.format(word1, number1);
		form.format(word2, number2);
		form.format(word3, number3);
		System.out.println("\n");
		form.format(word4, number4);
		form.format(word5, number5);
		form.format(word6, number6);
	}
	
	public void format(String word, double number)
	{
		System.out.printf("\n*  %15s ........ %10.2f", word, number);
	}
}