class Course {
    String course_name;
    static String univ_name = "VTU";
    double exam_cost;

    Course(String a, double b) {
        course_name = a;
        exam_cost = b;
    }

    public static void main(String[] args) {
        Course c = new Course("Java FS", 55850);

        System.out.println("Course Name: " + c.course_name +
                " University: " + univ_name +
                " Cost of Exam: " + c.exam_cost);
    }
}