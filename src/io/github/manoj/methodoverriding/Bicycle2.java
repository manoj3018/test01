package io.github.manoj.methodoverriding;

// Parent class/Base class Bicycle2 
public class Bicycle2 {
	
	protected int gear;
	protected int speed;
	
	
	public Bicycle2(int startSpeed, int startGear) {
		super();
		gear = startGear;
		speed = startSpeed;
	}


	public void setGear(int newValue) {
		gear = newValue;
	}


	public void applyBreak(int decrement) {
		speed -= decrement;
	}
	
	public void speedUp(int increment) {
		speed += increment;
	}	
	
	
	
	

}
