package doubly_linkedlist.LibraryManagement;


class BookNode {
    String bookTitle;
    String author;
    String genre;
    int bookId;
    boolean isAvailable;
    BookNode next;
    BookNode prev;

    // Constructor for BookNode
    public BookNode(String bookTitle, String author, String genre, int bookId, boolean isAvailable) {
        this.bookTitle = bookTitle;
        this.author = author;
        this.genre = genre;
        this.bookId = bookId;
        this.isAvailable = isAvailable;
        this.next = null;
        this.prev = null;
    }
}
