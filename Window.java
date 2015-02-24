

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Window extends JFrame {
	
	private static HashMap<String, Panel> panels = new HashMap<String, Panel>();
	private static JPanel centerPanel;
	
	public Window()
	{
		/*
		 * Initialize window
		 */
		super("Agenda");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(1200, 800);
		
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
		
        try {
			UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException
				| IllegalAccessException | UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}

		setJMenuBar(new MenuBar());
		
		
		/*
		 * Create Panels
		 */
		ArrayList<Event> events = new ArrayList<Event>();
		events.add(new Event(2015, 2, 24, 12, 21, 2015, 2, 24, 13, 23, new Artist("Kenneth van Ewijk", "PeopMuziek", "null", "Cool vent"), "Leuke dingen deon", 2, 1));
		panels.put("table", new PanelTable(events, null));
		
		JPanel mainPanel = new JPanel(new BorderLayout());
		centerPanel = new JPanel();
		JPanel bottomPanel = new PanelDate();
		mainPanel.add(centerPanel, BorderLayout.CENTER);
		mainPanel.add(bottomPanel, BorderLayout.SOUTH);
		
		setContentPane(mainPanel);
		
		updatePanel("table");
		
		setVisible(true);
	}
	
	public static void updatePanel(String panel)
	{
		centerPanel.removeAll();
		centerPanel.add(panels.get(panel));
		centerPanel.repaint();
	}
}
