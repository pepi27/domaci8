package skolajezika.UI;

import java.sql.Connection;
import java.sql.DriverManager;

import skolajezika.DAO.UserDAO;
import skolajezika.utils.PomocnaKlasa;

public class AppUI {

	private static String admin = "petar";
	private static boolean isAdmin;
	private static boolean canLog;
	public static Connection conn;

	static {
		try {

			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/skolajezika", "root", "eEflakjv39fE!fjd");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		System.out.println(" ## Dobrodosli u skolu jezika ##");
		System.out.println("Unesite username: ");

		String username = PomocnaKlasa.ucitajTekst();

		System.out.println("Unesite password: ");

		String password = PomocnaKlasa.ucitajTekst();

		canLog = UserDAO.checkCredentials(conn, username, password);
		isAdmin = username.equals(admin);

		if (isAdmin && canLog) {

			int choice = -1;

			while (choice != 0) {

				System.out.println("1.O skoli");
				System.out.println("2.Predavaci");
				System.out.println("3.Ucenici");
				System.out.println("4.Kursevi");
				System.out.println("5.Uplate");
				System.out.println("0.EXIT");

				System.out.println("Unesi odluku : ");
				choice = PomocnaKlasa.ucitajBroj();

				switch (choice) {
				case 0:
					System.out.println("Dovidjenja");
					break;
				case 1:
					SkolaUI.ispisiPodatkeOSkoli();
					break;
				case 2:
					NastavnikUI.prikaziSveNastavnike();
					break;
				case 3:
					UcenikUI.prikaziSveUcenike();
					break;
				case 4:
					KursUI.informacijeKursevi();
					break;
				case 5:
					UplataUI.informacijeUplate();
					break;
				default:
					break;
				}
			}
		}

		if (!isAdmin && canLog) {

			int choice = -1;

			while (choice != 0) {

				System.out.println("1.O skoli");
				System.out.println("2.Predavaci");
				System.out.println("3.Kursevi");
				System.out.println("0.EXIT");

				System.out.println("Unesi odluku : ");
				choice = PomocnaKlasa.ucitajBroj();

				switch (choice) {
				case 0:
					System.out.println("Dovidjenja");
					break;
				case 1:
					SkolaUI.ispisiPodatkeOSkoli();
					break;
				case 2:
					NastavnikUI.prikaziSveNastavnike();
					break;
				case 3:
					KursUI.informacijeKursevi();
					break;
				default:
					break;

				}
			}
		}
	}
}
