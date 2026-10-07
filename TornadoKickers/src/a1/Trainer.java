package a1;

public class Trainer extends Person {
	private char lizensklasse;
	private double aufwandsschaedigung;
	private String spielklasse;
	
	Trainer(String name, int telefonnummer, boolean bezahlterbetrag, char lizensklasse, double aufwandsschaedigung, String spielklasse){
		super(telefonnummer, bezahlterbetrag, name);
		this.lizensklasse = lizensklasse;
		this.aufwandsschaedigung = aufwandsschaedigung ;
		this.spielklasse = spielklasse;
	}

	public char getLizensklasse() {
		return lizensklasse;
	}

	public void setLizensklasse(char lizensklasse) {
		this.lizensklasse = lizensklasse;
	}

	public double getAufwandsschaedigung() {
		return aufwandsschaedigung;
	}

	public void setAufwandsschaedigung(double aufwandsschaedigung) {
		this.aufwandsschaedigung = aufwandsschaedigung;
	}

	public String getSpielklasse() {
		return spielklasse;
	}

	public void setSpielklasse(String spielklasse) {
		this.spielklasse = spielklasse;
	}
	
}
