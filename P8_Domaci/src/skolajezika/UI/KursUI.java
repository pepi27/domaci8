package skolajezika.UI;

import java.util.ArrayList;

import skolajezika.DAO.KursDAO;
import skolajezika.Model.Kurs;

public class KursUI {

	public static ArrayList<Kurs> sviKursevi = new ArrayList<Kurs>();
	
	public static void informacijeKursevi() {
		
		sviKursevi = KursDAO.getAll(AppUI.conn); 
		
		for(Kurs k : sviKursevi) {
			System.out.println(k.toString());
		}
		
	}

}
