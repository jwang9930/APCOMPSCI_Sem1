import java.util.Arrays;

public class GMC implements Interface
{
	private double x, y;
	
	public GMC()
	{
		x = 0;
		y = 0;
	}
	
	public GMC (double x2, double y2)
	{
		x = x2;
		y = y2;
	}
	
	public int getID()
	{
		return (int)(Math.random()*1000000 + 1);
	}
	
	public void move(double x3, double y3)
	{
		x += x3;
		y += y3;
	}
	
	public double[] getLoc()
	{
		double[] location = new double[2];
		location[0] = x;
		location[1] = y;
		return location;
	}

}