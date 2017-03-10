package test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import skolajezika.DAO.UcenikDAO;
import skolajezika.Model.Ucenik;
import skolajezika.UI.AppUI;

public class UcenikTest {

	@Test
	public void testGetAll() {
		UcenikDAO tester = new UcenikDAO();
	
		ArrayList<Ucenik> testUcenici = tester.getAll(AppUI.conn);
		
		assertEquals(3, testUcenici.size()); 
	}

}
