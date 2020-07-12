package login;

import java.util.ArrayList;
import java.util.Date;

// This calss is used to store the date of the users and also to create a new user
// ans the login methode
public class Authentication {

    private static ArrayList<User> userList = new ArrayList<User>();

    public static boolean login(String u, String p) {
        // this mehtod is used for the login process it will retuen true if the user found
        // and false if it is not
        boolean check = false;
        for (int i = 0; i < userList.size(); i++) {
            if (userList.get(i).getUserName().equals(u) && userList.get(i).getPassword().equals(p)) {
                check = true;
                break;
            }
        }
        return check;
    }

    public static String createNewUser(String fn, String ln, String u, String e, String a,
            String p, Date d) {
        // This methode is used to create a new user
        for (int i = 0; i < userList.size(); i++) {
            if (u.equals(userList.get(i).getUserName())) {
                return "The Username is Already Used";
            }
            if (e.equals(userList.get(i).getEmail())) {
                return "The Email is Already Used";
            }

        }
        if (u.equals("*saeed*")) {
            return "The Username is Already Used";
        }
        User newUser = new Costumer(fn, ln, u, e, a, p, d);
        userList.add(newUser);
        return "The Account Has Been Created";
    }

    public static ArrayList<User> getUserList() {
        return userList;
    }

    public static User getUser(ArrayList<User> userList, String username, String password) {
        // This methode will retuen the user from the list by appling the username
        // and the password
        for (int i = 0; i < userList.size(); i++) {
            if (userList.get(i).getUserName().equals(username) && userList.get(i).getPassword()
                    .equals(password)) {
                return userList.get(i);
            }
        }
        return null;
    }

}
