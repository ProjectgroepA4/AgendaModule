import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class frame extends JFrame {

	private static final long serialVersionUID = 1L;
	private ArrayList<Event> events;
	private TabelPanel paneel;
	
	public static void main(String args[]) {
		frame frameee = new frame();
		
	}
	
	public frame() {
		fillArray();
		setDefaultCloseOperation(EXIT_ON_CLOSE);			
		paneel = new TabelPanel(events);
		getContentPane().add(paneel);
		JButton button;	
		JPanel botPanel = new JPanel();
		button = new JButton("Filta");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { paneel.filter(); }
		});
		botPanel.add(button);
		button = new JButton("Reset filta");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { paneel.refreshContent(events,true); }
		});
		botPanel.add(button);
		add(botPanel,BorderLayout.SOUTH);
		pack();
		setSize(800,600);
		setVisible(true);		
	}
	
	private void fillArray() {
		Artist artist1 = new Artist("John","","","");
		Artist artist2 = new Artist("Jan","","","");
		Artist artist3 = new Artist("Jaap","","","");
		Artist artist4 = new Artist("Banaan","","","");
		Artist artist5 = new Artist("Josti","","","");
		Stage stage1 = new Stage("podia1",1,"");
		Stage stage2 = new Stage("podia2",1,"");
		Stage stage3 = new Stage("podia3",1,"");
		Stage stage4 = new Stage("podia4",1,"");
		Stage stage5 = new Stage("podia5",1,"");
		events = new ArrayList<>();
		events.add(new Event("event1",stage1,artist1,1605,1640,""));
		events.add(new Event("event2",stage1,artist2,1605,1640,""));
		events.add(new Event("event3",stage3,artist3,1605,1640,""));
		events.add(new Event("event4",stage1,artist4,1605,1640,""));
		events.add(new Event("event5",stage5,artist5,1605,1640,""));
	}
	
	private void fillArray2() {
		Artist artist1 = new Artist("2","","","");
		Artist artist2 = new Artist("2","","","");
		Artist artist3 = new Artist("2","","","");
		Artist artist4 = new Artist("2","","","");
		Artist artist5 = new Artist("2","","","");
		Stage stage1 = new Stage("podia1",1,"");
		Stage stage2 = new Stage("podia2",1,"");
		Stage stage3 = new Stage("podia3",1,"");
		Stage stage4 = new Stage("podia4",1,"");
		Stage stage5 = new Stage("podia5",1,"");
		events = new ArrayList<>();
		events.add(new Event("event1",stage1,artist1,1605,1640,""));
		events.add(new Event("event2",stage1,artist2,1605,1640,""));
		events.add(new Event("event3",stage3,artist3,1605,1640,""));
		events.add(new Event("event4",stage4,artist4,1605,1640,""));
		events.add(new Event("event5",stage1,artist5,1605,1640,""));
	}
	
	public void refresh() {
		fillArray2();
		paneel.refreshContent(events,true);
	}

}
