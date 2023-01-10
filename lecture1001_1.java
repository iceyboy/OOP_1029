import java.util.Scanner;

public class lecture1001_1 {

	public static void main(String[] args) {
		
		int num;
		int sum = 0, smallest, largest;
		double average;
		Scanner input = new Scanner(System.in);
				
		System.out.println("Enter number 1 : " );
		num = input.nextInt();
		
		sum = sum + num;
		largest = num;
		smallest = num;
		
		if(num > largest) {
			largest = num;
		}
		
		if(num < smallest) {
			smallest = num;
		}
		
		System.out.println("Enter number 2 : " );
		num = input.nextInt();
		
		sum = sum + num;
		
		if(num > largest) {
			largest = num;
		}
		
		if(num < smallest) {
			smallest = num;
		}
		
		System.out.println("Enter number 3 : " );
		num = input.nextInt();
		
		sum = sum + num;	
		
		if(num > largest) {
			largest = num;
		}
		
		if(num < smallest) {
			smallest = num;
		}
		
		System.out.println("Enter number 4 : " );
		num = input.nextInt();
		
		sum = sum + num;	
		
		if(num > largest) {
			largest = num;
		}
		
		if(num < smallest) {
			smallest = num;
		}
		
		System.out.println("Enter number 5 : " );
		num = input.nextInt();
		
		sum = sum + num;
		
		if(num > largest) {
			largest = num;
		}
		
		if(num < smallest) {
			smallest = num;
		}
						
	    average = sum/5.0;	    	    
	    
	    System.out.println(sum);
	    System.out.println(average);
	    System.out.println(largest);
	    System.out.println(smallest);
		
	}
	
}

