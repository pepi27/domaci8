package skolajezika.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import skolajezika.Model.User;

public class UserDAO {

	public static ArrayList<User> users = new ArrayList<>();

	public static boolean checkCredentials(Connection conn, String user, String pass) {
		boolean logon = false;
		String username = "", password = "";
		try {
			String query = "SELECT username, password FROM users";
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(query);

			while (rs.next()) {
				User userObj = new User(rs.getString(1), rs.getString(2));
				users.add(userObj);

			}
			
				for (User u : users) {
					if ((u.getUsername().equals(user)) && (u.getPassword().equals(pass))) {
						System.out.println("good");
						logon = true;
						
					}
				}
			
                if(!logon) {
                	System.out.println("wrong username or pass");
                }
				
			st.close();
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return logon;
	}
}
