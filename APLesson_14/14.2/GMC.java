public class GMC extends NewCar
{
	private double x, y;
	
	public GMC()
	{
		x = 0;
		y = 0;
	}
	
	public GMC (double x1, double y1)
	{
		x = x1;
		y = y1;
	}
	
	public void move(double x1, double y1)
	{
		x += x1;
		y += y1;
	}
	
	public double[] getLoc()
	{
		double[] location = new double[2];
		location[0] = x;
		location[1] = y;
		return location;
	}
}