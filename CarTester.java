package demo6;

import java.util.Scanner;

public class CarTester {

	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Car myC = new Car("Ford", "Fiesta", "Red", 1.6);	// create a Car object
		//myC.setColour(null);
		
		

		System.out.println("Colour: " +myC.getColour());
		myC.setColour("banaana");
		System.out.println("Colour: " +myC.getColour());
		
		
		//myC = null;
		myC.start();			// start the car
		myC.changeGear(1);		// into 1st
		myC.drive();			// use drive method
		myC.changeGear(2);		// into 2nd		
		myC.stop();				// stop the car
		
		
		//Car another = null;
		
		//if(myC == null) {
	//		System.out.println("It's null");
	//	}
	//	else {
	//		System.out.println("It's a real object");
	//	}
		
		//another.start();
		
		
	}

}
