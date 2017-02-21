public class TicketDriver
{
	public static void main(String[]args)
	{
		Walkup w = new Walkup();
		Advance a = new Advance(17);
		StudentAdvance sa = new StudentAdvance(52);
		
		System.out.println(w + "\n" + a + "\n" + sa);
	}
}