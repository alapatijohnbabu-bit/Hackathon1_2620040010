import java.util.Scanner;

class MovieTicket {

    String movieName;
    double ticketPrice;
    int numberOfTickets;

    double totalAmount;
    double discount;
    double finalAmount;

    // Parameterized constructor
    MovieTicket(String movieName, double ticketPrice, int numberOfTickets) {
        this.movieName = movieName;
        this.ticketPrice = ticketPrice;
        this.numberOfTickets = numberOfTickets;
    }

    // Calculate total amount
    void calculateTotal() {
        totalAmount = ticketPrice * numberOfTickets;
    }

    // Calculate discount
    void calculateDiscount() {
        if (numberOfTickets >= 5) {
            discount = totalAmount * 0.10;
        } else {
            discount = 0;
        }
    }

    // Calculate final amount
    void calculateFinalAmount() {
        finalAmount = totalAmount - discount;
    }

    // Display booking bill
    void displayBill() {
        System.out.println("\n----- CINEMA TICKET BILL -----");
        System.out.println("Movie Name      : " + movieName);
        System.out.printf("Ticket Price    : %.2f%n", ticketPrice);
        System.out.println("Number of Tickets: " + numberOfTickets);
        System.out.printf("Total Amount    : %.2f%n", totalAmount);
        System.out.printf("Discount        : %.2f%n", discount);
        System.out.printf("Final Amount    : %.2f%n", finalAmount);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter movie name: ");
        String movieName = sc.nextLine();

        System.out.print("Enter ticket price: ");
        double ticketPrice = sc.nextDouble();

        System.out.print("Enter number of tickets: ");
        int numberOfTickets = sc.nextInt();

        // Create object using parameterized constructor
        MovieTicket ticket = new MovieTicket(
            movieName, ticketPrice, numberOfTickets
        );

        // Invoke methods
        ticket.calculateTotal();
        ticket.calculateDiscount();
        ticket.calculateFinalAmount();
        ticket.displayBill();

        sc.close();
    }
}