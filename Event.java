import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class Event implements Serializable {

	private static final long serialVersionUID = 1;

	private String eventName;
	private GregorianCalendar startDate;
	private GregorianCalendar endDate;
	private Artist artist;
	private Stage stage;
	private String description;
	private int expectedPopularity;

	public Event(String eventName, int startYear, int startMonth, int startDay,
			int startHour, int startMinute, int endYear, int endMonth,
			int endDay, int endHour, int endMinute, Artist artist, Stage stage,
			String description, int expectedPopularity) {
		this.eventName = eventName;
		this.startDate = new GregorianCalendar(startYear, startMonth - 1,
				startDay, startHour, startMinute);
		this.endDate = new GregorianCalendar(endYear, endMonth - 1, endDay,
				endHour, endMinute);
		this.stage = stage;
		this.artist = artist;
		this.description = description;
		this.expectedPopularity = expectedPopularity;
	}

	public Event(String eventName, GregorianCalendar startDate,
			GregorianCalendar endDate, Artist artist, Stage stage,
			String description, int expectedPopularity) {
		this.eventName = eventName;
		this.startDate = startDate;
		this.endDate = endDate;
		this.artist = artist;
		this.stage = stage;
		this.description = description;
		this.expectedPopularity = expectedPopularity;
	}

	public String getEventName() {
		return this.eventName;
	}

	public GregorianCalendar getStartDate() {
		return this.startDate;
	}

	public GregorianCalendar getEndDate() {
		return this.endDate;
	}

	public Artist getArtist() {
		return this.artist;
	}

	public String getDescription() {
		return this.description;
	}

	public Stage getStage() {
		return this.stage;
	}

	public int getExpectedPopularity() {
		return this.expectedPopularity;
	}

	public void setEventName(String name) {
		this.eventName = name;
	}

	public void setStartDate(int startYear, int startMonth, int startDay,
			int startHour, int startMinute) {
		startDate.set(startYear, startMonth - 1, startDay, startHour,
				startMinute);
	}

	public void setStartDate(GregorianCalendar startDate) {
		this.startDate = startDate;
	}

	public void setEndDate(int endYear, int endMonth, int endDay, int endHour,
			int endMinute) {
		endDate.set(endYear, endMonth - 1, endDay, endHour, endMinute);
	}

	public void setEndDate(GregorianCalendar endDate) {
		this.endDate = endDate;
	}

	public void setArtist(Artist artist) {
		this.artist.setName(artist.getName());
		this.artist.setGenre(artist.getGenre());
		this.artist.setImageIcon(artist.getImage());
		this.artist.setDescription(artist.getDescription());
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setExpectedPopularity(int popularity) {
		this.expectedPopularity = popularity;
	}

	public void setStage(Stage stage) {
		this.stage = stage;
	}
	
	public GregorianCalendar getLength()
	{
		GregorianCalendar length = endDate;
		System.out.println(endDate.getTime());
		return length;
	}

	public String toString() {
		DateFormat format = new SimpleDateFormat("dd-MM-yyyy");
		format.setLenient(false);

		return artist.getName() + " plays from "
				+ format.format(startDate.getTime()) + " to "
				+ format.format(endDate.getTime()) + ".";
	}
}
