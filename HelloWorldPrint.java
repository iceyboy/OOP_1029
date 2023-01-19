import java.util.Scanner;

public class HelloWorldPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter your name please: "); 
		Scanner sc = new Scanner(System.in); 
		String name = sc.nextLine(); 
		System.out.println("Hello World!"); 
		System.out.print("Your name is "+ name); 
		sc.close();

	}

}
