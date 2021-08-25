package io.github.manoj.inheritance;

/**
 * 
 * @author A596009
 * 
 * Bicycle - This is a base class
 * 
 * Inheritance - extends
 * 
 *
 */

public class Bicycle {
	
	protected int gear; // Protected - It is accessible in the sub class which is MountainBike
	protected int speed;
	
	

//	public Bicycle(int gear, int speed) {
//		super();
//		this.gear = gear;
//		this.speed = speed;
//	}
	
	// The above constructor can also be written like below
	
	public Bicycle(int startGear, int startSpeed) {
		super();
		gear = startGear;
		speed = startSpeed;
	}
	
	
	public int getGear() {
		return gear;
	}

	public void setGear(int gear) {
		this.gear = gear;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public void applyBreak(int decrement) {
		speed -= decrement;
	}
	
	public void speedUp(int increment) {
		speed += increment;
	}

}
