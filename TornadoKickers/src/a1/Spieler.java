package a1;

public class Spieler extends Person {
	private int trikotnummer;
	private String spielposition;
	Spieler(int trikotnummer, String speilposition, String name, int telefonnummer, boolean bezahlterbetrag){
		super(telefonnummer, bezahlterbetrag, name);
		this.spielposition = spielposition;
		this.trikotnummer = trikotnummer;
		
	}
	public int getTrikotnummer() {
		return trikotnummer;
	}
	public void setTrikotnummer(int trikotnummer) {
		this.trikotnummer = trikotnummer;
	}
	public String getSpielposition() {
		return spielposition;
	}
	public void setSpielposition(String spielposition) {
		this.spielposition = spielposition;
	}
	
}
