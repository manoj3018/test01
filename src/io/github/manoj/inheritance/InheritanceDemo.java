package io.github.manoj.inheritance;

/**
 * 
 * 
 *@author A596009
 *
 * In this InheritanceDemo we will see how to invoke the MountainBike class
 *
 */

public class InheritanceDemo {

	public static void main(String[] args) {
		
		MountainBike mountainbike = new MountainBike(20,10,1); // startHeight, startSpeed, startGear
		System.out.println("Gear is: " + mountainbike.getGear());
		System.out.println("Seat height is: " + mountainbike.getSeatHeight());
		System.out.println("Bike speed is: " + mountainbike.getSpeed());
		
		mountainbike.applyBreak(1);
		System.out.println("Bike speed after applying break: " + mountainbike.speed);
		
		}

}
