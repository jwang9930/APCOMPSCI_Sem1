import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class ExpressionSolver
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter an equation: ");
		String expression = kb.nextLine();
		
		ArrayList<String>equation = new ArrayList<>(Arrays.asList(expression.split(" ")));
		
		doEquation(equation);
	}
	
	public static void doEquation(ArrayList<String> function)
	{
		int i = 0;
		while(i < function.size())
		{
			if(i < function.size() && function.get(i).equals("+"))
			{
				function.set(i, "" + (Integer.parseInt(function.get(i-1)) + Integer.parseInt(function.get(i+1))));
				function.remove(i-1);
				function.remove(i);
			}
			else if(i < function.size() && function.get(i).equals("-"))
			{
				function.set(i, "" + (Integer.parseInt(function.get(i-1)) - Integer.parseInt(function.get(i+1))));
				function.remove(i-1);
				function.remove(i);
			}
			else if(i < function.size() && function.get(i).equals("*"))
			{
				function.set(i, "" + (Integer.parseInt(function.get(i-1)) * Integer.parseInt(function.get(i+1))));
				function.remove(i-1);
				function.remove(i);
			}
			else if(i < function.size() && function.get(i).equals("/"))
			{
				function.set(i, "" + (Integer.parseInt(function.get(i-1)) / Integer.parseInt(function.get(i+1))));
				function.remove(i-1);
				function.remove(i);
			}
			i++;
		}
		
		System.out.println(function);
	}
}