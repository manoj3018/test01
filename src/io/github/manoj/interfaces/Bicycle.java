package io.github.manoj.interfaces;

public interface Bicycle {
	
	int x = 10; // Only constants are applicable inside interface
	
	//int x;  ->  Not applicable
	
	void applyBreak(int decrement); // You can only declare methods but cannot define methods
	
	void speedUp(int decrement);

}
