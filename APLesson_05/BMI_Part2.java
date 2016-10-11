import java.util.Scanner;
public class BMI_Part2
{
	static String condition;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
	
		System.out.println("Please enter your height (in): ");
		double h = kb.nextInt();
		System.out.println("Please enter you weight (lb): ");
		double w = kb.nextInt();
		double BMI = 0;
		
		calcBMI(h, w, BMI, condition);
	}
	
	public static void calcBMI(double h, double w, double BMI, String condition)
	{
		BMI = 703*(w/(h*h));
		System.out.println("Your BMI is: " + BMI);
		if (BMI < 18.5)
			condition = "Underweight";
		else if (BMI <= 24.9)
			condition = "Normal";
		else if (BMI <= 29.9)
			condition = "Overweight";
		else if (BMI <= 34.9)
			condition = "Obese";
		else if (BMI <= 39.9)
			condition = "Very Obese";
		else 
			condition = "Morbidly Obese";
		System.out.println("You are " + condition);
	}
}