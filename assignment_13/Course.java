class Course {
    String course_name;
    static String univ_name = "VTU";
    double exam_cost;

    Course(String course_name, double exam_cost) {
        this.course_name = course_name;
        this.exam_cost = exam_cost;
    }

    public static void main(String[] args) {
        Course c = new Course("Java FS", 55850);

        System.out.println("Course Name: " + c.course_name +
                " University: " + univ_name +
                " Cost of Exam: " + c.exam_cost);
    }
}