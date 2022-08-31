package launcher;

import entities.Student;
import gui.SimplePresentationScreen;



public class Launcher {
	
	private SimplePresentationScreen pane;
	
	public static void main(String [] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
        	public void run() {
				try {
					Launcher window = new Launcher();
					window.pane.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
        });
    }
	
	public Launcher() {
		Student FB = new Student(134462, "Baruffetti", "Facundo", "facubaru4@gmail.com", "https://github.com/FacundoBaruffetti", "5b33c645-825b-4f77-9cd1-062bc5e69ea7.jpg");
		pane = new SimplePresentationScreen(FB);
	}
}