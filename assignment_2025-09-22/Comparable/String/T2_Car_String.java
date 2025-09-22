package String;
import java.util.ArrayList;
import java.util.Collections;

class Car implements Comparable<Car> {
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

    public int compareTo(Car o) {
        return this.carModelName.compareToIgnoreCase(o.carModelName);
    }
}

class T2_Car_String {
    public static void main(String[] args) {
        ArrayList<Car> al = new ArrayList<Car>();
        al.add(new Car(25000, "Honda Civic", "Petrol"));
        al.add(new Car(45000, "Toyota Camry", "Petrol"));
        al.add(new Car(15000, "Ford Fiesta", "Diesel"));
        System.out.println("As Entered");
        System.out.println(al);
        System.out.println("After SortBy String Property (carModelName)");
        Collections.sort(al);
        System.out.println(al);
    }
}