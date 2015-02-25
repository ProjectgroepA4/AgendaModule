import java.util.ArrayList;


public class Stage 
{
	private ArrayList<Event> performances;
	private int expectedPopularity;
	private String description;
	private int length;
	private int startTime,endTime;
	
	public Stage(ArrayList<Event> performances, int expectedPopularity, String description, int startTime, int endTime)
	{
		this.performances = performances;
		this.expectedPopularity = expectedPopularity;
		this.description = description;
		this.startTime = startTime;
		this.endTime = endTime;
		this.length = endTime - startTime;
	}
	
	public void setStartTime(int startTime)
	{
		this.startTime = startTime;
	}
	
	public void setEndTime(int endTime)
	{
		this.endTime = endTime;
	}
	
	public ArrayList<Event> getPerformances()
	{
		return performances;
	}
	
//	public int getID()
//	{
//		return id + 100;
//	}
	
	public int getLength()
	{
		return length;
	}
	
	public int getStartTime()
	{
		return startTime;
	}
	
	public int getEndTime()
	{
		return endTime;
	}
	
}
