public class PC extends GameSystemClass
{
	public String systemInput()
	{
		return "Keyboard and Mouse";
	}
	
	public String toString()
	{
		return "Platform: [" + getPlatform() + "]\nSerial #: [" + getSerial() + "]\nSystem Input: [" + systemInput() + "]";
	}
}