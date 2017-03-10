package skolajezika.UI;

import java.util.ArrayList;

import skolajezika.DAO.NastavnikDAO;
import skolajezika.DAO.UcenikDAO;
import skolajezika.Model.Nastavnik;
import skolajezika.Model.Ucenik;

public class UcenikUI {

	public static ArrayList<Ucenik> sviUcenici = new ArrayList<>();
	
	public static void prikaziSveUcenike() {
		 sviUcenici = UcenikDAO.getAll(AppUI.conn);
		
		 for(Ucenik u : sviUcenici) {
			 System.out.println(u.toString());
		 }
	}

	public static Ucenik getUcenikById(int int1) {
		sviUcenici = UcenikDAO.getAll(AppUI.conn);
		Ucenik retVal = null;
		
		for(Ucenik u  : sviUcenici) {
			if(u.getId() == int1) {
				retVal = u; 
				break; 
			}
		}
		
		return retVal; 
		
	}

	public static ArrayList<Ucenik> getUceniciKojiPohadjajuId(int int1) {
		sviUcenici = UcenikDAO.getAll(AppUI.conn);
		ArrayList<Ucenik> retVal = new ArrayList<>(); 
		Ucenik ucenik = null ;
		
		for(Ucenik u  : sviUcenici) {
			if(u.getId() == int1) {
				retVal.add(u);
				
			}
		}
		return retVal;
	}

	
}
