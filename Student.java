package week31029;

public class Student {
	
	
	
	//instance data - to describe state
	
	private int studentID;
	private String name;
	private String course;
	private char faculty;
	
	
	
	//constructor
	
	public Student(int id, String nm, String crs, char fac) {
		
		this.studentID = id;
		this.name = nm;
		this.course = crs;
		this.faculty = fac;
		
	}
	
	//getters - to access instance data
	
	public int getStudentId() {
		
		return this.studentID;
	
	}
	
	public String getName() {
		
		return this.name;
		
	}
	
	public String getCourse() {
		
		return this.course;
		
	}
	
	public char getFaculty() {
		
		return this.faculty;
		
	}
	
	//setters - to modify instance data
	
	//don't use static to describe instance methods 
	
	public void setFaculty(char fac) {
		
		//must maintain integrity of state of objects
		
		if(fac == 'S' || fac == 'A') {
		
			this.faculty = fac;
			
		}
		
	}
	
	public String toString() {
		
		String str = "";
		
		str += "ID: " + getStudentId() + "\n";
		str += "Name: " + getName() + "\n";
		str += "Course: " + getCourse() + "\n";
		str += "Faculty: " + getFaculty() + "\n";
		
		return str;
		
	}
	
	
	
	
	
	
	
	
	

}
