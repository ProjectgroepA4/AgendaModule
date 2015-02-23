public class Event {

	private Artist artist;
	private int startTime;
	private int endTime;
	private String description;
	private Stage stage;
	private String name;
	
	public Event(String name, Stage stage, Artist artist, int startTime, int endTime, String description) {
		if(artist != null)
			this.setArtist(artist);
		else 
			this.setArtist(null);
		this.startTime = startTime;
		this.setEndTime(endTime);
		this.description = description;
		this.setName(name);
		this.stage = stage;
	}
		
	public int getStartTime() {
		return startTime;
	}

	public int getEndTime() {
		return endTime;
	}

	public void setEndTime(int endTime) {
		this.endTime = endTime;
	}

	public Stage getStage() {
		return stage;
	}

	public void setStage(Stage stage) {
		this.stage = stage;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Artist getArtist() {
		return artist;
	}

	public void setArtist(Artist artist) {
		this.artist = artist;
	}
	
	
	
	
}
