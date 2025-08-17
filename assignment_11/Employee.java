class Employee {
    String emp_id;
    static char emp_grade = 'A';
    double emp_sal;

    public static void main(String[] args) {
        Employee e = new Employee();
        e.emp_id = "1";
        e.emp_sal = 50000;

        System.out.println("Employee Grade: " + emp_grade +
                           " Employee ID: " + e.emp_id +
                           " Salary: " + e.emp_sal);
    }
}