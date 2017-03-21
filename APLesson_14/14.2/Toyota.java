public class Toyota extends NewCar
{
	private double[] location;
	
	public Toyota(String c)
	{
		location = new double[2];
		String[] points = c.split(", ");
		this.location[0] = Double.parseDouble(points[0]);
		this.location[1] = Double.parseDouble(points[1]);
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