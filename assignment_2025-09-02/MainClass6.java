public class MainClass6 {

    String courseName;
    String universityName;
    int examCost;

    MainClass6(String courseName, String universityName, int examCost) {
        this.courseName = courseName;
        this.universityName = universityName;
        this.examCost = examCost;
    }

    public boolean equals(Object obj) {
        MainClass6 c = (MainClass6) obj;
        return this.courseName.equals(c.courseName);
    }

    public static void main(String[] args) {
        MainClass6 c1 = new MainClass6("Computer Science", "Delhi University", 5000);
        MainClass6 c2 = new MainClass6("Computer Science", "Mumbai University", 6000);

        if (c1.equals(c2)) {
            System.out.println("Both courses are the same");
        } else {
            System.out.println("Courses are different");
        }
    }
}