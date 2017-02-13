import java.util.Scanner;

public class ToyRunner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter object 1:");
		String one = kb.nextLine();
		System.out.println("Enter object 2:");
		String two = kb.nextLine();
		AFigure afig = new AFigure(one);
		Car car = new Car(two);
		
		System.out.println(afig.toString());
		System.out.println(car.toString());
	}
}