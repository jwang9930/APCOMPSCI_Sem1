public abstract class TicketSuperclass
{
	private int serialNo;
	
	public TicketSuperclass()
	{
		serialNo = (int)(Math.random()*9999999+1000000);
	}
	
	public int getSerialNo()
	{
		return serialNo;
	}
	
	public abstract double getPrice();
	
	public String toString()
	{
		return "Serial #: [" + getSerialNo() + "]\nPrice: [" + getPrice() + "]";
	}
}