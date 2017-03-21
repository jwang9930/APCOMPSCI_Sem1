public class Honda extends NewCar
{
	double [] location = new double[2];
	
	public Honda(double[] a)
	{
		location = a;
	}
	
	public void move(double x1, double y1)
	{
		location[0] += x1;
		location[1] += y1;
	}
	
	public double[] getLoc()
	{
		return location;
	}
}