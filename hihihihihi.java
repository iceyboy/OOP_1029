
public class hihihihihi {

	public static int mult(int x, int y) {
		
		
		int product = x * y;
		
		
		return product;
	}
	
	
	public static void sum(int x, int y) {
		System.out.println("sum: "+ (x+y));
	} 
	
	public static void hello(String name) { //formal parameter list 
		System.out.println("Hi " + name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i = 0; i < 10; i++) {
			hello("Ryan");
		}
		
		sum(2,3);
	}

}
