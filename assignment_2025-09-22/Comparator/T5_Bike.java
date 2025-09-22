import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Bike {
    int bikeCost;
    String bikeBrand;
    String bikeColour;

    Bike(int bikeCost, String bikeBrand, String bikeColour) {
        this.bikeCost = bikeCost;
        this.bikeBrand = bikeBrand;
        this.bikeColour = bikeColour;
    }

    public String toString() {
        return "Bike->" + "Cost: " + bikeCost + " | Brand: " + bikeBrand + " | Colour: " + bikeColour + "\n";
    }
}

class SortByBikeCost implements Comparator<Bike> {
    public int compare(Bike b1, Bike b2) {
        return Integer.compare(b1.bikeCost, b2.bikeCost);
    }
}

class SortByBikeBrand implements Comparator<Bike> {
    public int compare(Bike b1, Bike b2) {
        return b1.bikeBrand.compareToIgnoreCase(b2.bikeBrand);
    }
}

class T5_Bike {
    public static void main(String[] args) {
        ArrayList<Bike> al = new ArrayList<Bike>();
        al.add(new Bike(5000, "Royal Enfield", "Black"));
        al.add(new Bike(3000, "Honda", "Red"));
        al.add(new Bike(7000, "Kawasaki", "Green"));
        System.out.println("As Entered");
        System.out.println(al);
        System.out.println("After SortByBikeCost()");
        Collections.sort(al, new SortByBikeCost());
        System.out.println(al);
        System.out.println("After SortByBikeBrand()");
        Collections.sort(al, new SortByBikeBrand());
        System.out.println(al);
    }
}