import java.util.*;

class User {
    private String name;
    private String email;

    public User(String name, String email) {
        this.name = name;
        setEmail(email);
    }

    public String getName() { return name; }

    public String getEmail() { return email; }

    public void setEmail(String email) {
        if (!email.contains("@")) {
            throw new IllegalArgumentException("Invalid email format!");
        }
        this.email = email;
    }
}

class Flight {
    private String flightId;
    private String flightName;
    private String source;
    private String destination;
    private int availableSeats;

    public Flight(String flightId, String source, String destination, int seats, String flightName ) {
        this.flightId = flightId;
        this.flightName = flightName;
        this.source = source;
        this.destination = destination;
        this.availableSeats = seats;
    }

    public void bookSeat() {
        if (availableSeats <= 0) {
            throw new IllegalStateException("No seats available!");
        }
        availableSeats--;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public String getFlightId() {
        return flightId;
    }
    public String getFlightName(){
        return flightName;
    }
}


class Seat {
    private int seatNumber;

    public Seat(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public int getSeatNumber() {
        return seatNumber;
    }
}

abstract class Payment {
    protected double amount;

    public Payment(double amount) {
        this.amount = amount;
    }

    abstract void makePayment();
}

class CreditCardPayment extends Payment {
    public CreditCardPayment(double amount) {
        super(amount);
    }

    void makePayment() {
        System.out.println("Paid " + amount + " using Credit Card ");
    }
}

class UpiPayment extends Payment {
    public UpiPayment(double amount) {
        super(amount);
    }

    void makePayment() {
        System.out.println("Paid " + amount + " using UPI");
    }
}

class Booking {
    private User user;
    private Flight flight;
    private Seat seat;
    private Payment payment;

    public Booking(User user, Flight flight, Seat seat, Payment payment) {
        this.user = user;
        this.flight = flight;
        this.seat = seat;
        this.payment = payment;
    }

    public void confirmBooking() {
        flight.bookSeat(); // may throw exception
        payment.makePayment();

        System.out.println("Booking Confirmed");
        System.out.println("User: " + user.getName());
        System.out.println("Flight: " + flight.getFlightId());
        System.out.println("Seat: " + seat.getSeatNumber());
    }
}


public class FlightBookingSystem {
    public static void main(String[] args) {

        try {
            User user = new User("Elamathi", "ela@gmail.com");

            Flight flight = new Flight("AI101", "Chennai", "Delhi", 2, Boeing);

            
            Booking b1 = new Booking(user, flight, new Seat(1), new CreditCardPayment(5000));
            b1.confirmBooking();

            Booking b2 = new Booking(user, flight, new Seat(2), new UpiPayment(4500));
            b2.confirmBooking();

         
            Booking b3 = new Booking(user, flight, new Seat(3), new UpiPayment(4000));
            b3.confirmBooking();

        } catch (IllegalArgumentException e) {
            System.out.println(" Input Error: " + e.getMessage());

        } catch (IllegalStateException e) {
            System.out.println("Booking Error: " + e.getMessage());

        } catch (Exception e) {
            System.out.println(" Unexpected Error: " + e.getMessage());
        }
    }
}