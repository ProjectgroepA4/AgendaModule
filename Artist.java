import javax.swing.ImageIcon;


public class Artist 
{
	private String genre;
	private String name;
	private String description;
	private ImageIcon image;
	private int id;
	
	public Artist(String genre, String name, String description, ImageIcon image, int id)
	{
		this.genre = genre;
		this.name = name;
		this.description = description;
		this.image = image;
		this.id = id;
	}
	
	public int getID()
	{
		return id;
	}
	
	
}
