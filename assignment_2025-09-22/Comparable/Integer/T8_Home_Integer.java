import java.util.ArrayList;
import java.util.Collections;

class Home implements Comparable<Home> {
    String hName;
    int hCost;
    String hColour;

    Home(String hName, int hCost, String hColour) {
        this.hName = hName;
        this.hCost = hCost;
        this.hColour = hColour;
    }

    public String toString() {
        return "Home->" + "Name: " + hName + " | Cost: " + hCost + " | Colour: " + hColour + "\n";
    }

    public int compareTo(Home o) {
        return Integer.compare(o.hCost, this.hCost);
    }
}

class T8_Home_Integer {
    public static void main(String[] args) {
        ArrayList<Home> al = new ArrayList<Home>();
        al.add(new Home("Villa", 5000000, "White"));
        al.add(new Home("Apartment", 3000000, "Beige"));
        al.add(new Home("Bungalow", 8000000, "Brown"));

        System.out.println("As Entered");
        System.out.println(al);

        System.out.println("After SortBy Integer Property (Descending)");
        Collections.sort(al);
        System.out.println(al);
    }
}