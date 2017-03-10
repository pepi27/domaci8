package skolajezika.Model;

public class Ucenik {

	private int id; 
	private String ime, prezime, adresa, telefon;
	
	public Ucenik() {
	}

	public Ucenik(int id, String ime, String prezime, String adresa, String telefon) {
		this.id = id;
		this.ime = ime;
		this.prezime = prezime;
		this.adresa = adresa;
		this.telefon = telefon;
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

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Ucenik [id=" + id + ", ime=" + ime + ", prezime=" + prezime + ", adresa=" + adresa + ", telefon="
				+ telefon + "]";
	} 
}
