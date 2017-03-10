package skolajezika.Model;

import java.util.ArrayList;

public class Kurs {

	 
	private String id, jezik, tip;
	private double cena; 
	private Nastavnik nastavnik; 
	private ArrayList<Ucenik> sviUcenici = new ArrayList<>();
	

	public Kurs() {
	}

	

	public Kurs(String id, String jezik, String tip, double cena, Nastavnik nastavnik) {
		this.id = id;
		this.jezik = jezik;
		this.tip = tip;
		this.cena = cena;
		this.nastavnik = nastavnik;
		
		
	}

	public String getJezik() {
		return jezik;
	}

	public ArrayList<Ucenik> getSviUcenici() {
		return sviUcenici;
	}



	public void setSviUcenici(ArrayList<Ucenik> sviUcenici) {
		this.sviUcenici = sviUcenici;
	}



	public void setJezik(String jezik) {
		this.jezik = jezik;
	}

	public String getTip() {
		return tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}

	public double getCena() {
		return cena;
	}

	public void setCena(double cena) {
		this.cena = cena;
	}

	public Nastavnik getNastavnik() {
		return nastavnik;
	}

	public void setNastavnik(Nastavnik nastavnik) {
		this.nastavnik = nastavnik;
	}
	
	public String getId() {
		return id; 
	}

	@Override
	public String toString() {
		return "Kurs [id=" + id + ", jezik=" + jezik + ", tip=" + tip + ", cena=" + cena + ", nastavnik=" + nastavnik
				+ ", sviUcenici=" + sviUcenici + "]";
	}
}
