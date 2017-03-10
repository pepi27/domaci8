package skolajezika.Model;

public class Skola {

	private String naziv, adresa, telefon,
	email, websajt, PIB, maticniBroj, brojZiroRacuna;

	public Skola(String naziv, String adresa, String telefon, String email, String websajt, String PIB,
			String maticniBroj, String brojZiroRacuna) {
		super();
		this.naziv = naziv;
		this.adresa = adresa;
		this.telefon = telefon;
		this.email = email;
		this.websajt = websajt;
		this.PIB = PIB;
		this.maticniBroj = maticniBroj;
		this.brojZiroRacuna = brojZiroRacuna;
	}

	public String getNaziv() {
		return naziv;
	}

	public String getAdresa() {
		return adresa;
	}

	public String getTelefon() {
		return telefon;
	}

	public String getEmail() {
		return email;
	}

	public String getWebsajt() {
		return websajt;
	}

	public String getPIB() {
		return PIB;
	}

	public String getMaticniBroj() {
		return maticniBroj;
	}

	public String getBrojZiroRacuna() {
		return brojZiroRacuna;
	}

	@Override
	public String toString() {
		return "Skola [naziv=" + naziv + ", adresa=" + adresa + ", telefon=" + telefon + ", email=" + email
				+ ", websajt=" + websajt + ", PIB=" + PIB + ", maticniBroj=" + maticniBroj + ", brojZiroRacuna="
				+ brojZiroRacuna + "]";
	}

	
}
