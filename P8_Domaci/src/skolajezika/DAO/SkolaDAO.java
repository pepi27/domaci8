package skolajezika.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import skolajezika.Model.Skola;

public class SkolaDAO {

	

	public static Skola getSkola(Connection conn) {
		Skola retVal = null;
		try {
			String query = "SELECT * FROM skola"; 
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(query);
			
			while(rs.next()) {
				String PIB = rs.getString(1);
				String naziv = rs.getString(2);
				String adresa = rs.getString(3);
				String telefon = rs.getString(4);
				String email = rs.getString(5);
				String websajt = rs.getString(6);
				String maticni_broj = rs.getString(7);
				String ziro_racun = rs.getString(8);
				retVal = new Skola(PIB, naziv, adresa, telefon, email, websajt, maticni_broj, ziro_racun);
			}
			
			st.close();
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return retVal; 
	}

}
