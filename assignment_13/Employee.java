class Employee {
    String emp_id;
    static char emp_grade = 'A';
    double emp_sal;

    Employee(String emp_id, double emp_sal) {
        this.emp_id = emp_id;
        this.emp_sal = emp_sal;
    }

    public static void main(String[] args) {
        Employee e = new Employee("1", 50000);

        System.out.println("Employee Grade: " + emp_grade +
                " Employee ID: " + e.emp_id +
                " Salary: " + e.emp_sal);
    }
}