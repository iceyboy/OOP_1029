package practical3Employee;

import java.util.ArrayList;

public class EmployeeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		String options[] = { "Add", "Select", "List", "Quit" };
		Menu sysMen = new Menu("Employee Manager", options);
		ArrayList<Employee> data = new ArrayList<Employee>();
		
		Employee e = new Employee("Paul", "Address", 25000.0);
		data.add(e);
		
		int choice = sysMen.getChoice();

		do {

			processUserChoice(choice, data);
			choice = sysMen.getChoice();
			
		} while (true);

	}

	public static void processUserChoice(int choice, ArrayList<Employee> info) {

		switch (choice) {

		case 1: // add 
			break;
		case 2: // select
			break;
		case 3: //list
			listAll(info);
			break;
		case 4: //quit
			System.out.println("Goodbye!");
			System.exit(1);
		default:
			
		}
		
		
	}
	
	public static void listAll(ArrayList<Employee> info) {
		
		System.out.println("All employee data");
		System.out.println("-----------------");
		for(Employee e : info) {
			
			System.out.println(e);
			
		}
		
	}

}
