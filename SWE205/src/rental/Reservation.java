package rental;

//This calss a data class that store the information about a reservation
import java.text.SimpleDateFormat;
import java.util.*;

import exceptions.DateInThePastException;
import login.Reserver;
import management.Car;

public class Reservation {

    private Car car;
    private Reserver reserver;
    private Date startDate;
    private Date endDate;
    private double totalPrice = 0.0;

    public Reservation() {
        this(null, null, null);
    }

    /**
     * This contractor takes the number of days from today's date to the end
     * date and multiply it by the car price to get the total price.
     *
     * @param reserver The reserver who reserve the car
     * @param car the car being reserved
     * @param endDate The end date of the reservation
     */
    public Reservation(Reserver reserver, Car car, Date endDate) {
        this.reserver = reserver;
        this.car = car;
        this.startDate = Reservation.getTodayDate();
        this.endDate = endDate;
        int days = (int) ((endDate.getTime() / (1000 * 60 * 60 * 24)) - (startDate.getTime() / (1000 * 60 * 60 * 24)))
                + 1;
        this.totalPrice = car.getCostPerDay() * days;

    }

    public void setCar(Car car) {
        this.car = car;
    }

    public void setReserver(Reserver reserver) {
        this.reserver = reserver;
    }

    public void setDate(Date startDate, Date EndDate) {
        this.startDate = startDate;
        this.endDate = EndDate;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public boolean equals(Reservation other) {
        return (this.car.equals(other.car)) && (this.startDate.equals(other.startDate))
                && (this.endDate.equals(other.endDate) && this.reserver.equals(other.reserver));

    }

    public String toString() {

        String str;
        str = car + "\r\n" + dateToString(startDate) + "\r\n" + dateToString(endDate) + "\r\n" + reserver + "\r\n"
                + totalPrice + "\r\n\r\n";

        return str;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    /**
     * Takes a date and return it as a string in the form of dd/MM/Y
     *
     * @param date
     * @return The date string in the form dd/MM/Y
     */
    public static String dateToString(Date date) {
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/Y");
        return df.format(date);
    }

    public Car getCar() {
        return car;
    }

    /**
     * this method returns the today's date and set the hours, minutes and
     * seconds to 0
     *
     * @return Today's date
     */
    public static Date getTodayDate() {
        Date todayDate = new Date();
        todayDate.setHours(0);
        todayDate.setMinutes(0);
        todayDate.setSeconds(0);
        return todayDate;
    }

    /**
     * This method takes three parameters: the start date, end date and the
     * daily price. It takes the time of the start and end dates in milliseconds
     * and divides each one by (1000*60*60*24) to get the number of days the it
     * takes the difference between them plus 1 to count the start date with
     * them. After that it multiplies the number of days by the daily cost to
     * get the total price.
     *
     * @param startDate
     * @param endDate
     * @param costPerDay
     * @return the total price
     * @throws DateInThePastException if the date of the end date was before the
     * start date
     */
    public static double getTotalPrice(Date startDate, Date endDate, double costPerDay) throws DateInThePastException {
        int days = (int) ((endDate.getTime() / (1000 * 60 * 60 * 24)) - (startDate.getTime() / (1000 * 60 * 60 * 24)))
                + 1;
        if (days <= 0) {
            throw new DateInThePastException();
        }
        return days * costPerDay;
    }

    public static Reservation getReservation(ArrayList<Reservation> reservationsList, int serial) {
        for (int i = 0; i < reservationsList.size(); i++) {
            if (reservationsList.get(i).getCar().getSerialNum() == serial) {
                return reservationsList.get(i);
            }
        }
        return null;
    }
}
