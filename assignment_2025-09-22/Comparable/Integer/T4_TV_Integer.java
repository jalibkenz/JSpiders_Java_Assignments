import java.util.ArrayList;
import java.util.Collections;

class TV implements Comparable<TV> {
    int tCost;
    String tBrand;
    String tType;

    TV(int tCost, String tBrand, String tType) {
        this.tCost = tCost;
        this.tBrand = tBrand;
        this.tType = tType;
    }

    public String toString() {
        return "TV->" + "Cost: " + tCost + " | Brand: " + tBrand + " | Type: " + tType + "\n";
    }

    public int compareTo(TV o) {
        return Integer.compare(o.tCost, this.tCost);
    }
}

class T4_TV_Integer {
    public static void main(String[] args) {
        ArrayList<TV> al = new ArrayList<TV>();
        al.add(new TV(45000, "Sony", "LED"));
        al.add(new TV(25000, "LG", "OLED"));
        al.add(new TV(60000, "Samsung", "QLED"));

        System.out.println("As Entered");
        System.out.println(al);

        System.out.println("After SortBy Integer Property (Descending)");
        Collections.sort(al);
        System.out.println(al);
    }
}