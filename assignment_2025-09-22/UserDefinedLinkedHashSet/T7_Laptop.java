import java.util.LinkedHashMap;
import java.util.Map.Entry;

class Laptop {
    String name;
    double cost;
    String brand;

    Laptop(String name, double cost, String brand) {
        this.name = name;
        this.cost = cost;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Cost: " + cost + ", Brand: " + brand;
    }
}

class T7_Laptop {
    public static void main(String[] args) {
        LinkedHashMap<Integer, Laptop> lhm = new LinkedHashMap<>();

        lhm.put(1, new Laptop("MacBook Pro", 2500.00, "Apple"));
        lhm.put(2, new Laptop("Dell XPS 15", 1900.00, "Dell"));
        lhm.put(3, new Laptop("HP Spectre x360", 1700.00, "HP"));

        for (Entry<Integer, Laptop> x : lhm.entrySet()) {
            System.out.println("Key -> " + x.getKey() + " | " + x.getValue());
        }
    }
}