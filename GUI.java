import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

import javax.swing.JFrame;


public class GUI extends JFrame
{
	private Timeline timeline;
	
	public GUI() 
	{
		super("Gui");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(600, 600);
		timeline = new Timeline(this);
		
		
		this.setContentPane(timeline.getTimeline());
		this.getRootPane().addComponentListener(new ComponentAdapter() 
		{
			public void componentResized(ComponentEvent e) {
                timeline.refresh();
            }
		});
		
		
		
		
		this.setVisible(true);

	}

	public static void main(String[] args) 
	{
		new GUI();
	}

}
