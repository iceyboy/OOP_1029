package demol9;

public class StudentTester {

	public static void main(String[] args) {
		// A class is a 'blueprint' for creating objects
		// An object is an instance of a class
		// s1 & s2 are references to Student object instances
		// We can use s1 & s2 to access 'public' methods (and data)
		// However, all data within an object should be 'private' by default
		// You then use 'public' setters/getters or other methods to access.
		
		Student s1 = new Student(1, "Homer", "Computer Science", 'S');
		Student s2 = new Student(2, "Bart", "Software Engineering", 'S');
		
		System.out.println(s1); // will call 'toString' for s1 (if it has been defined)
		System.out.println(s2); // each object will have its own copy of instance data

	}

}
