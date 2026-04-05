
import java.util.*;
class User{
    private String name;
    private String email;
    public User(String name,String email){
        this.name = name;
        setEmail(email);
    }public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        if(!email.contains("@")){
            throw new IllegalStateException("Invalid email format");
        }
        this.email =email;
    }
}
class Flight{
    private String flightName;
    private String flightId;
    private String source;
    private String destination;
    private int availableSeats;
    public Flight(String flightName,String flightId,String source, String destination , int seats){
        this.flightName = flightName;
        this.flightId = flightId;
        this.source =source;
        this.destination = destination;
        this.availableSeats=seats;

    }
    public void bookSeat(){
        if(availableSeats <=0){
           throw new IllegalStateException("No Seats Available! girlie! "); 
        }availableSeats--;
    }  
    public int getAvailableSeats(){
        return availableSeats;
    }
    public String getFlightId(){
        return flightId;
    }
    public String getFlightName(){
        return flightName;
    }

}
class Seat{
    private int seatNo;
    public Seat(int seatNo){
     this.seatNo=seatNo;
    }
    public int getSeatNumber(){
        return seatNo;
    }
}
abstract class Payment{
    protected double amount;
    public Payment(double amount){
        this.amount =amount;
    }
    abstract void makePayment();
}
class creditCardPayment extends Payment{
    public creditCardPayment (double amount){
        super(amount);
    }
    void makePayment(){
        System.out.println("You paid "+amount +" this much using your credit card ");
    }
}
class upipayment extends Payment{
    public upipayment(double amount){
        super(amount);
    }
    void makePayment(){
        System.out.println("gurl you paid "+amount+" using upi ");
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

        System.out.println("\n🎟 Booking Confirmed");
        System.out.println("User: " + user.getName());
        System.out.println("Flight: " + flight.getFlightId());
        System.out.println("Seat: " + seat.getSeatNumber());
    }
}

// MAIN CLASS
public class FlightBookingSystem {
    public static void main(String[] args) {

        try {
            User user = new User("Elamathi", "ela@gmail.com");

            Flight flight = new Flight("AI101", "Chennai", "Delhi", null, 2);

            // SUCCESS
            Booking b1 = new Booking(user, flight, new Seat(1), new CreditCardPayment(5000));
            b1.confirmBooking();

            Booking b2 = new Booking(user, flight, new Seat(2), new UpiPayment(4500));
            b2.confirmBooking();

            // FAIL (no seats)
            Booking b3 = new Booking(user, flight, new Seat(3), new UpiPayment(4000));
            b3.confirmBooking();

        } catch (IllegalStateException e) {
            System.out.println("⚠ Input Error: " + e.getMessage());

        } catch (Exception e) {
            System.out.println("⚠ Unexpected Error: " + e.getMessage());
        }
    }
}