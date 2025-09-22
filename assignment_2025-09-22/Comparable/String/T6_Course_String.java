package String;
import java.util.ArrayList;
import java.util.Collections;

class Course implements Comparable<Course> {
    String courseName;
    String universityName;
    int examCost;

    Course(String courseName, String universityName, int examCost) {
        this.courseName = courseName;
        this.universityName = universityName;
        this.examCost = examCost;
    }

    public String toString() {
        return "Course->" + "Name: " + courseName + " | University: " + universityName + " | Exam Cost: " + examCost + "\n";
    }

    public int compareTo(Course o) {
        return this.courseName.compareToIgnoreCase(o.courseName);
    }
}

class T6_Course_String {
    public static void main(String[] args) {
        ArrayList<Course> al = new ArrayList<Course>();
        al.add(new Course("Data Science", "MIT", 500));
        al.add(new Course("Computer Science", "Stanford", 700));
        al.add(new Course("Mechanical Engineering", "UC Berkeley", 600));
        System.out.println("As Entered");
        System.out.println(al);
        System.out.println("After SortBy String Property (courseName)");
        Collections.sort(al);
        System.out.println(al);
    }
}