package doubly_linkedlist.LibraryManagement;

public class Main {
    public static void main(String[] args) {
        LibraryManagementSystem library = new LibraryManagementSystem();

        // Adding books and comics to the library with Indian titles and popular anime/comics
        library.addBookAtBeginning("The White Tiger", "Aravind Adiga", "Fiction", 101, true);  // Indian Book
        library.addBookAtEnd("Naruto", "Masashi Kishimoto", "Manga", 102, true);  // Popular Manga
        library.addBookAtEnd("One Piece", "Eiichiro Oda", "Manga", 103, true);  // Popular Manga
        library.addBookAtPosition(1, "Mushoku Tensei", "Rifujin na Magonote", "Light Novel", 104, false);  // Anime Light Novel
        library.addBookAtEnd("Chetan Bhagat: Five Point Someone", "Chetan Bhagat", "Fiction", 105, true);  // Indian Book
        library.addBookAtEnd("Ramayana", "Valmiki", "Epic", 106, true);  // Ancient Indian Epic

        // Display all books in forward order
        System.out.println("Books in Forward Order:");
        library.displayBooksForward();

        // Display all books in reverse order
        System.out.println("\nBooks in Reverse Order:");
        library.displayBooksReverse();

        // Search for a book by Title (Searching for 'Naruto')
        BookNode book = library.searchBookByTitle("Naruto");
        if (book != null) {
            System.out.println("\nFound book: " + book.bookTitle + " by " + book.author);
        } else {
            System.out.println("\nBook not found.");
        }

        // Update availability status of a book (making 'Mushoku Tensei' available)
        library.updateAvailabilityStatus(104, true);

        // Remove a book by Book ID (Removing 'Chetan Bhagat: Five Point Someone' by ID)
        library.removeBookById(105);

        // Display all books after removal
        System.out.println("\nBooks after Removal:");
        library.displayBooksForward();

        // Count the total number of books
        System.out.println("\nTotal number of books in the library: " + library.countBooks());
    }
}
