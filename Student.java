package demol9;


//a class to describe Student objects
//how should you comment your code?
public class Student {
	// instance data - to describe 'state' (each object will have different values)
	private int studentId;
	private String name;
	private String course;
	private char faculty;
	
	// class data - what's that?
	static private int nextId = 1;

	// a constructor to initialise 'state'
	public Student( String sname, String scourse, char fac) {
		this.studentId = nextId;
		nextId++;
		this.name = sname;
		this.course = scourse;
		this.faculty = fac;
	}

	// 'toString' method
	public String toString() {
		String result = "";
		result += "ID: "+getStudentId() + ", ";
		result += "Name: "+getName() +", ";
		result += "Course: "+getCourse() + ", ";
		result += "Faculty: "+getFaculty();
		return result;
	}
	
	// 'getter' methods
	public int getStudentId() {
		return this.studentId;
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
}
