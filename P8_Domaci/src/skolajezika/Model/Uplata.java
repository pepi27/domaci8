package skolajezika.Model;

public class Uplata {

	private int id; 
	private Ucenik uplatilac;
	
	public Uplata(int id, Ucenik uplatilac) {
		this.id = id; 
		this.uplatilac = uplatilac; 
	}

	public Ucenik getUplatilac() {
		return uplatilac;
	}

	public void setUplatilac(Ucenik uplatilac) {
		this.uplatilac = uplatilac;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Uplata [id=" + id + ", uplatilac=" + uplatilac + "]";
	}

}
