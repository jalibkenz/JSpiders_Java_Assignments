import java.util.LinkedHashMap;
import java.util.Map.Entry;

class Cloth {
    String colour;
    double cost;
    String size; // e.g., L, XL, M

    Cloth(String colour, double cost, String size) {
        this.colour = colour;
        this.cost = cost;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Colour: " + colour + ", Cost: " + cost + ", Size: " + size;
    }
}

class T10_Cloth {
    public static void main(String[] args) {
        LinkedHashMap<Integer, Cloth> lhm = new LinkedHashMap<>();

        lhm.put(1, new Cloth("Blue", 25.50, "M"));
        lhm.put(2, new Cloth("Red", 30.00, "L"));
        lhm.put(3, new Cloth("Green", 28.75, "XL"));

        for (Entry<Integer, Cloth> x : lhm.entrySet()) {
            System.out.println("Key -> " + x.getKey() + " | " + x.getValue());
        }
    }
}