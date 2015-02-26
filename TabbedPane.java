
//een jframe met info, heeft alleen een event object (het desbetreffende event) en een boolean met daarin true of false (slaande op je wel of niet met het event wilt starten) nodig.
//Voorderest heeft dit niks nodig en is het een apart openend JFrame wat gewoon weer afgesloten kan worden.
import javax.swing.JFrame;
import javax.swing.JTabbedPane;

public class TabbedPane extends JFrame{

	public TabbedPane(Event event, boolean eventSelected)
	{
		super("info GUI");
		JTabbedPane tab = new JTabbedPane();
		tab.add("Event", new EventPanel(event));
		tab.add("Artist", new ArtistPanel(event));
		if(eventSelected)
		{
			tab.setSelectedIndex(0);
		}
		else
		{
			tab.setSelectedIndex(1);
		}
		setContentPane(tab);
		setSize(480, 410);
		setVisible(true);
	}
}