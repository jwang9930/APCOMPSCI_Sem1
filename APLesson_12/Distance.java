import java.lang.Math.*;
public class Distance
{
	private int xOne, yOne, xTwo, yTwo;
	private double distance;
	
	public Distance()
	{
		xOne = 0;
		yOne = 0;
		xTwo = 0;
		yTwo = 0;
	}
	
	public Distance(int xo, int yo, int xt, int yt)
	{
		xOne = xo;
		yOne = yo;
		xTwo = xt; 
		yTwo = yt;
	}
	
	public void setValues(int xo, int yo, int xt, int yt)
	{
		xOne = xo;
		yOne = yo;
		xTwo = xt; 
		yTwo = yt;
	}
	
	public int getxOne()
	{
		return xOne;
	}
	
	public int getyOne()
	{
		return yOne;
	}
	
	public int getxTwo()
	{
		return xTwo;
	}
	
	public int getyTwo()
	{
		return yTwo;
	}
	
	public double getDist()
	{
		return distance = Math.sqrt((xTwo-xOne)*(xTwo-xOne) + (yTwo-yOne)*(yTwo-yOne));
	}
}