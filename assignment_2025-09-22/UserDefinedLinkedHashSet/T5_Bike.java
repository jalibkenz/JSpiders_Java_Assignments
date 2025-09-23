import java.util.LinkedHashMap;
import java.util.Map.Entry;

class Bike {
    double cost;
    String brand;
    String colour;

    Bike(double cost, String brand, String colour) {
        this.cost = cost;
        this.brand = brand;
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Cost: " + cost + ", Brand: " + brand + ", Colour: " + colour;
    }
}

class T5_Bike {
    public static void main(String[] args) {
        LinkedHashMap<Integer, Bike> lhm = new LinkedHashMap<>();

        lhm.put(1, new Bike(250000.00, "Harley-Davidson", "Black"));
        lhm.put(2, new Bike(150000.00, "Kawasaki", "Green"));
        lhm.put(3, new Bike(120000.00, "Yamaha", "Blue"));

        for (Entry<Integer, Bike> x : lhm.entrySet()) {
            System.out.println("Key -> " + x.getKey() + " | " + x.getValue());
        }
    }
}