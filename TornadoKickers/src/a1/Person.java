package a1;

public abstract class Person {
	private int telefonnummer;
	private boolean bezahlterbetrag;
	private String name;
	
	Person(int telefonnummer, boolean bezahlterbetrag, String name) {
		this.telefonnummer = telefonnummer;
		this.bezahlterbetrag = bezahlterbetrag;
		this.name = name;
		
	}

	public int getTelefonnummer() {
		return telefonnummer;
	}

	public void setTelefonnummer(int telefonnummer) {
		this.telefonnummer = telefonnummer;
	}

	public boolean isBezahlterbetrag() {
		return bezahlterbetrag;
	}

	public void setBezahlterbetrag(boolean bezahlterbetrag) {
		this.bezahlterbetrag = bezahlterbetrag;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
