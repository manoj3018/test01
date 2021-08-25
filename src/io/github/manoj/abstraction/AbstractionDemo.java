package io.github.manoj.abstraction;

// when you initialize a particular child object referencing with the parent object. Doing like this the default constructor 
// of the Circle class is being called'

// new Circle() - The default constructor Circle class is being called and in circle class it sees extends Base class(GraphicObject)

// We cannot instantiate abstract class explicitly/directly  -> GraphicObject go = new GraphicObject(); // Since you cannot instantiate abstract class
// we can call it indirectly via the concept of Inheritance through child classes -> GraphicObject circle = new Circle();

public class AbstractionDemo {

	public static void main(String[] args) {

	//   Abstract class      = Concrete class
		GraphicObject circle = new Circle();  // LHS - Reference is of the parent class | RHS - Reference is of the child class
		circle.draw();
		circle.resize();
		
		GraphicObject rectangle = new Rectangle();
		rectangle.draw();
		rectangle.resize();
		
		// GraphicObject go = new GraphicObject(); // Since you cannot instantiate abstract class
		
		
	}

}
