package io.github.manoj.classes;

/**
 * 
 * @author A596009
 * 
 * What if you have use case where some of the values are mandatory and some values are optional in these properties section?
 * Identified that some entities are constant for all the objects.
 * 
 *  ********The question to above is Multiple Constructors************
 *  
 *
 * Note: If you create any constructor in a class which is having atleast one parmeter then default constructor implementation 
 *       of Java will not automatically work 
 */

public class Cuboid {
	
	int length;
	int width;
	int height;
	
	
    // CASE1: Constructors which will accept all the values
	public Cuboid(int length, int width, int height) {
		super();
		this.length = length;
		this.width = width;
		this.height = height;
	}
	
	
	// CASE2
	// consider another consume application where it would expect length to constant to all of the objects
    // Another constructor can be created in the same class
	public Cuboid(int width, int height) {
		super();
		this.width = width;
		this.height = height;
		this.length = 10;
	}
	
	
	// CASE3 
	Cuboid(int dimension){
		this.length = dimension;
		this.width = dimension;
		this.height = dimension;
		
	}
	
	
	// CASE4
	// Another consumer application that does not intend to supply any of the values because for it all the objects are going to hold
	// exact same value for all the properties
	Cuboid(){
		this.length=10;
		this.width=10;
		this.height=10;
	}
	
	
	// Defining behavior
	int volume() {
		return width*height*length;
	}
	


	public static void main(String[] args) {
		
		int volume;
		
		// Volume of Cuboid = (length/2)*width*height 
		
		// case 1 : Standard Constructor
		Cuboid stdCuboid = new Cuboid(10, 20, 15);
		volume = stdCuboid.volume();
		System.out.println("The Volume of Simple Cuboid is : " + volume);
		
		// case 2
		Cuboid cuboidWithDefaults = new Cuboid(10,20);
		volume = cuboidWithDefaults.volume();
		System.out.println("The Volume of  Cuboid with default length is : " + volume);
		
		// case 3
		Cuboid cube = new Cuboid(10);
		volume = cube.volume();
		System.out.println("Volume of cube is :" + volume);
		
		// case 4
		Cuboid defaultCuboid = new Cuboid();
		volume = defaultCuboid.volume();
		System.out.println("Volume of Default Cuboid is :" + volume); 
		
		// With the above case4 if all the constructors are commented then JVM will create default constructors and assign the value as 0.
		

	}

}
