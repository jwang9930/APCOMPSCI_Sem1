import java.util.Random;
public class DiceRoll
{
	public static void main(String[]args)
	{
		Random roll = new Random();
		int player = roll.nextInt(6)+1;
		int pc = roll.nextInt(6)+1;
		
		String winner = rollDice(player,pc);
		
		System.out.println("You rolled a " + player);
		System.out.println("Computer rolled a " + pc);
		System.out.println("The winner is " + winner);
	}
	
	public static String rollDice(int player, int pc)
	{
		String winner = ("");
		
		if(player > pc)
		{
			winner = "you";
		}
		
		if(player < pc)
		{
			winner = "computer";
		}
		
		return winner;
	}
}