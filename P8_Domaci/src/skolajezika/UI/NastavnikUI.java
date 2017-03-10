package skolajezika.UI;

import java.util.ArrayList;

import skolajezika.DAO.NastavnikDAO;
import skolajezika.Model.Nastavnik;

public class NastavnikUI {

	public static ArrayList<Nastavnik> sviNastavnici = new ArrayList<>();
	
	public static void prikaziSveNastavnike() {
		
		sviNastavnici =	NastavnikDAO.getAll(AppUI.conn);
		
		for(Nastavnik n : sviNastavnici) {
			System.out.println(n.toString());
		}
	}

	public static Nastavnik getNastavnikById(int int1) {
		sviNastavnici =	NastavnikDAO.getAll(AppUI.conn);
		Nastavnik retVal = null;
		
		for(Nastavnik n : sviNastavnici) {
			if(n.getId() == int1) {
				retVal = n; 
				break; 
			}
		}
		
		return retVal;
	}

}
