package practical3;

public enum Gender {

	MALE(0), FEMALE(1), UNASSIGNED(2);

	private int gNum;
	
	private String names[] = { "Male", "Female", "Unknown" };

	private Gender(int num) {
		
		gNum = num;
		
	}

	public String toString() {
		
		return names[gNum];
		
	}
	
}
