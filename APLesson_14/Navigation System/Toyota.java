public class Toyota implements Interface
{
	private double[] location = new double[2];
	
	public Toyota()
	{
		location[0] = 0;
		location[1] = 0;
	}
	
	public Toyota(String c)
	{
		String[] points = c.split(", ");
		this.location[0] = Double.parseDouble(points[0]);
		this.location[1] = Double.parseDouble(points[1]);
	}
	
	public int getID()
	{
		return (int)(Math.random()*1000000 + 1);
	}
	
	public void move(double x2, double y2)
	{
		location[0] += x2;
		location[1] += y2;
	}
	
	public double[] getLoc()
	{
		return location;
	}

}