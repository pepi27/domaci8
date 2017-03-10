package skolajezika.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import skolajezika.Model.Kurs;
import skolajezika.Model.Nastavnik;
import skolajezika.Model.Ucenik;
import skolajezika.UI.NastavnikUI;
import skolajezika.UI.UcenikUI;

public class KursDAO {

	

	public static ArrayList<Kurs> getAll(Connection conn) {
		ArrayList<Kurs> retVal = new ArrayList<Kurs>();
		ArrayList<Ucenik> ucenici = new ArrayList<>();
		try {
			String query = "SELECT k.kurs_id, jezik, tip, cena, nastavnik_id FROM kurs k ";
                         
			Statement stmt = conn.createStatement();
			ResultSet rset = stmt.executeQuery(query.toString());
			while (rset.next()) {
				
				String kId = rset.getString(1);
				String jezik = rset.getString(2);
				String tip = rset.getString(3);
				Double cena = rset.getDouble(4);
				Nastavnik nastavnik = NastavnikUI.getNastavnikById(rset.getInt(5));
				
				Kurs kurs = new Kurs(kId, jezik, tip, cena, nastavnik);
				
				
				
				String queryUcenik = "SELECT k.kurs_id, ucenik_id FROM kurs k "
						+"JOIN uplate u WHERE k.kurs_id = u.kurs_id";
				Statement stmt2 = conn.createStatement();
				ResultSet rset2 = stmt2.executeQuery(queryUcenik.toString());
				while(rset2.next()) {
					if(kurs.getId().equals(rset2.getString(1)))
						kurs.getSviUcenici().add(UcenikUI.getUcenikById(rset2.getInt(2)));
				}
				
				stmt2.close();
				rset2.close();
				
				retVal.add(kurs); 
				
			}
			rset.close();
			stmt.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return retVal;
	}
}
