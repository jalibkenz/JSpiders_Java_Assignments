public class Employee {
    int empId;
    double empSal;
    String empGrade;

    Employee(int empId, double empSal, String empGrade) {
        this.empId = empId;
        this.empSal = empSal;
        this.empGrade = empGrade;
    }

    @Override
    public String toString() {
        return "Employee [id=" + empId + ", salary=" + empSal + ", grade=" + empGrade + "]";
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(101, 55000, "A");
        Employee e2 = new Employee(102, 45000, "B");

        System.out.println(e1);
        System.out.println(e2);
    }
}