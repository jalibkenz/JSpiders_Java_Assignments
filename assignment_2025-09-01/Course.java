public class Course {
    String courseName;
    String univName;
    int examCost;

    Course(String courseName, String univName, int examCost) {
        this.courseName = courseName;
        this.univName = univName;
        this.examCost = examCost;
    }

    @Override
    public String toString() {
        return "Course [name=" + courseName + ", university=" + univName + ", examCost=" + examCost + "]";
    }

    public static void main(String[] args) {
        Course c1 = new Course("B.Tech", "IIT", 5000);
        Course c2 = new Course("MBA", "IIM", 7000);

        System.out.println(c1);
        System.out.println(c2);
    }
}