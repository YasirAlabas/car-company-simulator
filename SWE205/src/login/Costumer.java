package login;

import javax.sound.midi.Receiver;

import management.Car;
import rental.Reservation;

import java.util.Date;

// This calss is used to store tha data of the customer and also for reservation 
// management system(create,modify and delete)
public class Costumer extends User implements Reserver {

    public Costumer(String fn, String ln, String u, String e, String a, String p, Date d) {
        super(fn, ln, u, e, a, p, d);
    }

    public double createReservation(Car newCar, Date endDate) {
        newCar.setAvailable(false);
        Reservation newReservation = new Reservation(this, newCar, endDate);
        getReservationsList().add(newReservation);
        return newReservation.getTotalPrice();
    }

    public String viewReservation(int index) {
        return getReservationsList().get(index).toString();
    }

    public String deleteReservation(Reservation reservation) {
        int reservationIndex = getReservationsList().indexOf(reservation);
        getReservationsList().get(reservationIndex).getCar().setAvailable(true);
        double cost = getReservationsList().get(reservationIndex).getTotalPrice();
        getReservationsList().remove(reservationIndex);
        return ("Please come to our branch and take your " + cost + "SR back");
    }

    public String modifyReservationLessCost(Reservation reservation, Car car, Date endDate) {
        // This methode is to modify the reservation by remoing it and replace it 
        // by another one when the cost of the old one is less to the new one

        int reservationIndex = getReservationsList().indexOf(reservation);
        double cost = getReservationsList().get(reservationIndex).getTotalPrice();
        getReservationsList().remove(reservationIndex);
        Reservation newReservation = new Reservation(this, car, endDate);
        getReservationsList().add(newReservation);
        double moneyBack = cost - newReservation.getTotalPrice();
        return "The modification is completed\r\nPlease come to our branch and take your " + moneyBack + "SR back";

    }

    public String modifyReservationEqualCost(Reservation reservation, Car car, Date endDate) {
        // This methode is to modify the reservation by remoing it and replace it 
        // by another one when the cost of the old one is equal to the new one

        int reservationIndex = getReservationsList().indexOf(reservation);
        getReservationsList().remove(reservationIndex);
        Reservation newReservation = new Reservation(this, car, endDate);
        getReservationsList().add(newReservation);
        return "The modification is completed";
    }

    public String modifyReservationmoreCost(Reservation reservation, Car car, Date endDate) {
        // This methode is to modify the reservation by remoing it and replace it 
        // by another one when the cost of the old one is grater to the new one

        int reservationIndex = getReservationsList().indexOf(reservation);
        getReservationsList().remove(reservationIndex);
        Reservation newReservation = new Reservation(this, car, endDate);
        getReservationsList().add(newReservation);
        return "The modification is completed";

    }
}
