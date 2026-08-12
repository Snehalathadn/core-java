class FlightTicket {

    static void book(String passengerName, String source,
                     String destination, int age,
                     double ticketPrice, boolean windowSeat) {

        System.out.println("Running book in FlightTicket");

        if (passengerName != null && source != null &&
            destination != null && age > 2 && age < 100 &&
            ticketPrice > 0) {

            System.out.println("Passenger Name : " + passengerName);
            System.out.println("Source         : " + source);
            System.out.println("Destination    : " + destination);
            System.out.println("Age            : " + age);
            System.out.println("Ticket Price   : " + ticketPrice);
            System.out.println("Window Seat    : " + windowSeat);
            System.out.println("Flight Ticket Booked Successfully");
        } else {
            System.out.println("Invalid Details");
        }
    }
}