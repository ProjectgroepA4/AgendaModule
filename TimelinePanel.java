import java.awt.BorderLayout;

import javax.swing.JPanel;


public class TimelinePanel extends JPanel {

	private Timeline timeline;
	
	public TimelinePanel() 
	{
		super(new BorderLayout());
		
		this.setSize(600, 600);
		this.setVisible(true);
		timeline = new Timeline(this);
		this.add(timeline,BorderLayout.CENTER);
		this.add(timeline.createWestPanel(), BorderLayout.WEST);
	}
	
	public void refresh()
	{
		timeline.refresh();
	}

}
