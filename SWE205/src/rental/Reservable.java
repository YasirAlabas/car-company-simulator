package rental;
import java.util.*;

import exceptions.AlreadyReservedException;
import login.Reserver;

public interface Reservable {


	public abstract void addStartDate(Date startDate);
	public abstract void addEndDate(Date endDate);
	public abstract void reserve(Date startDate, Date endDate, Reserver reserver) throws AlreadyReservedException;
	public abstract boolean isReserved(Date startDate, Date endDate);
	public abstract boolean isReserved();
	public abstract void removeReservation(Date startDate, Date endDate,Reserver reserver);
	public abstract String dateToString(Date date);
	public abstract double getCostPerDay();
}
