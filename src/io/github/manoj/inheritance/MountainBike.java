package io.github.manoj.inheritance;

public class MountainBike extends Bicycle {
	
		public int seatHeight;
		

		//public MountainBike(int startGear, int startSpeed, int startHeight) {
//					super(startGear, startSpeed);
//					seatHeight = startHeight;
//				}
		
		
public MountainBike(int startHeight, int startSpeed, int startGear) {  // MountainBike has the responsibility of initializing the Bicycle class as well since MB extends Bicycle
			super(startGear, startSpeed); // Use the super constructor invocation as very first statement inside the child class constructor
			seatHeight = startHeight;
		}

	
public int getSeatHeight() {
		return seatHeight;
	}


public void setSeatHeight(int seatHeight) {
this.seatHeight = seatHeight;
}

}
