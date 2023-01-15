import java.util.Scanner;

public class nameStars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner z = new Scanner(System.in);
		System.out.print("Please enter a name");
		String name = z.next();
		
		System.out.println("*".repeat(name.length()+4));
		System.out.println("* " + name + " *");
		System.out.println("*".repeat(name.length()+4));

	}

}
