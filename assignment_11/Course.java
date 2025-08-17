class Course {
    String course_name;
    static String univ_name = "VTU";
    double exam_cost;

    public static void main(String[] args) {
        Course c = new Course();
        c.course_name = "Java FS";
        c.exam_cost = 55850;

        System.out.println("Course Name: " + c.course_name +
                           " University: " + univ_name +
                           " Cost of Exam: " + c.exam_cost);
    }
}