package nl.kennyboy;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class Event implements Serializable, Comparable<Event>
{
	private static final long serialVersionUID = -8412700922907201793L;
	
	GregorianCalendar startDate;
	GregorianCalendar endDate;
	String name;
	String desc;
	
	public Event(GregorianCalendar startDate, GregorianCalendar endDate, String name, String desc)
	{
		this.startDate = startDate;
		this.endDate = endDate;
		this.name = name;
		this.desc = desc;
	}
	public Event(int startYear, int startMonth, int startDay, int endYear, int endMonth, int endDay, String name, String desc)
	{
		this(new GregorianCalendar(startYear, startMonth-1, startDay), new GregorianCalendar(endYear, endMonth-1, endDay),name, desc); 
	}
	
	//Getters and Setters
	public GregorianCalendar getStartDate() {
		return startDate;
	}
	public void setStartDate(GregorianCalendar startDate) {
		this.startDate = startDate;
	}
	public GregorianCalendar getEndDate() {
		return endDate;
	}
	public void setEndDate(GregorianCalendar endDate) {
		this.endDate = endDate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public int compareTo(Event o) {
		if(startDate.before(o.getStartDate()))
		{
			return -1;
		}
		if(startDate.after(o.getStartDate()))
		{
			return 1;
		}
		if(startDate.equals(o.getStartDate()))
		{
			return 0;
		}
		
		return 0;
	}
	
	public String toString()
	{
		DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		formatter.setLenient(false);
		
		return name + " from " + formatter.format(startDate.getTime()) + " to " + formatter.format(endDate.getTime());
	}
	
	
}
