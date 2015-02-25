
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
//"Event", new EventPanel("Introductie", "Hoofdpodium", "14:00-15:00", "Populair", "Paul Lindelauf", "25-02-2015", "Het begin van het festival, wordt gepresenteerd door Paul Lindelauf. En ik moet nog een hele hoop onzin toevoegen om dit goed te kunnen testen, dus daarom doe ik dat nu ook maar even. En nog een hele hoop informatie vanwege REDENEN. En waarom de fuck hij nu wel ineens normaal kan doen weet ik niet, maar zal dus maar voor de volgende keer onthouden minder onzin te typen."
//"Artist", new ArtistPanel("Paul Lindelauf", "Paultje Lindelauf <br> <br> Paultje is de ster van de show en opent de voorstelling. Hierna komen de geweldige artiesten.<br> <br>", "Achtergrondinformatie<br> <br> Paul staat bekend als de man die zijn leerlingen treiterde met zijn diagrammen, leiderschap en Excel.", "src/content/Paul.jpg"