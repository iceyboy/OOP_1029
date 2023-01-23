package aoifeAI;

public class aoife {

	private String hair;
	private String mood;
	private String outfit;
	private int hunger;

	public aoife(String hair, String mood, String outfit, int hunger) {

		this.hair = hair;
		this.mood = mood;
		this.outfit = outfit;
		this.hunger = hunger;

	}

	public void setOutfit(String newOutfit) {
		if (newOutfit != null) {
			this.outfit = newOutfit;
		}
	}

	public String getOutfit() {
		return this.outfit;
	}

	public void walk() {
		System.out.println("I am walking as fast as I can! (1 km/h)");
	}

	public void hair() {
		System.out.println("Do you like my hair? I did it " + this.hair + " today.");
	}

	public void mood() {
		
		if(mood == "angry") {
			System.out.println("I am angry! (hungry)");
		}else if(mood == "happy") {
			System.out.println(":))))");
		}else if(mood == "sad") {
			System.out.println(":(((");
		}else if(mood == "fortnite") {
			System.out.println(";)");
		}else {
			System.out.println("Grrr I don't know what's wrong!");
		}
		
	}
	
	public void hungry() {
		if (hunger >= 5) {
			System.out.println("I literally haven't ate anything all day. >:/ ");
		}else if(hunger < 2) {
			System.out.println("I am stuffed. ");
		}else {
			System.out.println("I'm fine.");
		}
	}

}
