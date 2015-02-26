import java.awt.Dimension;
import java.util.ArrayList;

import javax.swing.AbstractListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class PanelArtSta extends JPanel implements Panel{

	private Agenda a;
	JList artists;
	JList stages;
	Object[] dataArtist;
	Object[] dataStage;
	
	public PanelArtSta(Window w)
	{
		super();
		a = w.getAgenda();
		
		artists = new JList();
		artists.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		artists.setLayoutOrientation(JList.VERTICAL_WRAP);
		artists.setVisibleRowCount(-1);
		artists.addListSelectionListener(new ListSelectionListener() {
			@Override
			public void valueChanged(ListSelectionEvent e) {
				if (e.getValueIsAdjusting() == false) {

			        if (artists.getSelectedIndex() == -1) {
			        } else {
			            new EditArtistPanel(w.getAgenda(), a.getArtists().get(artists.getSelectedIndex()));
			            artists.clearSelection();
			        }
			    }
			}
		});
		JScrollPane artistScroller = new JScrollPane(artists);
		artistScroller.setPreferredSize(new Dimension(250, 80));
		
		stages = new JList();
		stages.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		stages.setLayoutOrientation(JList.VERTICAL_WRAP);
		stages.setVisibleRowCount(-1);
		stages.addListSelectionListener(new ListSelectionListener() {
			@Override
			public void valueChanged(ListSelectionEvent e) {
				if (e.getValueIsAdjusting() == false) {

			        if (stages.getSelectedIndex() == -1) {
			        } else {
			        	new EditStagePanel(w.getAgenda(), a.getStages().get(stages.getSelectedIndex()));
			            stages.clearSelection();
			        }
			    }
			}
		});
		JScrollPane stageScroller = new JScrollPane(stages);
		stageScroller.setPreferredSize(new Dimension(250, 80));
		
		add(artistScroller);
		add(stageScroller);
	}
	
	
	public void compileData()
	{
		int artists = a.getArtists().size();
		int stages = a.getStages().size();
		dataArtist = new Object[artists];
		dataStage = new Object[stages];
		
		for(int i = 0; i < artists; i++)
		{
			dataArtist[i] = a.getArtists().get(i);
		}
		for(int i = 0; i < stages; i++)
		{
			dataStage[i] = a.getStages().get(i);
		}
	}
	
	@Override
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void update(ArrayList<Event> event) {
		compileData();
		AbstractListModel artistsList = new ContentList(dataArtist);
		AbstractListModel stagesList = new ContentList(dataStage);
		artists.setModel(artistsList);
		stages.setModel(stagesList);
	}

}
