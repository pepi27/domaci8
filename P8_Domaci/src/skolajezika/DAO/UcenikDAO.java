package skolajezika.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import skolajezika.Model.Ucenik;

public class UcenikDAO {

	public static ArrayList<Ucenik> getAll(Connection conn) {
		
		ArrayList<Ucenik> retVal = new ArrayList<>();
		
		try {
			String query = "SELECT * FROM ucenik";
			Statement st = conn.createStatement(); 
			ResultSet rs = st.executeQuery(query); 
			
			while(rs.next()) {
				
				Ucenik ucenik = new Ucenik(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
				retVal.add(ucenik); 
			}
			
			st.close();
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return retVal; 
	}
}
