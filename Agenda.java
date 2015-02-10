package nl.kennyboy;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.GregorianCalendar;

import nl.kennyboy.EventSorter.Mode;

public class Agenda implements Serializable {

	private static final long serialVersionUID = -383023632433640516L;
	
	ArrayList<Event> afspraken;
	EventSorter sort;
	
	public Agenda()
	{
		afspraken = new ArrayList<Event>();
		sort = new EventSorter(Mode.SORT_ASC);
	}
	
	public void add(Event afspraak)
	{
		afspraken.add(afspraak);
	}
	
	public void add(GregorianCalendar startDate, GregorianCalendar endDate, String name, String desc)
	{
		new Event(startDate, endDate, name, desc);
	}
	
	public void add(int startYear, int startMonth, int startDay, int endYear, int endMonth, int endDay, String name, String desc)
	{
		new Event(startYear, startMonth,startDay, endYear, endMonth, endDay, name, desc); 
	}
	
	public void sort(EventSorter.Mode mode)
	{
		sort.changeMode(mode);
		Collections.sort(afspraken, sort);
	}
	
	public String toString()
	{
		String str = "";
		str += "All event sorted " + sort.getModeDesc() +  ":\n";
		for(Event asp : afspraken)
		{
			str += "\t" + asp + "\n";
		}
		return str;
	}
	
}
