package circular_linkedlist.onlineticketreservation;

class TicketNode {
    int ticketID;
    String customerName;
    String movieName;
    String seatNumber;
    String bookingTime;
    TicketNode next;

    // Constructor to initialize the ticket details
    public TicketNode(int ticketID, String customerName, String movieName, String seatNumber, String bookingTime) {
        this.ticketID = ticketID;
        this.customerName = customerName;
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.bookingTime = bookingTime;
        this.next = null;
    }
}
