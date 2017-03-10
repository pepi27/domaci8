package skolajezika.UI;

import java.util.ArrayList;

import skolajezika.DAO.UplataDAO;
import skolajezika.Model.Uplata;

public class UplataUI {

	public static ArrayList<Uplata> sveUplate = new ArrayList<>();
	
	public static void informacijeUplate() {
		sveUplate = UplataDAO.getAll(AppUI.conn); 
	
		for(Uplata u : sveUplate) {
			System.out.println(u.toString());
		}
	}
}
