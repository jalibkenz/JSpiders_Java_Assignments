package String;
import java.util.ArrayList;
import java.util.Collections;

class Home implements Comparable<Home> {
    String homeName;
    int homeCost;
    String homeColour;

    Home(String homeName, int homeCost, String homeColour) {
        this.homeName = homeName;
        this.homeCost = homeCost;
        this.homeColour = homeColour;
    }

    public String toString() {
        return "Home->" + "Name: " + homeName + " | Cost: " + homeCost + " | Colour: " + homeColour + "\n";
    }

    public int compareTo(Home o) {
        return this.homeName.compareToIgnoreCase(o.homeName);
    }
}

class T8_Home_String {
    public static void main(String[] args) {
        ArrayList<Home> al = new ArrayList<Home>();
        al.add(new Home("Villa Grande", 500000, "White"));
        al.add(new Home("The Cottage", 250000, "Brown"));
        al.add(new Home("Modern Loft", 750000, "Grey"));
        System.out.println("As Entered");
        System.out.println(al);
        System.out.println("After SortBy String Property (homeName)");
        Collections.sort(al);
        System.out.println(al);
    }
}