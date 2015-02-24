

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.HashMap;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import org.apache.commons.lang3.time.DateUtils;

public class Window extends JFrame {
	
	private static HashMap<String, Panel> panels = new HashMap<String, Panel>();
	private static JPanel centerPanel;
	private static GregorianCalendar date;
	private static Agenda agenda;
	
	public Window()
	{
		/*
		 * Initialize window
		 */
		super("Agenda");
		agenda = new Agenda();
		
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		addWindowListener(new WindowAdapter() {
			 public void windowClosing(WindowEvent evt) {
			     onExit();
			 }
		});
		setSize(1200, 800);
		
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
		
        try {
			UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException
				| IllegalAccessException | UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}

		setJMenuBar(new MenuBar(this));
		
		
		/*
		 * Create Panels
		 */
		
		//Agenda Panels
		Panel tablePanel = new PanelTable();
		panels.put("table", tablePanel);
		
		//Main Panels
		JPanel mainPanel = new JPanel(new BorderLayout());
		centerPanel = new JPanel(new BorderLayout());
		centerPanel.setBackground(Color.WHITE);
		JPanel bottomPanel = new JPanel();
		bottomPanel.setBackground(Color.DARK_GRAY);
		
		date = new GregorianCalendar();
		SimpleDateFormat formatter=new SimpleDateFormat("dd-MM-yyyy");
		JLabel dateLabel = new JLabel(formatter.format(date.getTime()));
		dateLabel.setForeground(Color.WHITE);
		bottomPanel.add(dateLabel);
		
		//Add panels
		mainPanel.add(centerPanel, BorderLayout.CENTER);
		mainPanel.add(bottomPanel, BorderLayout.SOUTH);
		
		setContentPane(mainPanel);
		
		updatePanel("table2");
		
		//Show window
		setVisible(true);
	}
	
	public static void updatePanel(String panel)
	{
		if(centerPanel.getComponents().length > 0)
		{
			centerPanel.remove(0);
		}
		Panel p = panels.get(panel);
		p.update(getEvents());
		JPanel p1 = (JPanel)p;
		p1.setPreferredSize(centerPanel.getSize());
		centerPanel.add(p1, BorderLayout.CENTER);
		centerPanel.repaint();
		p1.repaint();
	}
	
	public void onExit() {
		if(JOptionPane.showConfirmDialog(null, "Are you sure you want to close this program?", "Close Agenda", JOptionPane.YES_NO_OPTION) == JOptionPane.OK_OPTION)
		{
			System.exit(0);
		}
	}
	
	public static ArrayList<Event> getEvents()
	{
		ArrayList<Event> events = new ArrayList<Event>();
		for(Event e : agenda.getEvents())
		{
			if(DateUtils.isSameDay(e.getStartDate(), date) || DateUtils.isSameDay(e.getEndDate(), date))
			{
				events.add(e);
			}
		}
		
		return events;
	}
	
	public Agenda getAgenda()
	{
		return agenda;
	}
	
	
}
