package String;
import java.util.ArrayList;
import java.util.Collections;

class School implements Comparable<School> {
    String schoolName;
    String schoolGrade;
    int schoolStrength;

    School(String schoolName, String schoolGrade, int schoolStrength) {
        this.schoolName = schoolName;
        this.schoolGrade = schoolGrade;
        this.schoolStrength = schoolStrength;
    }

    public String toString() {
        return "School->" + "Name: " + schoolName + " | Grade: " + schoolGrade + " | Strength: " + schoolStrength + "\n";
    }

    public int compareTo(School o) {
        return this.schoolName.compareToIgnoreCase(o.schoolName);
    }
}

class T3_School_String {
    public static void main(String[] args) {
        ArrayList<School> al = new ArrayList<School>();
        al.add(new School("Greenwood High", "A+", 500));
        al.add(new School("St. Joseph's", "B", 750));
        al.add(new School("Central Academy", "A", 300));
        System.out.println("As Entered");
        System.out.println(al);
        System.out.println("After SortBy String Property (schoolName)");
        Collections.sort(al);
        System.out.println(al);
    }
}