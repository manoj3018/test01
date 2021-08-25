package io.github.manoj.multipleinheritance;

/**
 * 
 * If Bicycle & Vehicle would have been a concrete classes then it would cause error which is avoided in place of interface
 * You cannot extend from 2 concrete classes since Java does not support Multiple Inheritance from classes
 * 
 * Interesting scenario : What if you have a need to extend from one interface & one more class
 * 
 *  Multiple Inheritance possibility
 *  Combination of 2 classes - not possible
 *  Combination of 2 interface - possible
 *  Combination of class & interface - possible [ public class MountainBike extends TwoWheeler implements Bicycle,Vehicle]
 *  
 *  3 things
 *  1) When extends TwoWheeler is put after implements Java throws error [public class MountainBike implements Bicycle,Vehicle extends TwoWheeler] since extends keyword needs to be right after the child class
 *  2) A normal child class can extend from one concrete class and can also implement any number of interfaces.
 *  3) A class can extend from only and only base class(concrete class) but can implement any number of interfaces 
 */

public class MountainBike1 extends TwoWheeler implements Bicycle, Vechile{  
	
	
	private int seatHeight;
	private int gear;
	private int speed;
	
	
//	public MountainBike(int seatHeight, int gear, int speed) {
//		super();
//		this.seatHeight = seatHeight;
//		this.gear = gear;
//		this.speed = speed;
//	}
//	
	
	
	
	
	
	
	
	// Implement abstract method applyBreak from Bicycle Interface
	

	@Override
	public void applyBreak(int decrement) {
		speed = speed-decrement;
	}

	public MountainBike1(int seatHeight, int gear, int speed) {
	super();
	this.seatHeight = seatHeight;
	this.gear = gear;
	this.speed = speed;
}

	// Implement abstract method speedUp from Bicycle Interface
	
	@Override
	public void speedUp(int decrement) {
		speed = speed+decrement;
	}
	
	

	public int getSeatHeight() {
		return seatHeight;
	}

	public void setSeatHeight(int seatHeight) {
		this.seatHeight = seatHeight;
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

	@Override
	public void canDrive() {

			System.out.println("Mountain Bikes can be driven");
	}
	
	
	
	
	
	

}
