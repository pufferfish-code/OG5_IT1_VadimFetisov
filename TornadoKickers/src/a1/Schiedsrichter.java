package a1;

public class Schiedsrichter extends Person{
	private int spiele;
	Schiedsrichter(String name, int telefonnummer, boolean bezahlterbetrag, int spiele){
		super(telefonnummer, bezahlterbetrag, name);
		this.spiele = spiele;
	}
	public int getSpiele() {
		return spiele;
	}
	public void setSpiele(int spiele) {
		this.spiele = spiele;
	}
	
}
