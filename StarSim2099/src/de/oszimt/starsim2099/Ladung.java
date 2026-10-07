package de.oszimt.starsim2099;

/**
 * Write a description of class Ladung here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class Ladung extends ThingPositionated{


	private int masse;
	private String typ;
	public Ladung() {
		super();
	} 
	
	public Ladung (double posX, double posY, String name, int masse, String typ) {
		super(posX, posY, name);
		this.masse = masse;

	}
	
	
	
	public double getPosX() {
		return posX;
	}



	public void setPosX(double posX) {
		this.posX = posX;
	}



	public double getPosY() {
		return posY;
	}



	public void setPosY(double posY) {
		this.posY = posY;
	}



	public int getMasse() {
		return masse;
	}



	public void setMasse(int masse) {
		this.masse = masse;
	}



	public String getTyp() {
		return typ;
	}



	public void setTyp(String typ) {
		this.typ = typ;
	}



	public static char[][] getDarstellung() {
		char[][] ladungShape = { { '/', 'X', '\\' }, { '|', 'X', '|' }, { '\\', 'X', '/' } };
		return ladungShape;
	}
	
	
}