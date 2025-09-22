import java.util.ArrayList;
import java.util.Collections;

class School implements Comparable<School> {
    String sName;
    String sGrade;
    int sStrength;

    School(String sName, String sGrade, int sStrength) {
        this.sName = sName;
        this.sGrade = sGrade;
        this.sStrength = sStrength;
    }

    public String toString() {
        return "School->" + "Name: " + sName + " | Grade: " + sGrade + " | Strength: " + sStrength + "\n";
    }

    public int compareTo(School o) {
        return Integer.compare(o.sStrength, this.sStrength);
    }
}

class T3_School_Integer {
    public static void main(String[] args) {
        ArrayList<School> al = new ArrayList<School>();
        al.add(new School("St. Mary's", "A+", 500));
        al.add(new School("Central High", "B", 800));
        al.add(new School("Greenwood Public", "A", 650));

        System.out.println("As Entered");
        System.out.println(al);

        System.out.println("After SortBy Integer Property (Descending)");
        Collections.sort(al);
        System.out.println(al);
    }
}