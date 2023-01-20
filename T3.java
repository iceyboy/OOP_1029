import java.util.Scanner;

public class T3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter your name : ");
		
		String name = scanner.next();
		
		System.out.println("*".repeat(name.length()+4));
		
		System.out.println("* " + name + " *");
		
		System.out.println("*".repeat(name.length()+4));
		
		scanner.close();

	}

}
