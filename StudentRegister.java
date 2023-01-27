package demol9;

import java.util.Scanner;

import week31029.Menu;

// an 'application class' - a program for managing Student data
// has a 'main' method

public class StudentRegister {
	static final int MAX = 4;						// a constant value
	static Student data[] = new Student[MAX];		// array for Student instances
	static int count = 0;							// to keep track of 'how many'
	static Scanner input = new Scanner(System.in);	// to read data for a Student

	// Let's add a Menu object that can
	// 1. Display all Student objects stored
	// 2. Add a new Student to the system
	// 3. Exit the application
	
	static String options[] = {"Display all","Add a new Student","Exit"};
	static Menu sysMenu;
	
	public static void main(String[] args) {
		
		sysMenu = new Menu("Student Register", options);
		
		int choice = sysMenu.getUserChoice();
		
		
		while(true) {
			
		processUserChoice(choice);
		choice = sysMenu.getUserChoice();
		
		}
			
	}
	
	public static void processUserChoice(int value) {
		
		switch( value ) {
		
		case 1 : displayStudents();
				break;
				
		case 2 : addStudent();
				break;
			
		case 3 : System.out.println("Goodbye");
				 System.exit(1);
			
			default : System.out.println("\nNot an option - try again.");
		
		}
		
	}
	
	public static void displayStudents() {
		
		System.out.println("\nDisplay all Students");
		System.out.println("____________________");
		
		if( count == 0) {
			System.out.println("None yet\n\n");
			return;
		}
		
		for(int index = 0; index<count; index++) {

			Student stu = data[index];
			System.out.println(stu);
			
		}
		
		System.out.println("\n");
		
	}

	public static void addStudent() {
		if(count < MAX) {
		
		System.out.print("Enter name:");
		String name = input.nextLine();
		System.out.print("Enter course:");
		String course = input.nextLine();
		System.out.print("Enter faculty:");
		String faculty = input.nextLine();
		faculty = faculty.trim(); // what's this?
		char fac = faculty.charAt(0);
		
		// now create a new Student instance
		Student s = new Student(name, course, fac);
		
		// but should we check first if there is enough 
		// storage space in the array?
		data[count] = s;
		count++;
		}else {
			System.out.println("Not enough room to store a Student.");
		}
	}
}