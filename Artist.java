public class Artist {

	private String name;
	private String genre;
	private String image;
	private String description;
	
	
	public Artist(String name, String genre, String image, String description) {
		this.setName(name);
		this.genre = genre;
		this.image = image;
		this.description = description;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
