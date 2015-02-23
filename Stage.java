import java.util.ArrayList;

public class Stage {

	private ArrayList<Event> events;
	private String name;
	private String description;
	private int expectedPopularity;
	
	public Stage(String name, int expectedPopularity, String description) {
		events = new ArrayList<>();
		this.setName(name);
		this.expectedPopularity = expectedPopularity;
		this.description = description;
	}
	
	public void addEvent(Event event) {
		events.add(event);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}		
}
