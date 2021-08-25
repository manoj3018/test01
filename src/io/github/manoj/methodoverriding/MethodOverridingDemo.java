package io.github.manoj.methodoverriding;

/**
 * 
 * Instance Method: Instance method are methods which require an object of its class to be created before it can be called.
 * Static method: Static methods are the methods in Java that can be called without creating an object of class.They are referenced by the class name itself
 * 
 * 
 * 
 * 
 * STATIC METHOD   - Static method means method belongs to the class and not the object. Static methods are called by using class name.
 * INSTANCE METHOD - Normal method is called as Instance method since it belongs to object. You can call the method on the object/
 * 
 * Defining a Method with same signature as superclass's method:
 * 
 *          					SUPERCLASS INSTANCE METHOD    		SUPERCLASS STATIC METHOD 
 * 
 * SUBCLASS INSTANCE METHOD				Overrides				  Generates a compile time error
 * 
 * SUBCLASS STATIC METHOD          Generates a compile time					Hides
 *										  error
 *
 * > Overriding of instance method with static method is not allowed and vice versa.
 * > Method hiding - Same method definitions are in multiple classes
 */

public class MethodOverridingDemo {
	
	public static void main(String[] args) {
		
		// First: Initializing Bicycle2 class
		
		Bicycle2 bicycle = new Bicycle2(10,2);
		System.out.println("Bicycle gear is: " + bicycle.gear);
		System.out.println("Bicycle speed is: " + bicycle.speed);
		bicycle.applyBreak(5);
		System.out.println("Bicycle speed after applying break is: " + bicycle.speed );
		
		
		// Second: Initializing MountainBike2 class
		
//		MountainBike2 bike = new MountainBike2(50, 50, 3);
//		System.out.println("Bike gear is: " + bike.);
		
		Bicycle2 bike = new MountainBike2(50, 50, 3);  // Dynamic object binding concept
		System.out.println("MountainBike2 gear is: " + bike.gear);
		System.out.println("mountainBike2 speed is: " + bike.speed);
		
		bike.applyBreak(1);
		System.out.println("MountainBike2 speed after applying break is: " + bike.speed); // this speed
		
		bike.speedUp(10);
		System.out.println("MountainBike2 speed after speeding up: " +bike.speed);
		
	
		
		
		
	
		
		
	}
	
	
	
	

}
