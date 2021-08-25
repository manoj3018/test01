package io.github.manoj.multipleinheritance;

/**
 *  MultipleInheritanceDemo is the main class where you can initialize the MountainBike and get the gear, speed etc.
 *  
 *  Requirement: There is another interface (Vehicle) where your MountainBike class should extend or implement this interface as well
 *  
 *  
 *  
 *   Multiple Inheritance possibility
 *  Combination of 2 classes - not possible
 *  Combination of 2 interface - possible
 *  Combination of class & interface - possible [ public class MountainBike extends TwoWheeler implements Bicycle,Vehicle]
 *  
 *  3 things
 *  1) When extends TwoWheeler is put after implements Java throws error [public class MountainBike implements Bicycle,Vehicle extends TwoWheeler] since extends keyword needs to be right after the child class
 *  2) A normal child class can extend from one concrete class and can also implement any number of interfaces.
 *  3) A class can extend from only and only base class(concrete class) but can implement any number of interfaces
 */



public class MultipleInheritanceDemo {

	public static void main(String[] args) {

		MountainBike1 mountainBike1 = new MountainBike1(20, 1, 10); // height, speed, gear
		
//		System.out.println("Gear is: " + mountainBike.getGear());  // Spent lot time in an error where unable to access some methods because of the same classes created with public modifier packages
//		System.out.println("Seat height is: " + mountainBike.getSeatHeight());
//		System.out.println("Bike speed is: " + mountainBike.getSpeed());
//		
//		mountainBike.applyBreak(2);
//		System.out.println("Bike speed after applying break: " + mountainBike.getSpeed());
//		
//		mountainBike.speedUp(3);
//		System.out.println("Bike's new speed after increment: " + mountainBike.getSpeed());
//		

		System.out.println("Gear is: " + mountainBike1.getGear());
		System.out.println("Seat height is: " + mountainBike1.getSeatHeight());
		System.out.println("Bike Speed is: " + mountainBike1.getSpeed());
		
		mountainBike1.applyBreak(2);
		System.out.println("Bike speed after applying break: " + mountainBike1.getSpeed());
		
		mountainBike1.speedUp(3);
		System.out.println("Bikes's speed after increment: " + mountainBike1.getSpeed());
		
		mountainBike1.canRotateTwoWheels(); // Concrete class method
		
		mountainBike1.canDrive(); // Interface method
		
		
		
		
	}
}


