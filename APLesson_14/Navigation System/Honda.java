public class Honda implements Location
{
	double [] location = new double[2];
	
	public Honda()
	{
		location[0] = 0;
		location[1] = 0;
	}
	
	public Honda(double[] a)
	{
		location = a;
	}
	
	public int getID()
	{
		return (int)(Math.random()*1000000 + 1);
	}
	
	public void move(double x, double y)
	{
		location[0] += x;
		location[1] += y;
	}
	
	public double[] getLoc()
	{
		return location;
	}
}