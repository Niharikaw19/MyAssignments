package week2.homeasg;

public class Library {
	
	public String addBook(String bookTitle) {
		// method with return type string
		System.out.println("Book added sccessfully");
		return bookTitle;
	}
	
	public void issueBook() {
		// method with no return type
		System.out.println("Book issued sccessfully");
	}

	public static void main(String[] args) {
		// creating libraryOptions obj
		Library LibraryOptions = new Library();
		//calling the methods 
		LibraryOptions.addBook("Book1");
		LibraryOptions.issueBook();
		
	}

}
