package skolajezika.Model;

public class Nastavnik {

	private int id; 
	private String ime, prezime, adresa, telefon; 
	
	public Nastavnik () {}

	public Nastavnik(int id, String ime, String prezime, String adresa, String telefon) {
		this.id = id;
		this.ime = ime;
		this.prezime = prezime;
		this.adresa = adresa;
		this.telefon = telefon;
	}

	public int getId() {
		return id;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public String getAdresa() {
		return adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	public String getTelefon() {
		return telefon;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}

	@Override
	public String toString() {
		return "Nastavnik [ ime=" + getIme() + ", prezime=" + getPrezime() + ", adresa=" + getAdresa() + ", telefon=" + getTelefon() + "]";
	}
	
}
