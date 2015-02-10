package nl.kennyboy;

import nl.kennyboy.EventSorter.Mode;

public class Main {

	public static void main(String[] args) {
		new Main();
	}
	
	Agenda agenda;
	Window window;
	
	public Main()
	{
		agenda = new Agenda();
		window = new Window();
		
		test();
	}
	
	
	public void test()
	{
		/*
		agenda.add(new Event(2014, 12, 1, 2014, 12, 2, "School", "Doe iets op school"));
		agenda.add(new Event(2014, 11, 2, 2014, 11, 4, "School2", "Doe nog iets op school"));
		agenda.sort(Mode.SORT_LENGTH_DESC);
		window.setText(agenda + "");
		SaveLoad.saveFile(agenda);
		*/
		
		agenda = (Agenda) SaveLoad.loadFile();
		window.setText(agenda + "");
	}

}
