
public class weeklyexcercises_1001_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum = 0;
		
		for (int i = 1; i < 1000; i++) {
			
			if (i % 3 == 0 || i % 5 == 0) {
				
				sum += i;
				
			}
			
		}
		
		System.out.println(sum);
		
	}
	
}
