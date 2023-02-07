package practical3Employee;

public class Employee {

	private int empNum;
	private static int nextNum = 1;
	private String name;
	private String address;
	private double salary;
	private Status eStat;

	public Employee(String name, String address) {

		
		
	}

	public Employee(String name, String address, double salary) {

		this.name = name;
		this.address = address;
		this.empNum = nextNum;
		nextNum++;
		this.salary = salary;
		this.eStat = Status.FULL_TIME;
		
	}
	
	public String getDetails() {
		
		return "";
		
	}
	
	public String toString() {
		
		return "ID: " + empNum + "\n" + "Name:" + name;
		
	}
	
	public double calcGrossWage() {
		
		return 0.0;
		
	}
	
	public double calcNetWage() {
		
		return 0.0;
		
	}
	
	public double calcTax() {
		
		return 0.0;
		
	}
	
	

}
