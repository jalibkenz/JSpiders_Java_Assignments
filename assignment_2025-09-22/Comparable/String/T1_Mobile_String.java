package String;
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
        return this.mModel.compareToIgnoreCase(o.mModel);
    }

}

class T1_Mobile_String {

    public static void main(String[] args) {

        ArrayList<Mobile> al = new ArrayList<Mobile>();

        al.add(new Mobile(50000, "Sony", "Black"));
        al.add(new Mobile(10000, "Samsung", "Black"));
        al.add(new Mobile(30000, "Apple", "Silver"));

        System.out.println("As Entered");
        System.out.println(al);

        System.out.println("After SortBy String Property");
        Collections.sort(al);
        System.out.println(al);

    }

}