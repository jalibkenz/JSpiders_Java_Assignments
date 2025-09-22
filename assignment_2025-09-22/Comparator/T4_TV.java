import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class TV {
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
}

class SortByTVCost implements Comparator<TV> {
    public int compare(TV t1, TV t2) {
        return Integer.compare(t1.tvCost, t2.tvCost);
    }
}

class SortByTVBrand implements Comparator<TV> {
    public int compare(TV t1, TV t2) {
        return t1.tvBrand.compareToIgnoreCase(t2.tvBrand);
    }
}

class T4_TV {
    public static void main(String[] args) {
        ArrayList<TV> al = new ArrayList<TV>();
        al.add(new TV(1200, "Sony", "LED"));
        al.add(new TV(800, "Samsung", "OLED"));
        al.add(new TV(1500, "LG", "QLED"));
        System.out.println("As Entered");
        System.out.println(al);
        System.out.println("After SortByTVCost()");
        Collections.sort(al, new SortByTVCost());
        System.out.println(al);
        System.out.println("After SortByTVBrand()");
        Collections.sort(al, new SortByTVBrand());
        System.out.println(al);
    }
}