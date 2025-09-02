class MovieTicket {
    String movieName;
    String seatNumber;
    double price;

    // Constructor
    MovieTicket(String movieName) {
        this.movieName = movieName;
        this.seatNumber = "";
        this.price = 0;
    }

    void bookTicket(String seatNumber, double price) {
        this.seatNumber = seatNumber;
        this.price = price;
        System.out.println("Ticket booked successfully for seat " + seatNumber);
    }

    void displayDetails() {
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: " + price);
    }
}

public class MovieTicketTest {
    public static void main(String[] args) {
        MovieTicket ticket = new MovieTicket("Avengers: Endgame");
        ticket.bookTicket("A12", 350);
        ticket.displayDetails();
    }
}
