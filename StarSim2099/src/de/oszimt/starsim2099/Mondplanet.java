package de.oszimt.starsim2099;

public class Mondplanet extends ThingPositionated{
	
	public Mondplanet() {
		super();
	}
	
	public Mondplanet (double posX, double posY, String name){
	super(posX, posY, name);
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static char[][] getDarstellung() {
		char[][] mondShape = { { '\0', '/', '*', '*', '\\', '\0' }, { '|', 'M', 'O', 'N', 'D', '|' },
				{ '\0', '\\', '*', '*', '/', '\0' } };
		return mondShape;

	}
	
}
