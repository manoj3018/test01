package io.github.manoj.methodoverriding;

public class MountainBike2 extends Bicycle2 {
	
	public int seatHeight;

	public MountainBike2(int startHeight,int startSpeed, int startGear) {
		super(startSpeed, startGear);
		
		seatHeight = startHeight;

	}
	
	
	// Overriding all the 3 methods of base class
	
	@Override
	public void setGear(int newValue) {
		gear = newValue+2;
	}
	
	public void applyBreak(int decrement) {
		speed = speed-decrement-10;
	}
	
	public void speedUp(int increment) {
		speed = speed+increment+10;
	}


	
	

}
