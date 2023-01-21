package week2;

import java.util.Scanner;

public class CarTester {

	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Car myC = new Car("Mini", "Cooper", "Red", 1.6);	// create a Car object
		myC.setColour(null);
		
		myC = null;
		myC.start();			// start the car
		myC.changeGear(1);		// into 1st
		myC.drive();			// use drive method
		myC.changeGear(2);		// into 2nd		
		myC.stop();				// stop the car
	}

}
