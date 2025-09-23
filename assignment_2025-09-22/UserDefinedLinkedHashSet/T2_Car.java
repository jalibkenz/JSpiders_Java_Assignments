import java.util.LinkedHashMap;
import java.util.Map.Entry;

class Car {
    double cost;
    String modelName;
    String type; // e.g., petrol/diesel

    Car(double cost, String modelName, String type) {
        this.cost = cost;
        this.modelName = modelName;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Cost: " + cost + ", Model: " + modelName + ", Type: " + type;
    }
}

class T2_Car {
    public static void main(String[] args) {
        LinkedHashMap<Integer, Car> lhm = new LinkedHashMap<>();

        lhm.put(1, new Car(35000.00, "Toyota Camry", "Petrol"));
        lhm.put(2, new Car(45000.00, "Ford Mustang", "Petrol"));
        lhm.put(3, new Car(55000.00, "Tesla Model 3", "Electric"));

        for (Entry<Integer, Car> x : lhm.entrySet()) {
            System.out.println("Key -> " + x.getKey() + " | " + x.getValue());
        }
    }
}