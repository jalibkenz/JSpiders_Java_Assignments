import java.util.LinkedHashMap;
import java.util.Map.Entry;

class TV {
    double cost;
    String brand;
    String type;

    TV(double cost, String brand, String type) {
        this.cost = cost;
        this.brand = brand;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Cost: " + cost + ", Brand: " + brand + ", Type: " + type;
    }
}

class T4_TV {
    public static void main(String[] args) {
        LinkedHashMap<Integer, TV> lhm = new LinkedHashMap<>();

        lhm.put(1, new TV(1200.00, "Samsung", "OLED"));
        lhm.put(2, new TV(850.00, "LG", "QLED"));
        lhm.put(3, new TV(600.00, "Sony", "LED"));

        for (Entry<Integer, TV> x : lhm.entrySet()) {
            System.out.println("Key -> " + x.getKey() + " | " + x.getValue());
        }
    }
}