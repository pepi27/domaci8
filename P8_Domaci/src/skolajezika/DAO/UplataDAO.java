package skolajezika.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import skolajezika.Model.Uplata;
import skolajezika.UI.UcenikUI;

public class UplataDAO {

	public static ArrayList<Uplata> getAll(Connection conn) {
		ArrayList<Uplata> retVal = new ArrayList<>();
		
		try {
			String query = "Select * from uplate"; 
			Statement st = conn.createStatement(); 
			ResultSet rs = st.executeQuery(query);
			
			while(rs.next()) {
				Uplata up = new Uplata(rs.getInt(1), UcenikUI.getUcenikById(rs.getInt(2)));
				retVal.add(up); 
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return retVal; 
	}
}
