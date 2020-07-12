package management;
import java.text.SimpleDateFormat;
import java.util.*;


// This class is used to store the date of a car
public class Car{
    private int serialNum;
    private String brand;
    private String plateNum;
    private String color;
    private String size;
    private String model;
    private boolean available = true;
    private boolean damaged =false;
    private double costPerDay;
      
    public Car(int serialNum, String brand, String plateNum, String color, String size, String model, double costPerDay) {
 		super();
 		this.serialNum = serialNum;
 		this.brand = brand;
 		this.plateNum = plateNum;
 		this.color = color;
 		this.size = size;
 		this.model = model;
 		this.costPerDay = costPerDay;
                
 	}

    public int getSerialNum() {
        return serialNum;
    }

    public String getBrand() {
        return brand;
    }

    public String getPlateNum() {
        return plateNum;
    }

    public String getColor() {
        return color;
    }

    public String getSize() {
        return size;
    }

    public String getModel() {
        return model;
    }

    public boolean isAvailable() {
        return available;
    }

    public boolean isDamaged() {
        return damaged;
    }

    public double getCostPerDay() {
        return costPerDay;
    }

    public void setSerialNum(int serialNum) {
        this.serialNum = serialNum;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPlateNum(String plateNum) {
        this.plateNum = plateNum;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void setDamaged(boolean damaged) {
        this.damaged = damaged;
        if(this.damaged){
            this.available=false;
        }
    }

    public void setCostPerDay(double costPerDay) {
        this.costPerDay = costPerDay;
    }


	public String toString(){
        return ("SerialNumber: "+serialNum+"\nBrand: "+brand+"\nPlateNumber: "+plateNum+"\nColor: "+ color+"\nSize: "+size+
                "\nModel: "+model);
    }

    public boolean equals(Object o){
        if(o==null){
            return false;
        }
        else if (getClass() != o.getClass()){
            return false;
        }
        else{
            Car car = (Car)o;
            return (serialNum==car.getSerialNum());
        }
    }
}


