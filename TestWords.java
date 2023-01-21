import java.util.Scanner;

public class TestWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);	
		System.out.println("Please enter a line of text : ");		
		String text = scanner.nextLine();

		int digitCount = 0;
		int consonantCount = 0;
		int vowelCount = 0;
		int otherCount = 0;

		char[] textArray = text.toCharArray();

		for (int i = 0; i < text.length(); i++) {

			if (WordUtilities.isDigit(textArray[i]) == true) {
				
				digitCount++;
				
			} else if (WordUtilities.isVowel(textArray[i]) == true) {
				
				vowelCount++;
				
			} else if ((WordUtilities.isLetter(textArray[i]) == true) && (WordUtilities.isVowel(textArray[i]) == false)) {
				
				consonantCount++;
				
			} else {
				
				otherCount++;
				
			}

		}

		System.out.println("Original text : " + text);
		System.out.println("Digit count : " + digitCount);
		System.out.println("Consonant count : " + consonantCount);
		System.out.println("Vowel count : " + vowelCount);
		System.out.println("Other count : " + otherCount);

		scanner.close();

	}

}
