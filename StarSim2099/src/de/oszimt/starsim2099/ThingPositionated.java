package de.oszimt.starsim2099;

public abstract class  ThingPositionated {
	protected double posX;
	protected double posY;
	protected String name;
	
	public ThingPositionated () {}
	
	public ThingPositionated(double posX, double posY, String name) {
		this.posX = posX;
		this.posY = posY;
		this.name = name;
	}
}
