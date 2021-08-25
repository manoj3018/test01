package io.github.manoj.abstraction;

public abstract class GraphicObject {
	
	int x,y;  // Even child class can access this properties
	
	GraphicObject(){    // Abstract classed cannot be instantiated
		System.out.println("Base abstract class");
	}
	
	void moveTo(int newX, int newY) {  // abstract class can have concrete methods
		System.out.println("move to x: " +x+ "and y: " +y);
	}
	
	abstract void draw();
	abstract void resize();

}
