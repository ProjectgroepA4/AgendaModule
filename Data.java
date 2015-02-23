import java.util.ArrayList;

public class Data {

	private ArrayList<Stage> stages;
	private ArrayList<Event> events;
	private ArrayList<Artist> artists;
	
	public Data() {
		stages = new ArrayList<>();
		events = new ArrayList<>();
		artists = new ArrayList<>();
	}
	
	private void addStage(Stage stage) {
		stages.add(stage);
	}
	
	private void addEvent(Event event) {
		events.add(event);
	}
	
	private void addArtist(Artist artist) {
		artists.add(artist);
	}
	
	public void makeArtist(String name, String genre, String image, String description) {
		Artist artist = new Artist(name,genre,image,description);
		addArtist(artist);
	}
	
	/*public void makeEvent(Artist artist, int startTime, int endTime, String description) {
		Event event = new Event(artist, startTime, endTime,description);
		addEvent(event);
	}
	
	public void makeStage(int expectedPopularity, String description) {
		Stage stage = new Stage(expectedPopularity, description);
		addStage(stage);
	}*/
	
	
}
