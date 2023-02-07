package days;

public enum Day {
	
	SUNDAY("Sunday", 1),
	MONDAY("Monday", 2),
	TUESDAY("Tuesday", 3),
	WEDNESDAY("Wednesday", 4),
	THURSDAY("Thursday", 5),
	FRIDAY("Friday", 6),
	SATURDAY("Saturday", 7);
	
	private String spelling;
	private int day;


	
	private Day(String str, int d) {
		
		spelling = str;
		day = d;
	}
	
	
	public String getSpelling() {
		
		return spelling;
		
	}
	
	public int getDay() {
		
		return day;
		
	}

}
