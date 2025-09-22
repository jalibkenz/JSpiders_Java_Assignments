import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class School {
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
}

class SortBySchoolName implements Comparator<School> {
    public int compare(School s1, School s2) {
        return s1.schoolName.compareToIgnoreCase(s2.schoolName);
    }
}

class SortBySchoolStrength implements Comparator<School> {
    public int compare(School s1, School s2) {
        return Integer.compare(s1.schoolStrength, s2.schoolStrength);
    }
}

class T3_School {
    public static void main(String[] args) {
        ArrayList<School> al = new ArrayList<School>();
        al.add(new School("Greenwood High", "A+", 500));
        al.add(new School("St. Joseph's", "B", 750));
        al.add(new School("Central Academy", "A", 300));
        System.out.println("As Entered");
        System.out.println(al);
        System.out.println("After SortBySchoolName()");
        Collections.sort(al, new SortBySchoolName());
        System.out.println(al);
        System.out.println("After SortBySchoolStrength()");
        Collections.sort(al, new SortBySchoolStrength());
        System.out.println(al);
    }
}