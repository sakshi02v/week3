package circular_linkedlist.onlineticketreservation;

class TicketReservationSystem {
    private TicketNode head;
    private TicketNode tail;
    private int totalTickets;

    // Constructor to initialize the system with no reservations
    public TicketReservationSystem() {
        head = tail = null;
        totalTickets = 0;
    }

    // Add a new ticket reservation at the end of the list
    public void addTicket(int ticketID, String customerName, String movieName, String seatNumber, String bookingTime) {
        TicketNode newTicket = new TicketNode(ticketID, customerName, movieName, seatNumber, bookingTime);

        if (head == null) {
            // If no tickets, set both head and tail to the new ticket
            head = tail = newTicket;
            newTicket.next = head;  // Circular link
        } else {
            // Add new ticket at the end and link it back to the head
            tail.next = newTicket;
            tail = newTicket;
            tail.next = head;  // Circular link
        }
        totalTickets++;
    }

    // Remove a ticket by Ticket ID
    public void removeTicket(int ticketID) {
        if (head == null) {
            System.out.println("No tickets to remove.");
            return;
        }

        TicketNode current = head;
        TicketNode previous = null;

        // Special case: if the ticket to remove is the head
        if (current.ticketID == ticketID) {
            if (head == tail) {
                // If there’s only one ticket, clear both head and tail
                head = tail = null;
            } else {
                head = head.next;
                tail.next = head; // Circular link
            }
            totalTickets--;
            System.out.println("Ticket with ID " + ticketID + " has been removed.");
            return;
        }

        // Traverse through the list to find the ticket
        do {
            previous = current;
            current = current.next;
        } while (current != head && current.ticketID != ticketID);

        // If ticket not found
        if (current == head) {
            System.out.println("Ticket with ID " + ticketID + " not found.");
        } else {
            previous.next = current.next;

            // If we removed the tail, adjust the tail
            if (current == tail) {
                tail = previous;
            }
            totalTickets--;
            System.out.println("Ticket with ID " + ticketID + " has been removed.");
        }
    }

    // Display all the current booked tickets
    public void displayTickets() {
        if (head == null) {
            System.out.println("No tickets booked.");
            return;
        }

        TicketNode current = head;
        do {
            System.out.println("Ticket ID: " + current.ticketID + ", Customer: " + current.customerName + ", Movie: " + current.movieName
                    + ", Seat: " + current.seatNumber + ", Time: " + current.bookingTime);
            current = current.next;
        } while (current != head);
    }

    // Search for a ticket by Customer Name or Movie Name
    public void searchTicket(String query) {
        if (head == null) {
            System.out.println("No tickets available.");
            return;
        }

        TicketNode current = head;
        boolean found = false;
        do {
            if (current.customerName.equalsIgnoreCase(query) || current.movieName.equalsIgnoreCase(query)) {
                System.out.println("Found Ticket: ID: " + current.ticketID + ", Customer: " + current.customerName + ", Movie: " + current.movieName
                        + ", Seat: " + current.seatNumber + ", Time: " + current.bookingTime);
                found = true;
            }
            current = current.next;
        } while (current != head);

        if (!found) {
            System.out.println("No ticket found for the search query: " + query);
        }
    }

    // Calculate and display the total number of tickets booked
    public void displayTotalTickets() {
        System.out.println("Total tickets booked: " + totalTickets);
    }
}