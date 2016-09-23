import java.util.Scanner;

public class APLab_04_Ex3
{
	public static void main(String[]args)
	{
		APLab_04_Ex3 compoundInterest = new APLab_04_Ex3();
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter interest rate (please enter as a decimal): ");
		double rate = kb.nextDouble();
		System.out.println("Enter principal amount: ");
		double amount = kb.nextDouble();
		System.out.println("Enter the number of times the loan is to be compounded per year: ");
		double number = kb.nextDouble();
		System.out.println("Enter the life of the loan (in years): ");
		double time = kb.nextDouble();
		double calculations = (compoundInterest.calculation(rate, amount, number, time));
		compoundInterest.format(calculations);
	}
	
	public double calculation(double rate, double amount, double number, double time)
	{
		double a = (amount*(Math.pow((1+(rate/number)), (number*time))));
		return(a/(12*time));
	}
	
	public void format(double word)
	{
		System.out.printf("Your total monthly payment is $%5.2f" + ".", word);
	}
}