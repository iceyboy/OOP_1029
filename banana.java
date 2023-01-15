import java.util.Scanner;

public class banana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner z = new Scanner(System.in);
		System.out.print("Please enter a word");
		String x = z.next();
		
		
		System.out.println(x);
		char[] y = x.toCharArray();
		
		
		for(int i = 1; i < x.length()-1; i ++) {
		System.out.print(y[i]);
		System.out.print(" ".repeat(x.length()-2));
		System.out.print(y[x.length()-i-1]);
		System.out.print("\n");
		
		}
		
		for(int i = x.length()-1; i>=0; i--) {
			System.out.print(y[i]);
		}
		
		z.close();
		
		System.out.println(sumInt());
		

	}
	
	public static int sumInt() {
		int sum = 0;
		
		for(int i = 0; i < 11; i++) {
			
			sum = sum + i;
			
		}
		
		
		
		return sum;
	}

}
