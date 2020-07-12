package management;

import java.util.ArrayList;

import exceptions.CarAlreadyAddedException;
import exceptions.CarNotAvailableException;
import exceptions.CarNotFoundException;
import exceptions.NotValidBrandException;
import exceptions.NotValidCarException;
import exceptions.NotValidColorException;
import exceptions.NotValidModelException;
import exceptions.NotValidSizeException;

/*
* This calss is the main class for the management of the cars and
* it contains most of the methods that deal with the car rental and management for the employees.
 */
public class CarManagement {

    private ValidProperties validCarProperties;

    private ArrayList<Car> carList;

    public CarManagement(ArrayList<Car> carList, ValidProperties validCarProperties) {
        this.carList = carList;
        this.validCarProperties = validCarProperties;
    }

    public ValidProperties getValidCarProperties() {
        return validCarProperties;
    }

    /**
     * Searches for the car that have the same serial number in the ArrayList of
     * cars and returns it if it is found and throws Not found exception if it
     * was not found.
     *
     * @param carSerialNum the serial number of the wanted car
     * @return the car that has the same serial number
     * @throws CarNotFoundException if the car was not found
     */
    public Car getCar(int carSerialNum) throws CarNotFoundException {

        int i = 0;
        while (i < carList.size()) {

            if (carSerialNum == carList.get(i).getSerialNum()) {
                return carList.get(i);
            }
            i++;
        }
        throw new CarNotFoundException();
    }

    public int getCarIndex(int carSerialNum) throws CarNotFoundException {

        int i = 0;
        while (i < carList.size()) {

            if (carSerialNum == carList.get(i).getSerialNum()) {
                return i;
            }
        }

        throw new CarNotFoundException();
    }

    /**
     * checks if the car has valid properties form the validProperties object at
     * first and throws NotValidCarException if it has a not valid property or
     * more. After that it checks if the car has been added before or not and
     * throws exception if it has. And then if there is no exception it adds it
     * to the arrayList of cars.
     *
     * @param c the car that needs to be added
     * @throws CarAlreadyAddedException if it has been added before
     * @throws NotValidCarException if the car dose not satisfy the valid
     * properties.
     */
    public void addCar(Car c) throws CarAlreadyAddedException, NotValidCarException {

        if (!validCarProperties.isValidCar(c)) {
            throw new NotValidCarException();
        }
        for (int i = 0; i < carList.size(); i++) {
            if (c.equals(carList.get(i))) {
                throw new CarAlreadyAddedException();
            }
        }

        this.carList.add(c);

    }

    /**
     * Calls the method getCar(int carSerialNum) to check if the car exists or
     * not and then checks if it is available or not . after that it removes the
     * car from the car list if it is exists and available.
     *
     * @param carSerialNum
     * @throws CarNotFoundException if the car does not exists
     * @throws CarNotAvailableException if the car is not available
     */
    public void removeCar(int carSerialNum) throws CarNotFoundException, CarNotAvailableException {

        Car c = getCar(carSerialNum);
        carAvailibelty(carSerialNum);
        this.carList.remove(c);
    }

    /**
     * checks if the car has a valid model and then calls the method getCar(int
     * carSerialNum) to check if the car exists or not and then checks if it is
     * available or not . after that it modifies the car's model if it has valid
     * model, exists and is available.
     *
     * @param carSerialNum
     * @param model
     * @throws CarNotFoundException
     * @throws CarNotAvailableException
     * @throws NotValidModelException
     */
    public void modifyCarModel(int carSerialNum, String model)
            throws CarNotFoundException, CarNotAvailableException, NotValidModelException {
        if (!validCarProperties.isValidModel(model)) {
            throw new NotValidModelException();
        }
        int i = getCarIndex(carSerialNum);
        carAvailibelty(carSerialNum);
        this.carList.get(i).setModel(model);

    }

    public void modifyCarSize(int carSerialNum, String size)
            throws CarNotFoundException, CarNotAvailableException, NotValidSizeException {
        if (!validCarProperties.isValidSize(size)) {
            throw new NotValidSizeException();
        }
        int i = getCarIndex(carSerialNum);
        carAvailibelty(carSerialNum);
        this.carList.get(i).setSize(size);

    }

    public void modifyCarBrand(int carSerialNum, String brand)
            throws CarNotFoundException, CarNotAvailableException, NotValidBrandException {
        if (!validCarProperties.isValidBrand(brand)) {
            throw new NotValidBrandException();
        }
        int i = getCarIndex(carSerialNum);
        carAvailibelty(carSerialNum);
        this.carList.get(i).setBrand(brand);

    }

    public void modifyCarCostPerDay(int carSerialNum, double costPerDay)
            throws CarNotFoundException, CarNotAvailableException {
        int i = getCarIndex(carSerialNum);
        carAvailibelty(carSerialNum);
        this.carList.get(i).setCostPerDay(costPerDay);

    }

    public void modifyCarDamage(int carSerialNum, boolean damaged)
            throws CarNotFoundException, CarNotAvailableException {
        int i = getCarIndex(carSerialNum);
        carAvailibelty(carSerialNum);
        this.carList.get(i).setDamaged(damaged);

    }

    public void modifyCarColor(int carSerialNum, String color)
            throws CarNotFoundException, CarNotAvailableException, NotValidColorException {
        if (!validCarProperties.isValidColor(color)) {
            throw new NotValidColorException();
        }
        int i = getCarIndex(carSerialNum);
        carAvailibelty(carSerialNum);
        this.carList.get(i).setColor(color);

    }

    public void modifyCarPlateNum(int carSerialNum, String plateNum)
            throws CarNotFoundException, CarNotAvailableException {
        int i = getCarIndex(carSerialNum);
        carAvailibelty(carSerialNum);
        this.carList.get(i).setPlateNum(plateNum);

    }

    public void modifyCarSerialNum(int carSerialNum, int serialNum)
            throws CarNotFoundException, CarNotAvailableException {
        int i = getCarIndex(carSerialNum);
        carAvailibelty(carSerialNum);
        this.carList.get(i).setSerialNum(serialNum);

    }

    public void modifyCarAvilability(int carSerialNum, boolean available) throws CarNotFoundException {
        int i = getCarIndex(carSerialNum);

        this.carList.get(i).setAvailable(available);

    }

    /**
     * calls the method getCar(int carSerialNum) to check if the car exists or
     * not and then checks if it is available or not . after that it removes the
     * car from the car list if it is exists and available and add the new car
     * with the modified properties.
     *
     * @param carSerialNum
     * @param c
     * @throws CarNotFoundException
     * @throws CarAlreadyAddedException
     * @throws NotValidCarException
     * @throws CarNotAvailableException
     */
    public void modifyCar(int carSerialNum, Car c)
            throws CarNotFoundException, CarAlreadyAddedException, NotValidCarException, CarNotAvailableException {
        getCarIndex(carSerialNum);
        carAvailibelty(carSerialNum);
        this.removeCar(carSerialNum);
        this.addCar(c);

    }

    public String viewCar(int carSerialNum) throws CarNotFoundException {
        int i = getCarIndex(carSerialNum);
        return this.carList.get(i).toString();

    }

    public String viewAllCars() {

        String str = "";

        for (Car c : carList) {
            str += c.toString() + "\n";
        }

        return str;
    }

    public void carAvailibelty(int serialNum) throws CarNotAvailableException, CarNotFoundException {
        Car c = getCar(serialNum);
        if (!c.isAvailable()) {
            throw new CarNotAvailableException();
        }
    }
}
