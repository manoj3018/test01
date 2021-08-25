package io.github.manoj.wrapperclass;


public class ThirdDemo {

	public static void main(String[] args) {
		
		String price1 = "462.95";
		String price2 = "237.05";
		
		double p1 = Double.parseDouble(price1);
		double p2 = Double.parseDouble(price2);
		
		System.out.println(p1);
		System.out.println(p2);
		
		
		 double sum = p1+p2;
		
		System.out.println(sum);
		
		if(sum == 700) {
			System.out.println("Passed!");
		} else {
			System.out.println("Failed!");
		} 
		

	}

}
