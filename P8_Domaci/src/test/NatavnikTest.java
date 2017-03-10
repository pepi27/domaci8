package test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import skolajezika.DAO.NastavnikDAO;
import skolajezika.Model.Nastavnik;
import skolajezika.UI.AppUI;

public class NatavnikTest {

	@Test
	public void testGetAll() {
		NastavnikDAO tester = new NastavnikDAO();
		Nastavnik nastavnik = new Nastavnik(1, "Petar", "Petrovic", "Petroviceva 12", "011123");
		Nastavnik nastavnik2 = new Nastavnik(2, "Milos", "Milosevic", "miloska 12", "012123");
		
		ArrayList<Nastavnik> zaTest = new ArrayList<>();
		zaTest.add(nastavnik); 
		zaTest.add(nastavnik2); 
		
		ArrayList<Nastavnik> nastavnici = tester.getAll(AppUI.conn);
		
		//assertEquals(nastavnici, zaTest);
		assertEquals(2, nastavnici.size());
		
	}

}
