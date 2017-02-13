import java.util.ArrayList;
import java.util.Arrays;

public class ToyStore
{
	private ArrayList<Toy> toyList = new ArrayList<>();
	
	public ToyStore()
	{
		toyList = null;
	}
	
	public ToyStore(String t)
	{
		loadToys(t);
	}
	
	public void loadToys(String ts)
	{
		ts.split(", ");
		ArrayList<String> toys = new ArrayList<String>(Arrays.asList(ts.split(", ")));
		
		for(int i = 0; i < toys.size(); i+=2)
		{
			String name = toys.get(i);
			String type = toys.get(i+1);
			
			Toy toy = getThatToy(name);
			
			if(toy == null)
			{
				if(type.equals("Car"))
					toyList.add(new Car(name));
				else if(type.equals("AF"))
					toyList.add(new AFigure(name));
			}
			else
				toy.setCount(toy.getCount() + 1);
		}
	}

	public Toy getThatToy(String nm)
	{
		for(Toy i : toyList)
		{
			if(i.getName().equals(nm))
			{
				return i;
			}
		}
		return null;
	}
	
	public String getMostFrequentToy()
	{
		String name = "";
		int max = Integer.MIN_VALUE;
		
		for(Toy i : toyList)
		{
			if(max < i.getCount())
			{
				max = i.getCount();
				name = i.getName();
			}
		}
		return name;
	}
	
	public String getMostFrequentType()
	{
		int cars = 0;
		int figures = 0;
		
		for(Toy i : toyList)
		{
			if(i.getType().equals("Car"))
			{
				cars += 1;
			}
			
			if(i.getType().equals("AF"))
			{
				figures += 1;
			}
		}
		
		if(cars > figures)
			return "Cars";
		else if(figures > cars)
			return "Action Figures";
		else
			return "Equal amounts of action figures and cars!";
	}
	
	public String toString()
	{
		return toyList + "";
	}
}