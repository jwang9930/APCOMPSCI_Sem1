public class NewCar implements Location
{
	double[] location;
	public int ID = (int)(Math.random()*1000000 + 1);
	
	public NewCar()
	{
		location = new double[2];
	}
	
	public int getID()
	{
		return ID;
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