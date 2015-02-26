
public class Event 
{
	private int startTime;
	private int endTime;
	private Artist artist;
	private String description;
	private int id;
	
	public Event(int startTime, int endTime, Artist artist, String description, int id) 
	{
		this.startTime = startTime;
		this.endTime = endTime;
		this.artist = artist;
		this.description = description;
		this.id = id;
	}

	public Artist getArtist()
	{
		return artist;
	}
	
	public int getStartTime()
	{
		return startTime;
	}
	
	public int getID()
	{
		return id + 10;
	}
	
}
