class Book {
    String title;
    String author;
    double price;

    // Default constructor
    Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    }

    // Parameterized constructor
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void displayBook() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price);
    }

    public static void main(String[] args) {
        Book defaultBook = new Book();
        Book paramBook = new Book("Java Basics", "John Doe", 499.99);

        defaultBook.displayBook();
        paramBook.displayBook();
    }
}
