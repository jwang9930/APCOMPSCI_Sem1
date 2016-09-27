public class Lab_02
{
	public static void main(String[]args)
	{
		int num1 = 2;
		int num2 = 3;
		System.out.println(num1 + " multiplied by " + num2 + " is " + num1 * num2);
		
		int Num1 = 3;
		int Num2 = 5;
		System.out.println(Num1 + " multiplied by " + Num2 + " is " + Num1 * Num2);
		
		String Name = "Torrey Pines High School";
		String Address = "3710 Del Mar Heights Rd";
		String City = "San Diego";
		String State = "CA";
		String ZipCode = "92130";
		System.out.println("\n" + Name + "\n" + Address + "\n" + City + ", " + State + " " + ZipCode);
		
		int l = 1;
		int w = 1;
		int h = 2;
		int SurfaceArea = 2*l*w + 2*l*h + 2*w*h;
		System.out.println("\nThe surface area of your rectangle is " + SurfaceArea);
	}
}