package week31029;

public class MenuDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String options[] = {"Crisps", "Mars bar", "Fanta", "Exit"};
		
		Menu m = new Menu("Sweet Shop", options);
		
		int choice = m.getUserChoice();
		
		System.out.println("You chose: " + choice);
		
		
		
	}

}
