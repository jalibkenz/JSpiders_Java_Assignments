package String;
import java.util.ArrayList;
import java.util.Collections;

class Bike implements Comparable<Bike> {
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

    public int compareTo(Bike o) {
        return this.bikeBrand.compareToIgnoreCase(o.bikeBrand);
    }
}

class T5_Bike_String {
    public static void main(String[] args) {
        ArrayList<Bike> al = new ArrayList<Bike>();
        al.add(new Bike(5000, "Royal Enfield", "Black"));
        al.add(new Bike(3000, "Honda", "Red"));
        al.add(new Bike(7000, "Kawasaki", "Green"));
        System.out.println("As Entered");
        System.out.println(al);
        System.out.println("After SortBy String Property (bikeBrand)");
        Collections.sort(al);
        System.out.println(al);
    }
}