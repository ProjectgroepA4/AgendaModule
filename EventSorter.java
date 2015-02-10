package nl.kennyboy;

import java.io.Serializable;
import java.util.Comparator;


public class EventSorter implements Serializable, Comparator<Event> {

	public enum Mode {
		SORT_ASC,
		SORT_DESC,
		SORT_LENGTH_ASC,
		SORT_LENGTH_DESC
	}
	
	Mode mode;
	
	public EventSorter(Mode mode)
	{
		this.mode = mode;
	}
	
	public void changeMode(Mode mode)
	{
		this.mode = mode;
	}
	
	public String getModeDesc()
	{
		switch(mode)
		{
			default:
			case SORT_ASC:
				return "alphabetically";
			case SORT_DESC:
				return "reverse alphabetically";
			case SORT_LENGTH_ASC:
				return "shortest first";
			case SORT_LENGTH_DESC:
				return "longstest first";
		}
	}
	
	@Override
	public int compare(Event asp1, Event asp2) {
		
		switch(mode)
		{
			default:
			case SORT_ASC:
				return sortAsc(asp1, asp2);
			case SORT_DESC:
				return sortDesc(asp1, asp2);
			case SORT_LENGTH_ASC:
				return sortLenAsc(asp1, asp2);
			case SORT_LENGTH_DESC:
				return sortLenDesc(asp1, asp2);
		}
	}
	
	public int sortAsc(Event asp1, Event asp2)
	{
		if(asp1.getStartDate().before(asp2.getStartDate()))
		{
			return -1;
		}
		if(asp1.getStartDate().after(asp2.getStartDate()))
		{
			return 1;
		}
		if(asp1.getStartDate().equals(asp2.getStartDate()))
		{
			return 0;
		}
		return 0;
	}
	
	public int sortDesc(Event asp1, Event asp2)
	{
		if(asp1.getStartDate().after(asp2.getStartDate()))
		{
			return -1;
		}
		if(asp1.getStartDate().before(asp2.getStartDate()))
		{
			return 1;
		}
		if(asp1.getStartDate().equals(asp2.getStartDate()))
		{
			return 0;
		}
		return 0;
	}
	
	public int sortLenAsc(Event asp1, Event asp2)
	{
		long len1 = asp1.getEndDate().getTimeInMillis() - asp1.getStartDate().getTimeInMillis();
		long len2 = asp2.getEndDate().getTimeInMillis() - asp2.getStartDate().getTimeInMillis();
		
		if(len1 < len2)
		{
			return -1;
		}
		if(len2 < len1)
		{
			return 1;
		}
		if(len1 == len2)
		{
			return 0;
		}
		return 0;
	}
	
	public int sortLenDesc(Event asp1, Event asp2)
	{
		long len1 = asp1.getEndDate().getTimeInMillis() - asp1.getStartDate().getTimeInMillis();
		long len2 = asp2.getEndDate().getTimeInMillis() - asp2.getStartDate().getTimeInMillis();
		
		if(len1 > len2)
		{
			return -1;
		}
		if(len2 > len1)
		{
			return 1;
		}
		if(len1 == len2)
		{
			return 0;
		}
		return 0;
	}

}
