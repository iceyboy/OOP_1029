package week31029;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Array declaration - primitive & non primitive
		
	//	int numbers[] = new int[4];
		
	//	int x = numbers[0];
		
	//	numbers[0] = 2;
		
		int data[] = {1, 2, 3, 4};
		
		display(data);
		
		display(data);
		
	//	int value = 4;
		
	//	printNumber(value);
		
	//	System.out.println("Original: " + value);
		
	//	String options[] = {"Crips", "Mars Bar", "Fanta", "Exit"};
		
	//	for(String str : options) {
			
	//		System.out.print(str + " ");
			
	//	}
		
		//Array traversal
		
		//Arrays and methods
		
		//Arrays & exceptions
		
	}
	
	public static void display(int info[]) {
		
		for(int index = 0; index < info.length; index++) {
			
			System.out.println(info[index]);
			
		}
		
		info[2] = 99;
		
	}
	
	public static void printNumber(int x) {
		
		System.out.println(x);
		
		x = 25;
		
	}

	
	
	
	
	
	
}
