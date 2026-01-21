package encapsulation;

public class Book {
	private String Title;
	private String Author;
	private String Isbn;
	
	Book(String Title, String Author, String Isbn){
		this.Title = Title;
		this.Author = Author;
		this.Isbn = Isbn;
	}
	
	public String getTitle() {
		return Title;
	}
	
	public String getAuthor() {
		return Author;
	}
	
	public String getIsbn() {
		return Isbn;
	}

}
