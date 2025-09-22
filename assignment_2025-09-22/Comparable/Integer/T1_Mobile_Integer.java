import java.util.ArrayList;
import java.util.Collections;

class Mobile implements Comparable<Mobile> {

    int mCost;
    String mModel;
    String mColor;

    Mobile(int mCost, String mModel, String mColor) {
        this.mCost = mCost;
        this.mModel = mModel;
        this.mColor = mColor;
    }

    public String toString() {
        return "Mobile->" + "Cost: " + mCost + " | Model: " + mModel + " | Colour: " + mColor + "\n";
    }

    public int compareTo(Mobile o) {
        if (this.mCost > o.mCost) {
            return -1; // Changes here to reverse the order
        } else if (this.mCost < o.mCost) {
            return 1; // Changes here to reverse the order
        } else {
            return 0;
        }
    }
}

class T1_Mobile_Integer{
    public static void main(String[] args) {
        ArrayList<Mobile> al = new ArrayList<Mobile>();
        al.add(new Mobile(50000, "Sony", "Black"));
        al.add(new Mobile(10000, "Samsung", "Black"));
        al.add(new Mobile(30000, "Apple", "Silver"));

        System.out.println("As Entered");
        System.out.println(al);

        System.out.println("After SortBy Integer Property (Descending)");
        Collections.sort(al);
        System.out.println(al);
    }
}