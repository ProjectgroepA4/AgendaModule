package nl.kennyboy;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Window extends JFrame {

	private static final long serialVersionUID = 4468821981332661759L;
	
	JTextArea tarea;
	
	public Window()
	{
		super("Agenda");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500,600);
		JPanel contentPanel = new JPanel(); 
		
		tarea = new JTextArea(10,20);
		tarea.setEditable(false);
		
		contentPanel.add(tarea);
		setContentPane(contentPanel);
		setVisible(true);
	}
	
	public void setText(String str)
	{
		tarea.setText(str);
	}
	
}
