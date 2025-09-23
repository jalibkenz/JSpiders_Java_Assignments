import java.util.LinkedHashMap;
import java.util.Map.Entry;

class Home {
    String name;
    double cost;
    String colour;

    Home(String name, double cost, String colour) {
        this.name = name;
        this.cost = cost;
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Cost: " + cost + ", Colour: " + colour;
    }
}

class T8_Home {
    public static void main(String[] args) {
        LinkedHashMap<Integer, Home> lhm = new LinkedHashMap<>();

        lhm.put(1, new Home("Sunset Villa", 500000.00, "Beige"));
        lhm.put(2, new Home("Oakwood Residence", 750000.00, "Gray"));
        lhm.put(3, new Home("Pine Cottage", 300000.00, "White"));

        for (Entry<Integer, Home> x : lhm.entrySet()) {
            System.out.println("Key -> " + x.getKey() + " | " + x.getValue());
        }
    }
}