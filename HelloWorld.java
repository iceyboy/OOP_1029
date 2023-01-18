import java.util.Scanner;

import javax.swing.JOptionPane;

public class HelloWorld {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your name : ");
		
		String name = scanner.next();

		JOptionPane.showMessageDialog(null, "Hello World!" + name);
		
		JOptionPane.showMessageDialog(null, "Hello World!");
		
		JOptionPane.showMessageDialog(null, name);
		
		scanner.close();
		
	}
}
