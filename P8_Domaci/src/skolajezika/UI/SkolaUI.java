package skolajezika.UI;

import skolajezika.DAO.SkolaDAO;
import skolajezika.Model.Skola;

public class SkolaUI {

	public static Skola skola;
	public static void ispisiPodatkeOSkoli() {
		
		skola = SkolaDAO.getSkola(AppUI.conn);
		
		System.out.println(skola.toString());
		
	}

}
