
public class WordUtilities {

	public static boolean isDigit(char ch) {
		
		if (ch >= '0' && ch <= '9') {

			return true;

		} else {

			return false;

		}
		
	}
	
	public static boolean isLetter(char ch) {
		
		if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {

			return true;

		} else {

			return false;

		}
		
	}
	
	public static boolean isVowel(char ch) {
		
		char ch1 = Character.toLowerCase(ch);
		
		if (ch1 == 'a' ||ch1 == 'e' ||ch1 == 'i' ||ch1 == 'o' ||ch1 == 'u') {

			return true;

		} else {

			return false;

		}
		
	}

}
