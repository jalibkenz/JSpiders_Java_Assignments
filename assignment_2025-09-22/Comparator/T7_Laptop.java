import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Laptop {
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
}

class SortByLaptopCost implements Comparator<Laptop> {
    public int compare(Laptop l1, Laptop l2) {
        return Integer.compare(l1.laptopCost, l2.laptopCost);
    }
}

class SortByLaptopBrand implements Comparator<Laptop> {
    public int compare(Laptop l1, Laptop l2) {
        return l1.laptopBrand.compareToIgnoreCase(l2.laptopBrand);
    }
}

class T7_Laptop {
    public static void main(String[] args) {
        ArrayList<Laptop> al = new ArrayList<Laptop>();
        al.add(new Laptop("XPS 13", 1500, "Dell"));
        al.add(new Laptop("MacBook Pro", 2000, "Apple"));
        al.add(new Laptop("Surface Pro", 1200, "Microsoft"));
        System.out.println("As Entered");
        System.out.println(al);
        System.out.println("After SortByLaptopCost()");
        Collections.sort(al, new SortByLaptopCost());
        System.out.println(al);
        System.out.println("After SortByLaptopBrand()");
        Collections.sort(al, new SortByLaptopBrand());
        System.out.println(al);
    }
}