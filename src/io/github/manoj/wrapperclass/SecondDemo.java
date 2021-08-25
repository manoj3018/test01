package io.github.manoj.wrapperclass;

/**
 * 
 * @author A596009
 * In this scenario consider a product in amazon where the price will be captured as String but it is
 * actually int or double or float etc. So for this use case we use to parse String to int!
 *
 *
 */

public class SecondDemo {

	public static void main(String[] args) {
		
		String price1 = "463";
		String price2 = "237";
		
		int p1 = Integer.parseInt(price1);
		int p2 = Integer.parseInt(price2);
		
		 int sum = p1+p2;
		
		System.out.println(sum);
		
		if(sum == 700) {
			System.out.println("Passed!");
		} else {
			System.out.println("Failed!");
		} 

	}

}
