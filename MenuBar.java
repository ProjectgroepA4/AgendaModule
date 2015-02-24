import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;


public class MenuBar extends JMenuBar {

	private static final long serialVersionUID = -2095136277753179215L;

	
	public MenuBar(Window w)
	{
		super();
		
		/*
		 * FILE
		 */
		JMenu file = new JMenu("File");
		
		JMenuItem newEvent = new JMenuItem("New Event");
		newEvent.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK));
		newEvent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//TODO
			}
		});
		
		JMenuItem open = new JMenuItem("Open");
		open.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, ActionEvent.CTRL_MASK));
		open.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				w.getAgenda().loadAgenda();
			}
		});
		
		JMenuItem save = new JMenuItem("Save");
		save.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));
		save.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				w.getAgenda().saveAgenda();
			}
		});
		
		JMenuItem exit = new JMenuItem("Exit"); 
		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		file.add(newEvent);
		file.addSeparator();
		file.add(open);
		file.add(save);
		file.addSeparator();
		file.add(exit);
		add(file);
		
		
		/*
		 * VIEW
		 */
		
		JMenu view = new JMenu("View");
		
		JMenuItem timeline = new JMenuItem("Timeline");
		timeline.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Window.updatePanel("timeline");
			}
		});
		
		JMenuItem table = new JMenuItem("Table");
		table.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Window.updatePanel("table");
			}
		});
		JMenuItem table2 = new JMenuItem("Table 2");
		table2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Window.updatePanel("table2");
			}
		});
		
		view.add(timeline);
		view.add(table);
		view.add(table2);
		add(view);
	}
}
