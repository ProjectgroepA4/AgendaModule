

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

public class ArtistPanel extends JPanel{

	public ArtistPanel(Event event)
	{
		super(new BorderLayout());
		JLabel name = new JLabel(event.getArtist().getName());
		
		name.setFont(new Font("Dialog", Font.BOLD, 20));
		JLabel description = new JLabel("<html>" + " <b> Genre: </b> " + event.getArtist().getGenre() + "<br> <br> <b> Beschrijving </b> <br> <br>" + event.getArtist().getDescription() + " <br> <br> <b> achtergrondinfo </b> <br> <br>" + event.getArtist().getBackground() + "</html>");
		description.setFont(new Font("Dialog", Font.PLAIN, 12));
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
		JLabel photo = new JLabel(event.getArtist().getImage());
		panel.add(name);
		panel.add(new JSeparator(SwingConstants.HORIZONTAL));
		add(photo, BorderLayout.EAST);
		add(description, BorderLayout.CENTER);
		add(panel, BorderLayout.NORTH);
	}
}
