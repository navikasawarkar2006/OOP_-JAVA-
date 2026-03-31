class Book {
    // Attributes
    String title;
    String author;
    double price;

    // Constructor to initialize book details
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book information
    void displayDetails() {
        System.out.println("Book: " + title + " | Author: " + author + " | Price: ₹" + price);
    }

    public static void main(String[] args) {
        // Storing multiple books in an array
        Book[] library = {
            new Book("The Alchemist", "Paulo Coelho", 299.0),
            new Book("Atomic Habits", "James Clear", 450.5),
            new Book("Deep Work", "Cal Newport", 380.0)
        };

        System.out.println("--- Library Book Details ---");
        for (Book b : library) {
            b.displayDetails();
        }
    }
}
