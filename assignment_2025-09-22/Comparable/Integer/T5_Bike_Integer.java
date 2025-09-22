import java.util.ArrayList;
import java.util.Collections;

class Bike implements Comparable<Bike> {
    int bCost;
    String bBrand;
    String bColor;

    Bike(int bCost, String bBrand, String bColor) {
        this.bCost = bCost;
        this.bBrand = bBrand;
        this.bColor = bColor;
    }

    public String toString() {
        return "Bike->" + "Cost: " + bCost + " | Brand: " + bBrand + " | Color: " + bColor + "\n";
    }

    public int compareTo(Bike o) {
        return Integer.compare(o.bCost, this.bCost);
    }
}

class T5_Bike_Integer {
    public static void main(String[] args) {
        ArrayList<Bike> al = new ArrayList<Bike>();
        al.add(new Bike(150000, "Royal Enfield", "Black"));
        al.add(new Bike(80000, "Bajaj Pulsar", "Red"));
        al.add(new Bike(200000, "KTM Duke", "Orange"));

        System.out.println("As Entered");
        System.out.println(al);

        System.out.println("After SortBy Integer Property (Descending)");
        Collections.sort(al);
        System.out.println(al);
    }
}