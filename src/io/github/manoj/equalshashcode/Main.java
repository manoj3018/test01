package io.github.manoj.equalshashcode;

public class Main {

	public static void main(String[] args) {
		Student john = new Student(1, "John", "23 East, California");
		Student john2 = new Student(1,"John1", "24 East, California");
		//Student john3 = new Student(3,"John","23 East, California");
		
		System.out.println(john.equals(john2));
	//  System.out.println(john == john2);
	}

}
