import java.util.ArrayList;
import java.util.Collections;

class Car implements Comparable<Car> {
    int cCost;
    String cModel;
    String cType;

    Car(int cCost, String cModel, String cType) {
        this.cCost = cCost;
        this.cModel = cModel;
        this.cType = cType;
    }

    public String toString() {
        return "Car->" + "Cost: " + cCost + " | Model: " + cModel + " | Type: " + cType + "\n";
    }

    public int compareTo(Car o) {
        return Integer.compare(o.cCost, this.cCost);
    }
}

class T2_Car_Integer {
    public static void main(String[] args) {
        ArrayList<Car> al = new ArrayList<Car>();
        al.add(new Car(800000, "Honda City", "Petrol"));
        al.add(new Car(1200000, "Hyundai Creta", "Diesel"));
        al.add(new Car(2500000, "Mahindra XUV700", "Petrol"));

        System.out.println("As Entered");
        System.out.println(al);

        System.out.println("After SortBy Integer Property (Descending)");
        Collections.sort(al);
        System.out.println(al);
    }
}