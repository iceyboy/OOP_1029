import java.util.Scanner;

public class weeklyexcercises_1001_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter a single character : ");
		String characterAsString = scanner.next();
		char character = characterAsString.charAt(0);

		if (Character.isDigit(character)) {

			System.out.println("Character : " + character + " is a digit.");

		} else {

			System.out.println("Character : " + character + " is not a digit.");

		}

		scanner.close();

	}

}

/*
 * 3. Write a program which tests if a single character read from the keyboard
 * is a digit. Example interactions are given below: Enter a single character: 5
 * Character : 5 is a digit. Enter a single character: p Character : p is not a
 * digit.
 */