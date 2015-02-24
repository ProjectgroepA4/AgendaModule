import java.io.Serializable;

import javax.swing.ImageIcon;


public class Artist implements Serializable{

	private static final long serialVersionUID = 1;
	
	private String name;
	private String genre;
	private ImageIcon image;
	private String description;
	
	public Artist(String name, String genre, String image, String description)
	{
		this.name = name;
		this.genre = genre;
		this.description = description;
		
		if ( !image.equals("null")) {
			this.image = new ImageIcon(image);
		} 
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public String getGenre()
	{
		return this.genre;
	}
	
	public ImageIcon getImage()
	{
		return this.image;
	}
	
	public String getDescription()
	{
		return this.description;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setGenre(String genre)
	{
		this.genre = genre;
	}
	
	public void setImageIconString(String image)
	{
		this.image = new ImageIcon(image);
	}
	
	public void setImageIcon(ImageIcon image)
	{
		this.image = image;
	}
	
	public void setDescription(String description)
	{
		this.description = description;
	}
}
