package demo6;

public class Car {
	private String make;
	private String model;
	private String colour;
	private double engineSize;

	public Car(String make, String model, String colour, double eSize) {
		this.make = make;
		this.model = model;
		this.colour = colour;
		this.engineSize = eSize;
	}

	public void setColour(String newCol) {
		if (newCol.equals("Blue") || newCol.equals("Red")) {
			colour = newCol;
		}
	}

	public String getColour() {
		return this.colour;
	}

	public void drive() {
		System.out.println("I am driving");
	}

	public void start() {
		System.out.println("I am starting");
	}

	public void stop() {
		System.out.println("I am stopping");
	}

	public void changeGear(int gear) {
		System.out.println("Gear changed to " + gear);
	}
}