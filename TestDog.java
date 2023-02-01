package practical3;

import java.util.Scanner;

public class TestDog {

	static final int MAX = 10;
	
	static final String PROMPT = "---->";
	
	
	static final String SPACES = " ";
	
	
	static final String options[] = { "Add new Dog", "Display details for a Dog", "Update details for a Dog",
			"List all Dogs", "Delete all Dogs", "Delete one Dog", "Quit" };
	
	
	static final int QUIT = options.length;
	
	
	static Dog pets[] = new Dog[MAX];
	

	static int count = 0; 
	
	
	static String title = "Dog Manager";
	
	
	static Menu myMenu = new Menu(title, options);
	
	
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		int choice;
		
		do {
			
			choice = myMenu.getChoice();
			
			if (choice != QUIT) {
				
				processChoice(choice);
				
			}
			
		} while (choice != QUIT);
		
		System.out.println("\nGoodbye!");
		
		input.close();
		
	}

	private static void processChoice(int choice) {
		
		switch (choice) {
		
		case 1:
			
			addNewDog();
			
			break;
			
		case 2:
			
			displayDogDetails();
			
			break;
			
		case 3:
			
			updateDogDetails();
			
			break;
			
		case 4:
			
			listAllDogs();
			
			break;
			
		case 5:
			
			deleteAllDogs();
			
			break;
			
		case 6:
			
			deleteOneDog();
			
			break;
			
		default:
			
			System.out.println("Option " + choice + " is invalid.");
			
		}
		
		System.out.println();
		
	}

	private static void addNewDog() {
		
		try {
		
		if (count < MAX) {
			
			System.out.println("\nOK - Add a new Dog.");
			
			
			Dog dg = new Dog();
			
			System.out.print(PROMPT + "Enter name: ");
			
			String name = input.nextLine();
			
			dg.setName(name);
			
			System.out.print(PROMPT + "Enter breed: ");
			
			String breed = input.nextLine();
			
			dg.setBreed(breed);
			
			System.out.print(PROMPT + "Enter age: ");
			
			int age = input.nextInt();
			
			dg.setAge(age);
			
			input.nextLine(); 
			
			System.out.print(PROMPT + "Enter gender (M for Male F for Female): ");
			
			String gen = input.nextLine();
			
			dg.setGender(gen.charAt(0));
			
			pets[count] = dg;
			
			count++;
			
		} else {
			
			System.out.println("No room to add and more dogs!");
			
		}
		}catch(Exception e) {
			
			System.out.println("Invalid input.");
			
		}
		
	}

	private static void listAllDogs() {
		
		System.out.println("\nOK - List all dogs.");
		
		if (count == 0) {
			
			System.out.println(PROMPT + "Sorry, there are no dogs.");
			
		} else {
			
			System.out.println("We have the following Dogs:");
			
			for (int index = 0; index < count; index++) {
				
				System.out.println(SPACES + (index + 1) + ". " + pets[index].getName());
				
			}
			
		}
		
		System.out.println();
		
	}

	public static void displayDogDetails() {
		
		try {

	  	listAllDogs();

		System.out.println("Please enter the number of the dog you want to view: ");
		
		int choice = input.nextInt();

		switch (choice) {
		
		case 1:
			
			System.out.println(pets[0].getDetails());
			
			break;
			
		case 2:
			
			System.out.println(pets[1].getDetails());
			
			break;
			
		case 3:
			
			System.out.println(pets[2].getDetails());
			
			break;
			
		case 4:
			
			System.out.println(pets[3].getDetails());
			
			break;
			
		case 5:
			
			System.out.println(pets[4].getDetails());
			
			break;
			
		case 6:
			
			System.out.println(pets[5].getDetails());
			
			break;
			
		case 7:
			
			System.out.println(pets[6].getDetails());
			
			break;
			
		case 8:
			
			System.out.println(pets[7].getDetails());
			
			break;
			
		case 9:
			
			System.out.println(pets[8].getDetails());
			
			break;
			
		case 10:
			
			System.out.println(pets[9].getDetails());
			
			break;
			
		default:
			
			System.out.println("Option " + choice + " is invalid.");

		}
		
		}catch(Exception e) {
			
			System.out.println("Invalid input.");
			
		}

	}

	public static void updateDogDetails() {
		
		try {

		listAllDogs();

		System.out.println("Please enter the number of the dog you want to view: ");
		
		int choice = input.nextInt() - 1;
		
		input.nextLine();
		
		System.out.println("Do you want to enter a new name? Y/N");
		
		String nameChoice = input.next();
		
		input.nextLine();

		if (nameChoice.equalsIgnoreCase("Y")) {
			
			System.out.print(PROMPT + "Enter new name: ");
			
			String name = input.nextLine();
			
			input.nextLine();
			
			pets[choice].setName(name);
			
		}

		System.out.println("Do you want to enter a new breed? Y/N");
		
		String breedChoice = input.next();
		
		input.nextLine();
	
		if (breedChoice.equalsIgnoreCase("Y")) {
			
			System.out.print(PROMPT + "Enter new breed: ");
			
			String breed = input.nextLine();
			
			input.nextLine();
			
			pets[choice].setBreed(breed);
			
		}

		System.out.println("Do you want to enter a new age? Y/N");
		
		String ageChoice = input.next();
		
		input.nextLine();

		if (ageChoice.equalsIgnoreCase("Y")) {
			
			System.out.print(PROMPT + "Enter new age: ");
			
			int age = input.nextInt();
			
			input.nextLine();
			
			pets[choice].setAge(age);
			
			input.nextLine();
			
		}

		System.out.println("Do you want to enter a new gender? Y/N");
		
		String genderChoice = input.next();
		
		input.nextLine();

		if (genderChoice.equalsIgnoreCase("Y")) {
			
			System.out.print(PROMPT + "Enter new gender (M for Male F for Female): ");
			
			String gen = input.nextLine();
			
			input.nextLine();
			
			pets[choice].setGender(gen.charAt(0));
			
		}
		
		}catch(Exception e) {
			
			System.out.println("Invalid input.");
			
		}

	}

	public static void deleteAllDogs() {

		@SuppressWarnings("unused")
		Dog pets[] = new Dog[MAX];
		
		count = 0;

	}

	public static void deleteOneDog() {
		
		try {
		
		if(count != 0) {
		
		listAllDogs();
		
		 System.out.println("Which dog do you want to delete.");
		 
		 int choice = input.nextInt();
		 
		 if(count == 1) {
			 
			 @SuppressWarnings("unused")
			Dog pets[] = new Dog[MAX];
			 
				count = 0;
				
		 }else {
		 
		 for(int i = choice; i < pets.length-choice; i++) {
			 
		 pets[i] = pets[i+1];
		 
		 }
		 
		 count--;
		 
		 }
		 
		} else {
			
			System.out.println("No dog to delete.");
			
		}
		
		}catch(Exception e) {
			
			System.out.println("Invalid input.");
			
		}
		 	 		
	}
		
		
}