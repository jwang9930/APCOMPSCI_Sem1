public class AFigure extends Toy
{
	public AFigure()
	{
		super();
	}
	
	public AFigure(String n)
	{
		super(n);
	}
	
	public String getName()
	{
		return super.getName();
	}
	
	public String getType()
	{
		return "Action Figure";
	}
	
	public String toString()
	{
		return getType() + "\n" + super.toString();
	}
}