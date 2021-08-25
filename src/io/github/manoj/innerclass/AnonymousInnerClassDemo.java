package io.github.manoj.innerclass;

public class AnonymousInnerClassDemo {

	public static void main(String[] args) {

//		Bicycle3 mountainBike = new MountainBike3();
//		mountainBike.canApplyBreak();
//		mountainBike.canSpeedUp();
		
		
		// The whole logic which you could write in a child class embedded right into the instantiation code by using anonymous inner class
	// The below code looks ugly , so always try to create a child class like MountainBike3	
		Bicycle3 bicycle3 = new Bicycle3() {  // We can use this Interface instantiation if you do not want to use the child class of it
			
			@Override
			public void canSpeedUp() {
				System.out.println("Can speed up mountain bike");				
			}
			
			@Override
			public void canApplyBreak() {
				System.out.println("Can apply break mountain bike");				
			}
		};
		
		bicycle3.canApplyBreak(); // The implementation will be invoked from Anonymous Inner class
		bicycle3.canSpeedUp();
		 
	}

}
