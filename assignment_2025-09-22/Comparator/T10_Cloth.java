import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Cloth {
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
}

class SortByClothCost implements Comparator<Cloth> {
    public int compare(Cloth c1, Cloth c2) {
        return Integer.compare(c1.clothCost, c2.clothCost);
    }
}

class SortByClothSize implements Comparator<Cloth> {
    public int compare(Cloth c1, Cloth c2) {
        return c1.clothSize.compareToIgnoreCase(c2.clothSize);
    }
}

class T10_Cloth {
    public static void main(String[] args) {
        ArrayList<Cloth> al = new ArrayList<Cloth>();
        al.add(new Cloth("Blue", 50, "M"));
        al.add(new Cloth("Red", 75, "L"));
        al.add(new Cloth("Black", 60, "XL"));
        System.out.println("As Entered");
        System.out.println(al);
        System.out.println("After SortByClothCost()");
        Collections.sort(al, new SortByClothCost());
        System.out.println(al);
        System.out.println("After SortByClothSize()");
        Collections.sort(al, new SortByClothSize());
        System.out.println(al);
    }
}