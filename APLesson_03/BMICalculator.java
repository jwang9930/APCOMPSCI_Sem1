import java.util.Scanner;

public class BMICalculator
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("What is your height (in)?");
		double height = kb.nextDouble();
		
		kb.nextLine();
		
		Scanner kb1 = new Scanner(System.in);
		System.out.println("What is your weight (lb)?");
		double weight = kb1.nextDouble();
		
		double BMI = 703*(weight/(height*height));
		System.out.println("Your BMI is " + BMI + " kg/m^2");
	}
}