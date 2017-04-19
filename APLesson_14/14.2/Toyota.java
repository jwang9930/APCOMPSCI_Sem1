public class Toyota extends NewCar
{
	public Toyota(String c)
	{
		location = new double[2];
		String[] points = c.split(", ");
		this.location[0] = Double.parseDouble(points[0]);
		this.location[1] = Double.parseDouble(points[1]);
	}
}