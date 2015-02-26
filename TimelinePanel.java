import java.awt.BorderLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;


public class TimelinePanel extends JPanel implements Panel {

	private Timeline timeline;
	
	public TimelinePanel() 
	{
		super(new BorderLayout());
		
		this.setSize(1920, 1080);
		this.setVisible(true);
		timeline = new Timeline(this);
		this.add(timeline,BorderLayout.CENTER);
		this.add(timeline.createWestPanel(), BorderLayout.WEST);
	}
	
	public void refresh()
	{
		this.removeAll();	
		this.add(timeline.createMainPanel(),BorderLayout.CENTER);
		this.add(timeline.createWestPanel(), BorderLayout.WEST);
		this.revalidate();
	}

	@Override
	public void update(ArrayList<Event> events) 
	{
		timeline.setEvents(events);
		System.out.println(events.size());
		
		//dit fixt het half
//		if(events.size() == 0)
//		{
//			this.removeAll();
//			this.add(timeline.createWestPanel(),BorderLayout.WEST);
//			this.add(timeline, BorderLayout.CENTER);
//			this.revalidate();
//		}
//		else
//		{
//			refresh();
//		}
		refresh();
		
	}
	
	public TimelinePanel getTimelinePanel()
	{
		return this;
	}

}
