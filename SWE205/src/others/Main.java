package others;

import java.util.ArrayList;
import java.util.Date;

import login.Login;
import management.Car;
import management.ValidProperties;

/*
 * This Main class contains the propeties and cars which the system will have, and 
 * have the ability to go back to these objects and make changes from any class.
 *   
 * It is also the start point for our programm as the programm will be runned from here.
 */

/**
 *
 * @author YASER
 */

public class Main {
    public static ArrayList<Car> carList = new ArrayList<>();
    public static ValidProperties validProperties;
    public static void main(String[] args){
        Main.ListCars();
        // initialize array lists for the valid properties
        ArrayList<String> validModels = new ArrayList<>() ;
        ArrayList<String> validColors = new ArrayList<>();
        ArrayList<String> validBrands = new ArrayList<>();
        ArrayList<String> validSizes = new ArrayList<>();
   
        validProperties = new  ValidProperties( validColors, validBrands,  validSizes,validModels);

        //initalize base variabels for brands
        validProperties.addValidBrand("TOYOTA");
        validProperties.addValidBrand("BMW");
        validProperties.addValidBrand("GMC");
        validProperties.addValidBrand("FORD");
        
       //initalize base variabels for colors
        validProperties.addValidColor("GREEN");
        validProperties.addValidColor("YELLOW");
        validProperties.addValidColor("WHITE");
        validProperties.addValidColor("BLACK");
        validProperties.addValidColor("RED");
        validProperties.addValidColor("BLUE");
       //initalize base variabels for models
        validProperties.addValidModel("2017");
        validProperties.addValidModel("2016");
        validProperties.addValidModel("2015");
        validProperties.addValidModel("2014");
        validProperties.addValidModel("2013");
        validProperties.addValidModel("2012");
        validProperties.addValidModel("2011");
       
        //initalize base variabels for sizes
        validProperties.addValidSize("SMALL");
        validProperties.addValidSize("SUV");
        
        //this is so when we run the Main class the Login class will appear
        Login login = new Login();
        login.setVisible(true);
       
       
        
    }
    private static void ListCars(){
        //these are cars to test the system(there is no real need for them, as our system allows the creation of new cars)
        Car car1 = new Car(1, "TOYOTA", "123", "RED", "SMALL", "2013", 40);
        Car car2 = new Car(2, "BMW", "400", "BLUE", "SUV", "2011", 60);
        Car car3 = new Car(3, "GMC", "073", "GREEN", "SMALL", "2015", 70);
        Car car4 = new Car(4, "FORD", "105", "GREEN", "SUV", "2013", 50);
        Car car5 = new Car(5, "TOYOTA", "800", "BLACK", "SUV", "2017", 30);
        Car car6 = new Car(6, "BMW", "010", "WHITE", "SMALL", "2012", 90);
        Car car7 = new Car(7, "GMC", "073", "BLUE", "SUV", "2014", 80);
        Car car8 = new Car(8, "FORD", "329", "YELLOW", "SUV", "2016", 50);
        Car car9 = new Car(9, "TOYOTA", "209", "BLUE", "SMALL", "2015", 20);
        Car car10 = new Car(10, "GMC", "505", "YELLOW", "SMALL", "2017", 50);
        Car car11 = new Car(11, "FORD", "173", "GREEN", "SMALL", "2012", 60);
        Car car12 = new Car(12, "FORD", "111", "BLACK", "SMALL", "2011", 50);
        Car car13 = new Car(13, "TOYOTA", "720", "WHITE", "SUV", "2016", 60);
        Car car14 = new Car(14, "BMW", "661", "YELLOW", "SUV", "2014", 40);
        Car car15 = new Car(15, "GMC", "014", "RED", "SUV", "2015", 80);
        Car car16 = new Car(16, "FORD", "987", "RED", "SUV", "2013", 50);
        
        //adding cars to the carList
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
        carList.add(car5);
        carList.add(car6);
        carList.add(car7);
        carList.add(car8);
        carList.add(car9);
        carList.add(car10);
        carList.add(car11);
        carList.add(car12);
        carList.add(car13);
        carList.add(car14);
        carList.add(car15);
        carList.add(car16);
        
  
    }
}
