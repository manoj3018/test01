package io.github.manoj.abstraction;

//Either you can provide implementation for unimplemented methods or else declare the class as abstract

public  class Circle extends GraphicObject {  //abstract
	
	void draw() {
		System.out.println("Drawing a circle");
	}
	
	void resize() {
		System.out.println("Resizing the circle");
	}
	
	

}
