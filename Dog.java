package practical3;

public class Dog {

	private String name;
	
	private String breed;
	
	private int age;
	
	private Gender gender;
	
	public Dog(String name, String breed, int age, Gender gen) {
		
		setName(name);
		
		setBreed(breed);
		
		setAge(age);
		
		setGender(gen);
		
	}

	public Dog() {
		
		this(null, null, -1, Gender.UNASSIGNED);
		
	}

	public void setName(String name) {
		
		if (name != null) {
			
			this.name = name;
			
		} else {
			
			if (this.name == null) {
				
				this.name = "Unknown";
				
			}
			
		}
		
	}

	public String getGender() {
		
		return gender.toString();
		
	}

	public void setGender(Gender gen) {
		
		this.gender = gen;
		
	}

	public void setGender(char gen) {
		
		if (gen == 'M') {
			
			setGender(Gender.MALE);
		
		}else if (gen == 'F') {
			
			setGender(Gender.FEMALE);
		
		}else {
			
			setGender(Gender.UNASSIGNED);
			
		}
		
	}

	public void setBreed(String breed) {
		
		if (breed != null) {
			
			this.breed = breed;
			
		} else {
			
			if (this.breed == null) {
	
				this.breed = "Unknown";
				
			}
			
		}
		
	}

	public void setAge(int age) {
		
		if (age >= 0) {
			
			this.age = age;
			
		} else {
			
			this.age = -1;
			
		}
		
	}
	

	public String getName() {
		
		return this.name;
		
	}

	public String getBreed() {
		
		return this.breed;
		
	}

	public int getAge() {
		
		return this.age;
		
	}

	

	public String getDetails() {
		
		String result = "Name: " + getName() + ", Breed: " + getBreed() + ", Age: " + getAge() + ", Gender:"
				+ getGender();
		
		return result;
		
	}

	public String toString() {
		
		return getDetails();
		
	}

}