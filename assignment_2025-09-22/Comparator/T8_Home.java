import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Home {
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
}

class SortByHomeCost implements Comparator<Home> {
    public int compare(Home h1, Home h2) {
        return Integer.compare(h1.homeCost, h2.homeCost);
    }
}

class SortByHomeColour implements Comparator<Home> {
    public int compare(Home h1, Home h2) {
        return h1.homeColour.compareToIgnoreCase(h2.homeColour);
    }
}

class T8_Home {
    public static void main(String[] args) {
        ArrayList<Home> al = new ArrayList<Home>();
        al.add(new Home("Villa Grande", 500000, "White"));
        al.add(new Home("The Cottage", 250000, "Brown"));
        al.add(new Home("Modern Loft", 750000, "Grey"));
        System.out.println("As Entered");
        System.out.println(al);
        System.out.println("After SortByHomeCost()");
        Collections.sort(al, new SortByHomeCost());
        System.out.println(al);
        System.out.println("After SortByHomeColour()");
        Collections.sort(al, new SortByHomeColour());
        System.out.println(al);
    }
}