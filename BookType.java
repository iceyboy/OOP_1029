package part02;

public enum BookType {
	
	FICTION("Stories from the imagination"),
	NON_FICTION("Factual, real-life experiences"),
	REFERENCE("Theories, Philosophies and common knowledge");
	
	private String spelling;
	
	private BookType(String str) {
		
		spelling = str;
		
	}
	
	public String toString() {
		
		return spelling;
		
	}

}
