package String;
import java.util.ArrayList;
import java.util.Collections;

class Cloth implements Comparable<Cloth> {
    String clothColour;
    int clothCost;
    String clothSize;

    Cloth(String clothColour, int clothCost, String clothSize) {
        this.clothColour = clothColour;
        this.clothCost = clothCost;
        this.clothSize = clothSize;
    }

    public String toString() {
        return "Cloth->" + "Colour: " + clothColour + " | Cost: " + clothCost + " | Size: " + clothSize + "\n";
    }

    public int compareTo(Cloth o) {
        return this.clothColour.compareToIgnoreCase(o.clothColour);
    }
}

class T10_Cloth_String {
    public static void main(String[] args) {
        ArrayList<Cloth> al = new ArrayList<Cloth>();
        al.add(new Cloth("Blue", 50, "M"));
        al.add(new Cloth("Red", 75, "L"));
        al.add(new Cloth("Black", 60, "XL"));
        System.out.println("As Entered");
        System.out.println(al);
        System.out.println("After SortBy String Property (clothColour)");
        Collections.sort(al);
        System.out.println(al);
    }
}