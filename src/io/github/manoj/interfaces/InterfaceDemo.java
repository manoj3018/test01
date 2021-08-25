package io.github.manoj.interfaces;

/**
 * 
 * Interfaces are going to define the contract or the specification which is going to govern how an application, 
 * code or programming logic will behave.
 * 
 * 
 * Interfaces only contain constants, method signatures, default methods, static methods & nested types
 * 
 * Note: If a interface cannot define a concrete implementation of the methods then naturally the interface is 
 *       going to be extended by a child class(a concrete class) which is going to provide implementation of the methods 
 *       declared in the interface
 *       
 *
 */

public class InterfaceDemo {
	
	
	public static void main(String[] args) {
		
		MountainBike mountainBike = new MountainBike(20, 1, 10); // height, speed, gear
		
		System.out.println("Gear is: " + mountainBike.getGear());
		System.out.println("Seat height is: " + mountainBike.getSeatHeight());
		System.out.println("Bike speed is: " + mountainBike.getSpeed());
		
		mountainBike.applyBreak(2);
		System.out.println("Bike speed after applying break: " + mountainBike.getSpeed());
		
		mountainBike.speedUp(3);
		System.out.println("Bike's new speed after increment: " + mountainBike.getSpeed());
		
	}
	
	

}
