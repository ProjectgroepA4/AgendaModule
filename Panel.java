import java.util.GregorianCalendar;

import javax.swing.JPanel;

public class Panel extends JPanel
{
	private GregorianCalendar date;
	
	public Panel(GregorianCalendar calendar)
	{
		date = calendar;
	}
	
	public GregorianCalendar getDate()
	{
		return date;
	}
	public void setDate(GregorianCalendar calendar)
	{
		date = calendar;
	}
}
