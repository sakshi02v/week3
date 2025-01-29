package doubly_linkedlist.LibraryManagement;

class LibraryManagementSystem {
    private BookNode head;
    private BookNode tail;
    private int count;

    // Constructor
    public LibraryManagementSystem() {
        this.head = null;
        this.tail = null;
        this.count = 0;
    }

    // Add a book at the beginning
    public void addBookAtBeginning(String bookTitle, String author, String genre, int bookId, boolean isAvailable) {
        BookNode newBook = new BookNode(bookTitle, author, genre, bookId, isAvailable);
        if (head == null) {
            head = tail = newBook;
        } else {
            newBook.next = head;
            head.prev = newBook;
            head = newBook;
        }
        count++;
    }

    // Add a book at the end
    public void addBookAtEnd(String bookTitle, String author, String genre, int bookId, boolean isAvailable) {
        BookNode newBook = new BookNode(bookTitle, author, genre, bookId, isAvailable);
        if (tail == null) {
            head = tail = newBook;
        } else {
            tail.next = newBook;
            newBook.prev = tail;
            tail = newBook;
        }
        count++;
    }

    // Add a book at a specific position
    public void addBookAtPosition(int position, String bookTitle, String author, String genre, int bookId, boolean isAvailable) {
        if (position < 0 || position > count) {
            System.out.println("Invalid position");
            return;
        }
        if (position == 0) {
            addBookAtBeginning(bookTitle, author, genre, bookId, isAvailable);
            return;
        }
        if (position == count) {
            addBookAtEnd(bookTitle, author, genre, bookId, isAvailable);
            return;
        }

        BookNode newBook = new BookNode(bookTitle, author, genre, bookId, isAvailable);
        BookNode current = head;
        for (int i = 0; i < position - 1; i++) {
            current = current.next;
        }

        newBook.next = current.next;
        newBook.prev = current;
        current.next.prev = newBook;
        current.next = newBook;
        count++;
    }

    // Remove a book by Book ID
    public void removeBookById(int bookId) {
        BookNode current = head;
        while (current != null) {
            if (current.bookId == bookId) {
                if (current.prev != null) {
                    current.prev.next = current.next;
                } else {
                    head = current.next;  // If it's the head
                }
                if (current.next != null) {
                    current.next.prev = current.prev;
                } else {
                    tail = current.prev;  // If it's the tail
                }
                count--;
                return;
            }
            current = current.next;
        }
        System.out.println("Book with ID " + bookId + " not found.");
    }

    // Search for a book by Book Title
    public BookNode searchBookByTitle(String title) {
        BookNode current = head;
        while (current != null) {
            if (current.bookTitle.equalsIgnoreCase(title)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    // Search for a book by Author
    public BookNode searchBookByAuthor(String author) {
        BookNode current = head;
        while (current != null) {
            if (current.author.equalsIgnoreCase(author)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    // Update a book's Availability Status
    public void updateAvailabilityStatus(int bookId, boolean isAvailable) {
        BookNode current = head;
        while (current != null) {
            if (current.bookId == bookId) {
                current.isAvailable = isAvailable;
                return;
            }
            current = current.next;
        }
        System.out.println("Book with ID " + bookId + " not found.");
    }

    // Display all books in forward order
    public void displayBooksForward() {
        BookNode current = head;
        while (current != null) {
            System.out.println("Book ID: " + current.bookId + ", Title: " + current.bookTitle + ", Author: " + current.author +
                    ", Genre: " + current.genre + ", Availability: " + (current.isAvailable ? "Available" : "Checked out"));
            current = current.next;
        }
    }

    // Display all books in reverse order
    public void displayBooksReverse() {
        BookNode current = tail;
        while (current != null) {
            System.out.println("Book ID: " + current.bookId + ", Title: " + current.bookTitle + ", Author: " + current.author +
                    ", Genre: " + current.genre + ", Availability: " + (current.isAvailable ? "Available" : "Checked out"));
            current = current.prev;
        }
    }

    // Count the total number of books in the library
    public int countBooks() {
        return count;
    }
}
