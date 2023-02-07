package days;

public class EnumTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Day today = Day.MONDAY;
		
		dayInfo(today);

	}
	
	public static void dayInfo(Day d) {
		
		System.out.println("Today is " + d.getSpelling());
		
		if(d.getDay() == 3 || d.getDay() == 6) {
			
			System.out.println("i have csc1029");
		}else {
			
			System.out.println("im doing smth else");
		}
		
	}

}
