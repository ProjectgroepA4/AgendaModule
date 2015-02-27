


public class Main {

	public static void main(String[] args) {
		//new Window();
		
		Window w = new Window();
		Agenda agn = w.getAgenda();
		
		Artist a1 = new Artist("Coldplay", "Alternative Rock", "null", "A band", "more important information");
		Artist a2 = new Artist("Nirvana", "Alternative Rock", "null", "A band whose lead singer is dead", "more important information");
		Artist a3 = new Artist("Eminem", "Rap", "null", "A very famous rapper", "more important information");
		Stage s1 = new Stage("Rock Stage", "Stage for Rock and Alternative Rock concerts");
		Stage s2 = new Stage("Rap Stage", "Stage for Rap concerts");
		
		Event e1 = new Event("Coldplay Live", 2015, 2, 24, 21, 00, 2015, 2,  24, 23, 00, a1, s1, "A concert from a very famous band", 2);
		Event e2 = new Event("Coldplay Live", 2015, 2, 25, 20, 00, 2015, 2,  25, 22, 00, a1, s1, "A concert from a very famous band", 1);
		Event e3 = new Event("Nirvana in memory", 2015, 2, 24, 16, 30, 2015, 2,  24, 20, 45, a2, s1, "A concert in memory of a once very famous band", 4);
		Event e4 = new Event("Epic Rap Battles of History", 2015, 3, 3, 12, 30, 2015, 3, 12, 18, 45, a3, s2, "Rap battle with Eminem and ERP", 3);
		Event e5 = new Event("Coldplay Live", 2015, 2, 26, 21, 00, 2015, 2,  24, 23, 00, a1, s1, "A concert from a very famous band", 2);
		Event e6 = new Event("Coldplay Live", 2015, 2, 27, 20, 00, 2015, 2,  25, 22, 00, a1, s1, "A concert from a very famous band", 1);
		Event e7 = new Event("Nirvana in memory", 2015, 2, 28, 16, 30, 2015, 2,  24, 20, 45, a2, s1, "A concert in memory of a once very famous band", 4);
		Event e8 = new Event("Epic Rap Battles of History", 2015, 3, 2, 12, 30, 2015, 3, 12, 18, 45, a3, s2, "Rap battle with Eminem and ERP", 3);
		
		agn.addEvent(e1);
		agn.addEvent(e2);
		agn.addEvent(e3);
		agn.addEvent(e4);
		agn.addEvent(e5);
		agn.addEvent(e6);
		agn.addEvent(e7);
		agn.addEvent(e8);
		
		agn.fillArtists();
		agn.fillStages();

		w.updatePanel();


	}

}
