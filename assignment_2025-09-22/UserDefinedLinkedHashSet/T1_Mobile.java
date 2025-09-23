import java.util.LinkedHashMap;
import java.util.Map.Entry;

class Mobile {
    double cost;
    String modelName;
    String colour;

    Mobile(double cost, String modelName, String colour) {
        this.cost = cost;
        this.modelName = modelName;
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Cost: " + cost + ", Model: " + modelName + ", Colour: " + colour;
    }
}

class T1_Mobile {
    public static void main(String[] args) {
        LinkedHashMap<Integer, Mobile> lhm = new LinkedHashMap<>();

        lhm.put(1, new Mobile(999.99, "iPhone 15", "Space Gray"));
        lhm.put(2, new Mobile(799.50, "Samsung Galaxy S23", "Phantom Black"));
        lhm.put(3, new Mobile(499.00, "Google Pixel 7a", "Charcoal"));

        for (Entry<Integer, Mobile> x : lhm.entrySet()) {
            System.out.println("Key -> " + x.getKey() + " | " + x.getValue());
        }
    }
}