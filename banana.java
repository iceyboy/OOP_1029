import java.util.Scanner;

public class banana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter a word");
		String userWord = scanner.next();
		
		
		System.out.println(userWord);
		char[] userWordArray = userWord.toCharArray();
		
		
		for(int i = 1; i < userWord.length()-1; i ++) {
		System.out.print(userWordArray[i]);
		System.out.print(" ".repeat(userWord.length()-2));
		System.out.print(userWordArray[userWord.length()-i-1]);
		System.out.print("\n");
		
		}
		
		for(int i = userWord.length()-1; i>=0; i--) {
			System.out.print(userWordArray[i]);
		}
		
		scanner.close();
		

	}

}
