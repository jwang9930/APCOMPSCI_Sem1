public class GameSystemClass
{
	private String platform;
	private int serialNo;
	
	public GameSystemClass()
	{
		platform = "";
		serialNo = (int)(Math.random()*9999999+1000000);
	}
	
	public GameSystemClass(String p)
	{
		platform = p;
		serialNo = (int)(Math.random()*9999999+1000000);
	}
	
	public String getPlatform()
	{
		return platform;
	}
	
	public int getSerial()
	{
		return serialNo;
	}
}