package String;
import java.util.ArrayList;
import java.util.Collections;

class Laptop implements Comparable<Laptop> {
    String laptopName;
    int laptopCost;
    String laptopBrand;

    Laptop(String laptopName, int laptopCost, String laptopBrand) {
        this.laptopName = laptopName;
        this.laptopCost = laptopCost;
        this.laptopBrand = laptopBrand;
    }

    public String toString() {
        return "Laptop->" + "Name: " + laptopName + " | Cost: " + laptopCost + " | Brand: " + laptopBrand + "\n";
    }

    public int compareTo(Laptop o) {
        return this.laptopBrand.compareToIgnoreCase(o.laptopBrand);
    }
}

class T7_Laptop_String {
    public static void main(String[] args) {
        ArrayList<Laptop> al = new ArrayList<Laptop>();
        al.add(new Laptop("XPS 13", 1500, "Dell"));
        al.add(new Laptop("MacBook Pro", 2000, "Apple"));
        al.add(new Laptop("Surface Pro", 1200, "Microsoft"));
        System.out.println("As Entered");
        System.out.println(al);
        System.out.println("After SortBy String Property (laptopBrand)");
        Collections.sort(al);
        System.out.println(al);
    }
}