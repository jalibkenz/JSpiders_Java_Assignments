import java.util.ArrayList;
import java.util.Collections;

class Course implements Comparable<Course> {
    String cName;
    String uName;
    int eCost;

    Course(String cName, String uName, int eCost) {
        this.cName = cName;
        this.uName = uName;
        this.eCost = eCost;
    }

    public String toString() {
        return "Course->" + "Name: " + cName + " | University: " + uName + " | Exam Cost: " + eCost + "\n";
    }

    public int compareTo(Course o) {
        return Integer.compare(o.eCost, this.eCost);
    }
}

class T6_Course_Integer {
    public static void main(String[] args) {
        ArrayList<Course> al = new ArrayList<Course>();
        al.add(new Course("Computer Science", "Stanford", 5000));
        al.add(new Course("Data Analytics", "MIT", 3000));
        al.add(new Course("Mechanical Engineering", "Caltech", 6000));

        System.out.println("As Entered");
        System.out.println(al);

        System.out.println("After SortBy Integer Property (Descending)");
        Collections.sort(al);
        System.out.println(al);
    }
}