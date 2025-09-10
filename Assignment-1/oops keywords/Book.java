public class Book {
    // Static
    private static String libraryName = "City Library";
    
    // Instance variables
    private String title;
    private String author;
    private final String isbn; // Final

    // Constructor using 'this'
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Static method
    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    // Display details (using instanceof)
    public void displayDetails() {
        if (this instanceof Book) {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + isbn);
        }
    }

    public static void main(String[] args) {
        Book.displayLibraryName();
        Book b1 = new Book("Java Basics", "James Gosling", "ISBN123");
        b1.displayDetails();
    }
}
