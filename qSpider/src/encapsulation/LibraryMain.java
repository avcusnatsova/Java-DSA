package encapsulation;

public class LibraryMain {
	public static void main(String[] args) {
		Library l = new Library("Cusnat Sova");
		
		l.addBook("Six of Crows", "Leigh Bardugho", "123BN");
		l.addBook("Bell Jar", "Sylvia Plath", "456BN");
		l.addBook("Malibu Rising", "Taylor Jenkins", "789BN");
		l.addBook("All the bright places", "Jennifer Niven", "011BN");
		l.listAllBooks();
		System.out.println();
		l.removeBook("456BN");
		l.listAllBooks();
		System.out.println();
		l.findBook("789BN");
	
	}

}
