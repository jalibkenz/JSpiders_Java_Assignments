package String;
import java.util.ArrayList;
import java.util.Collections;

class TV implements Comparable<TV> {
    int tvCost;
    String tvBrand;
    String tvType;

    TV(int tvCost, String tvBrand, String tvType) {
        this.tvCost = tvCost;
        this.tvBrand = tvBrand;
        this.tvType = tvType;
    }

    public String toString() {
        return "TV->" + "Cost: " + tvCost + " | Brand: " + tvBrand + " | Type: " + tvType + "\n";
    }

    public int compareTo(TV o) {
        return this.tvBrand.compareToIgnoreCase(o.tvBrand);
    }
}

class T4_TV_String {
    public static void main(String[] args) {
        ArrayList<TV> al = new ArrayList<TV>();
        al.add(new TV(1200, "Sony", "LED"));
        al.add(new TV(800, "Samsung", "OLED"));
        al.add(new TV(1500, "LG", "QLED"));
        System.out.println("As Entered");
        System.out.println(al);
        System.out.println("After SortBy String Property (tvBrand)");
        Collections.sort(al);
        System.out.println(al);
    }
}