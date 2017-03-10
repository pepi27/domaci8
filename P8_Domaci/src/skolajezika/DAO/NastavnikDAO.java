package skolajezika.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import skolajezika.Model.Nastavnik;

public class NastavnikDAO {

	public static ArrayList<Nastavnik> getAll(Connection conn) {
		
		ArrayList<Nastavnik> retVal = new ArrayList<>();
		
		try {
			String query = "SELECT * FROM nastavnik"; 
			Statement st = conn.createStatement(); 
			ResultSet rs = st.executeQuery(query); 
			
			while (rs.next()) {
				
				Nastavnik nastavnik = 
					new Nastavnik(rs.getInt(1), 
								  rs.getString(2), 
						          rs.getString(3), 
						          rs.getString(4),
						          rs.getString(5));
				retVal.add(nastavnik); 
			}
			rs.close();
			st.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return retVal; 
	}
}
