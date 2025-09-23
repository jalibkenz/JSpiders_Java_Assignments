import java.util.LinkedHashMap;
import java.util.Map.Entry;

class Course {
    String name;
    String universityName;
    double examCost;

    Course(String name, String universityName, double examCost) {
        this.name = name;
        this.universityName = universityName;
        this.examCost = examCost;
    }

    @Override
    public String toString() {
        return "Course Name: " + name + ", University: " + universityName + ", Exam Cost: " + examCost;
    }
}

class T6_Course {
    public static void main(String[] args) {
        LinkedHashMap<Integer, Course> lhm = new LinkedHashMap<>();

        lhm.put(1, new Course("Computer Science", "Stanford University", 250.00));
        lhm.put(2, new Course("Data Analytics", "MIT", 300.00));
        lhm.put(3, new Course("Mechanical Engineering", "University of Cambridge", 200.00));

        for (Entry<Integer, Course> x : lhm.entrySet()) {
            System.out.println("Key -> " + x.getKey() + " | " + x.getValue());
        }
    }
}