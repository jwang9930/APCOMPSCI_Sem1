public class Toyota implements Location
{
	private double[] location;
	
	public Toyota()
	{
		location = new double[2];
	}
	
	public Toyota(String c)
	{
		location = new double[2];
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