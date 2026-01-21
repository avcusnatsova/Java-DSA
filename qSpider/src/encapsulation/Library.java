package encapsulation;

public class Library {
	private String Name;
	private Book [] b = new Book[5];
	
	Library (String Name) {
		this.Name = Name;
	}
	
	public void addBook(String Title, String Author, String Isbn ) {
		for(int i = 0; i < b.length; i++) {
			if(b[i] == null) {
				b[i] = new Book(Title, Author, Isbn);
				break;
			}
		
		}
	}
	
	public void removeBook(String Isbn) {
		for(int i = 0; i < b.length; i++) {
			if(b[i] != null && b[i].getIsbn() .equals(Isbn)) {
				b[i] = null;
				System.out.println("Book Deleted");
				break;
			}
		}
		
	}
	
	public void findBook(String Isbn) {
		for(int i = 0; i < b.length; i++) {
			if(b[i] != null && b[i].getIsbn().equals(Isbn)) {
				System.out.println("Title - " + b[i].getTitle() + "| Author Name - " + b[i].getAuthor() + "| Book Number - " + b[i].getIsbn());
			}
		}
	}
	
	public void listAllBooks() {
		for(Book books: b) {
			if(books != null) {
				System.out.println("Title - " + books.getTitle() + "| Author Name - " + books.getAuthor() + "| Book Number - " + books.getIsbn());
			}
		}
	}

}
