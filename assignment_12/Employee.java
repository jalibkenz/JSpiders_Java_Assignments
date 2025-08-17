class Employee {
    String emp_id;
    static char emp_grade = 'A';
    double emp_sal;

    Employee(String a, double b) {
        emp_id = a;
        emp_sal = b;
    }

    public static void main(String[] args) {
        Employee e = new Employee("1", 50000);

        System.out.println("Employee Grade: " + emp_grade +
                " Employee ID: " + e.emp_id +
                " Salary: " + e.emp_sal);
    }
}