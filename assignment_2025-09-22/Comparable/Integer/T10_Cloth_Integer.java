import java.util.ArrayList;
import java.util.Collections;

class Cloth implements Comparable<Cloth> {
    String cColor;
    int cCost;
    String cSize;

    Cloth(String cColor, int cCost, String cSize) {
        this.cColor = cColor;
        this.cCost = cCost;
        this.cSize = cSize;
    }

    public String toString() {
        return "Cloth->" + "Color: " + cColor + " | Cost: " + cCost + " | Size: " + cSize + "\n";
    }

    public int compareTo(Cloth o) {
        return Integer.compare(o.cCost, this.cCost);
    }
}

class T10_Cloth_Integer {
    public static void main(String[] args) {
        ArrayList<Cloth> al = new ArrayList<Cloth>();
        al.add(new Cloth("Blue", 1500, "L"));
        al.add(new Cloth("Red", 800, "M"));
        al.add(new Cloth("Black", 2500, "XL"));

        System.out.println("As Entered");
        System.out.println(al);

        System.out.println("After SortBy Integer Property (Descending)");
        Collections.sort(al);
        System.out.println(al);
    }
}