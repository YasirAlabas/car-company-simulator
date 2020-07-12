package management;

import java.util.ArrayList;

public class CarSearch {

    public static ArrayList<Car> search(ArrayList<Car> carslist, int serialNum, String brand, String plateNum,
            String color, String size, String model, Boolean available,
            Boolean damaged, double maxPrice, double lowestPrice) {

        /*this class searches for cars in a car list with the properties above or less. Mainly, if you want to search for cars, 
		 * you need to specify all the properties or put the following if you do not want to search the property:
		 * 1. put 0 instead of a property from the following properties if you do not want to search for it:
		 * 			serialNum, maxPrice, lowestPrice.
		 * 2. put "" or null instead of a property from the following properties if you do not want to search for it:
		 * 			brand, plateNum, color, size, model.
		 * 3. put null instead of a property from the following properties if you do not want to search for it:
		 * 			availability, damage.
		 * 		
		 * */
        ArrayList<Car> foundCars = new ArrayList<Car>();
        ArrayList<Car> tempSerialList = searchBySerialNum(carslist, serialNum);
        ArrayList<Car> tempBrandlist = searchByBrand(carslist, brand);
        ArrayList<Car> tempPlatList = searchByPlateNum(carslist, plateNum);
        ArrayList<Car> tempColorList = searchByColor(carslist, color);
        ArrayList<Car> tempSizeList = searchBySize(carslist, size);
        ArrayList<Car> tempModelList = searchByModel(carslist, model);
        ArrayList<Car> tempAvailabiltyList = searchByAvailablity(carslist, available);
        ArrayList<Car> tempDamageList = searchByDamage(carslist, damaged);
        ArrayList<Car> tempPriceList = searchByPrice(carslist, maxPrice, lowestPrice);

        for (Car c : carslist) {
            boolean valid = tempSerialList.contains(c) && tempBrandlist.contains(c) && tempPlatList.contains(c)
                    && tempColorList.contains(c) && tempSizeList.contains(c) && tempModelList.contains(c)
                    && tempAvailabiltyList.contains(c) && tempDamageList.contains(c) && tempPriceList.contains(c);

            if (valid) {
                foundCars.add(c);
            }
        }

        return foundCars;
    }
    // To make the Employee add,delete and modify car

    public static ArrayList<Car> searchBySerialNum(ArrayList<Car> carslist, int serialNum) {
        ArrayList<Car> foundCars = new ArrayList<Car>();
        if (serialNum == 0) {
            return carslist;
        }
        for (Car car : carslist) {
            if (car.getSerialNum() == serialNum) {
                foundCars.add(car);
            }
        }

        return foundCars;
    }
    // To give the user the ability to choose a car by brand

    public static ArrayList<Car> searchByBrand(ArrayList<Car> carslist, String brand) {
        ArrayList<Car> foundCars = new ArrayList<Car>();
        if (brand.isEmpty() || brand == null) {
            return carslist;
        }
        for (Car car : carslist) {
            if (car.getBrand().trim().equalsIgnoreCase(brand)) {
                foundCars.add(car);
            }
        }

        return foundCars;
    }

    public static ArrayList<Car> searchByPlateNum(ArrayList<Car> carslist, String plateNum) {
        ArrayList<Car> foundCars = new ArrayList<Car>();

        if (plateNum.isEmpty() || plateNum == null) {
            return carslist;
        }

        for (Car car : carslist) {
            if (car.getPlateNum().trim().equalsIgnoreCase(plateNum)) {
                foundCars.add(car);
            }
        }

        return foundCars;
    }
    // To give the user the ability to choose a car by Color	

    public static ArrayList<Car> searchByColor(ArrayList<Car> carslist, String color) {
        ArrayList<Car> foundCars = new ArrayList<Car>();
        if (color.isEmpty() || color == null) {
            return carslist;
        }
        for (Car car : carslist) {
            if (car.getColor().trim().equalsIgnoreCase(color)) {
                foundCars.add(car);
            }
        }

        return foundCars;
    }
    // To give the user the ability to choose a car by size

    public static ArrayList<Car> searchBySize(ArrayList<Car> carslist, String size) {
        ArrayList<Car> foundCars = new ArrayList<Car>();
        if (size.isEmpty() || size == null) {
            return carslist;
        }
        for (Car car : carslist) {
            if (car.getSize().trim().equalsIgnoreCase(size)) {
                foundCars.add(car);
            }
        }

        return foundCars;
    }
    // To give the user the ability to choose a car by car Model

    public static ArrayList<Car> searchByModel(ArrayList<Car> carslist, String model) {
        ArrayList<Car> foundCars = new ArrayList<Car>();
        if (model.isEmpty() || model == null) {
            return carslist;
        }
        for (Car car : carslist) {
            if (car.getModel().trim().equalsIgnoreCase(model)) {
                foundCars.add(car);
            }
        }

        return foundCars;
    }
    // To give the user the ability to search for damegade cars

    public static ArrayList<Car> searchByDamage(ArrayList<Car> carslist, Boolean damaged) {
        ArrayList<Car> foundCars = new ArrayList<Car>();
        if (damaged == null) {
            return carslist;
        }

        for (Car car : carslist) {
            if (car.isDamaged() == damaged) {
                foundCars.add(car);
            }
        }

        return foundCars;
    }
    // To give the user the ability to see if the car is available

    public static ArrayList<Car> searchByAvailablity(ArrayList<Car> carslist, Boolean available) {
        ArrayList<Car> foundCars = new ArrayList<Car>();

        if (available == null) {
            return carslist;
        }

        for (Car car : carslist) {
            if (car.isAvailable() == available) {
                foundCars.add(car);
            }
        }

        return foundCars;
    }
    // To give the user the ability to choose a car by  price

    public static ArrayList<Car> searchByPrice(ArrayList<Car> carslist, double maxPrice, double lowestPrice) {
        ArrayList<Car> foundCars = new ArrayList<Car>();

        if (maxPrice == 0 && lowestPrice == 0) {
            return carslist;
        }

        for (Car car : carslist) {
            if (car.getCostPerDay() <= maxPrice && car.getCostPerDay() >= lowestPrice) {
                foundCars.add(car);
            }
        }

        return foundCars;
    }

}
