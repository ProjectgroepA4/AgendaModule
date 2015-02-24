import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;


public class MenuBar extends JMenuBar {

	private static final long serialVersionUID = -2095136277753179215L;

	
	public MenuBar()
	{
		super();
		
		/*
		 * FILE
		 */
		JMenu file = new JMenu("File");
		
		JMenuItem open = new JMenuItem("Open");
		open.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, ActionEvent.CTRL_MASK));
		open.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object obj = SaveLoad.loadFile();
			}
		});
		
		JMenuItem save = new JMenuItem("Save");
		save.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));
		save.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SaveLoad.saveFile(new Object());
			}
		});
		
		JMenuItem exit = new JMenuItem("Exit"); 
		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
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
		
		view.add(timeline);
		view.add(table);
		add(view);
		
		
		/*
		 * SORT
		 */
		
		JMenu sort = new JMenu("Sort");
		
		JMenuItem sort_name = new JMenuItem("Name");
		sort_name.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//TODO
			}
		});
		
		JMenuItem sort_date = new JMenuItem("Date");
		sort_date.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//TODO
			}
		});
		
		sort.add(sort_name);
		sort.add(sort_date);
		add(sort);
	}
}
