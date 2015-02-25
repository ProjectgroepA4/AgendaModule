import java.awt.BorderLayout;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class GUI extends JFrame
{
	private Timeline timeline;
	
	public GUI() 
	{
		super("Gui");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

//		JPanel contentPane = new JPanel(new BorderLayout());
//		this.setContentPane(contentPane);
//		this.setSize(600, 600);
//		this.setVisible(true);
//		System.out.println(contentPane.getWidth());
//		timeline = new Timeline(contentPane);
//		contentPane.add(timeline,BorderLayout.CENTER);
//		contentPane.add(timeline.createWestPanel(), BorderLayout.WEST);
//		timeline.refresh();
		TimelinePanel panel = new TimelinePanel();
		this.setContentPane(panel);
		this.setSize(600, 600);
		this.setVisible(true);

		this.getRootPane().addComponentListener(new ComponentAdapter() 
		{
			public void componentResized(ComponentEvent e) {
                panel.refresh();
            }
		});
		
		
		
		


	}

	public static void main(String[] args) 
	{
		new GUI();
	}

}
