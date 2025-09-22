import java.util.ArrayList;
import java.util.Collections;

class Laptop implements Comparable<Laptop> {
    String lName;
    int lCost;
    String lBrand;

    Laptop(String lName, int lCost, String lBrand) {
        this.lName = lName;
        this.lCost = lCost;
        this.lBrand = lBrand;
    }

    public String toString() {
        return "Laptop->" + "Name: " + lName + " | Cost: " + lCost + " | Brand: " + lBrand + "\n";
    }

    public int compareTo(Laptop o) {
        return Integer.compare(o.lCost, this.lCost);
    }
}

class T7_Laptop_Integer {
    public static void main(String[] args) {
        ArrayList<Laptop> al = new ArrayList<Laptop>();
        al.add(new Laptop("Macbook Pro", 150000, "Apple"));
        al.add(new Laptop("Dell XPS", 120000, "Dell"));
        al.add(new Laptop("HP Spectre", 110000, "HP"));

        System.out.println("As Entered");
        System.out.println(al);

        System.out.println("After SortBy Integer Property (Descending)");
        Collections.sort(al);
        System.out.println(al);
    }
}