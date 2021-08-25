package io.github.manoj.datatypeconversion;

// Method flow Sample Example!

public class ClassA {
	
	public void meth1() {
		System.out.println(10);
		ClassA a1 = new ClassA();
		a1.meth2();
	}
	
	void meth2() {
		System.out.println(20);
	}

	public static void main(String[] args) {
		
		ClassA a = new ClassA();
		a.meth1();
		//a.meth2();
		System.out.println("Hello World!");
		

	}

}
