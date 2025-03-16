// Main class to test the implementation
public class BookSystem {
    public static void main(String[] args) {
        Author author = new Author("Six of Crows", 2000, "Leigh Bardugo", "American Writter.");
        author.displayInfo();
    }
}
// Superclass Book
class Book {
    String title;
    int publicationYear;

    // Constructor
    public Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    // Method to display book info
    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Publication Year: " + publicationYear);
    }
}

// Subclass Author
class Author extends Book {
    String name;
    String bio;

    // Constructor
    public Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear); // Call superclass constructor
        this.name = name;
        this.bio = bio;
    }

    // Override displayInfo to include author details
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call superclass method
        System.out.println("Author Name: " + name);
        System.out.println("Author Bio: " + bio);
    }
}
//output
// Title: Six of Crows
//Publication Year: 2000
//Author Name: Leigh Bardugo
//Author Bio: American Writter.