import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Car {
    int carCost;
    String carModelName;
    String carType;

    Car(int carCost, String carModelName, String carType) {
        this.carCost = carCost;
        this.carModelName = carModelName;
        this.carType = carType;
    }

    public String toString() {
        return "Car->" + "Cost: " + carCost + " | Model: " + carModelName + " | Type: " + carType + "\n";
    }
}

class SortByCarCost implements Comparator<Car> {
    public int compare(Car c1, Car c2) {
        return Integer.compare(c1.carCost, c2.carCost);
    }
}

class SortByCarModel implements Comparator<Car> {
    public int compare(Car c1, Car c2) {
        return c1.carModelName.compareToIgnoreCase(c2.carModelName);
    }
}

class T2_Car {
    public static void main(String[] args) {
        ArrayList<Car> al = new ArrayList<Car>();
        al.add(new Car(25000, "Honda Civic", "Petrol"));
        al.add(new Car(45000, "Toyota Camry", "Petrol"));
        al.add(new Car(15000, "Ford Fiesta", "Diesel"));
        System.out.println("As Entered");
        System.out.println(al);
        System.out.println("After SortByCarCost()");
        Collections.sort(al, new SortByCarCost());
        System.out.println(al);
        System.out.println("After SortByCarModel()");
        Collections.sort(al, new SortByCarModel());
        System.out.println(al);
    }
}