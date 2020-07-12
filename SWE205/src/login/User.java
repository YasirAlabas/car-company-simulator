package login;

import java.util.ArrayList;
import java.util.Date;

import rental.Reservation;

// This class is used to store the date of the user
public abstract class User implements Reserver {

    private String fName;
    private String lName;
    private String userName;
    private ArrayList<Reservation> reservationsList = new ArrayList<Reservation>();
    private ArrayList<User> userList = new ArrayList<User>();
    private String email;
    private String address;
    private String password;
    private Date dateOfBirth;

    public User(String fn, String ln, String u, String e, String a, String p, Date d) {
        fName = fn;
        lName = ln;
        userName = u;
        email = e;
        address = a;
        password = p;
        dateOfBirth = d;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public String getUserName() {
        return userName;
    }

    public ArrayList<Reservation> getReservationsList() {
        return reservationsList;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getPassword() {
        return password;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setReservationsList(ArrayList<Reservation> reservationsList) {
        this.reservationsList = reservationsList;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String toString() {
        return ("First Name: " + fName + "\nLast Name: " + lName + "\nEmail: " + email + "\nAddress: " + address + "\nDate Of Birth: "
                + dateOfBirth);
    }

    public void addUser(User u) {
        userList.add(u);

    }

    public boolean equals(Object o) {
        if (o == null) {
            return false;
        } else if (getClass() != o.getClass()) {
            return false;
        } else {
            User user = (User) o;
            return (userName == user.userName);
        }
    }
}
