import java.util.Scanner;

public class lecture1001_1 {

	public static void main(String[] args) {
	
		//define data
		
		int num;
		int sum = 0, smallest, largest;
		double average;
		Scanner input = new Scanner(System.in);
		
		
		//read data
		System.out.println("Enter number 1 : " );
		num = input.nextInt();
		sum = sum + num;
		
		System.out.println("Enter number 2 : " );
		num = input.nextInt();
		sum = sum + num;
		
		System.out.println("Enter number 3 : " );
		num = input.nextInt();
		sum = sum + num;	
		if(num > largest) {
			largest = num;
		}
		
		System.out.println("Enter number 4 : " );
		num = input.nextInt();
		sum = sum + num;	
		
		System.out.println("Enter number 5 : " );
		num = input.nextInt();
		sum = sum + num;
		
		//sum & avg
		
	    average = sum/5.0;
	    
	    //largest
	    
	    largest = num1;
	    
	    if(num2>largest) {
	    	largest = num2;
	    }
	    
	    if(num3>largest) {
	    	largest = num3;
	    }
	    
	    if(num4>largest) {
	    	largest = num4;
	    }
	    
	    if(num5>largest) {
	    	largest = num5;
	    }
	    
	    //smallest
	    
	    smallest = num1;
	    
	    if(num2<smallest) {
	    	smallest = num2;
	    }
	    
	    if(num3<smallest) {
	    	smallest = num3;
	    }
	    
	    if(num4<smallest) {
	    	smallest = num4;
	    }
	    
	    if(num5<smallest) {
	    	smallest = num5;
	    }
	    
	    //print results
	    
	    System.out.println(sum);
	    System.out.println(average);
	    System.out.println(largest);
	    System.out.println(smallest);
		
	}
	
}

