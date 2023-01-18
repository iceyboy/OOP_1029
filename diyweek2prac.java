import java.util.Scanner;

public class diyweek2prac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sum();
		name();

	}

	public static void sum() {
		int sum = 0;
		for(int i = 1; i <11; i++) {
			
			sum = sum + i;
			System.out.println(sum);
			
		}			
		
	}
	
	public static void name() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter your name : ");
		String name = scanner.next();
		
		System.out.println("*".repeat(name.length()+4));
		System.out.println("* " + name + " *");
		System.out.println("*".repeat(name.length()+4));
		
		scanner.close();
		
		
	}

}
