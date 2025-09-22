import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Course {
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
}

class SortByExamCost implements Comparator<Course> {
    public int compare(Course c1, Course c2) {
        return Integer.compare(c1.examCost, c2.examCost);
    }
}

class SortByCourseName implements Comparator<Course> {
    public int compare(Course c1, Course c2) {
        return c1.courseName.compareToIgnoreCase(c2.courseName);
    }
}

class T6_Course {
    public static void main(String[] args) {
        ArrayList<Course> al = new ArrayList<Course>();
        al.add(new Course("Data Science", "MIT", 500));
        al.add(new Course("Computer Science", "Stanford", 700));
        al.add(new Course("Mechanical Engineering", "UC Berkeley", 600));
        System.out.println("As Entered");
        System.out.println(al);
        System.out.println("After SortByExamCost()");
        Collections.sort(al, new SortByExamCost());
        System.out.println(al);
        System.out.println("After SortByCourseName()");
        Collections.sort(al, new SortByCourseName());
        System.out.println(al);
    }
}