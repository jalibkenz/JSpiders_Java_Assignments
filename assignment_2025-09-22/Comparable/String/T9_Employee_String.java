import java.util.ArrayList;
import java.util.Collections;

class Employee implements Comparable<Employee> {
    int empId;
    int empSalary;
    String empGrade;

    Employee(int empId, int empSalary, String empGrade) {
        this.empId = empId;
        this.empSalary = empSalary;
        this.empGrade = empGrade;
    }

    public String toString() {
        return "Employee->" + "Id: " + empId + " | Salary: " + empSalary + " | Grade: " + empGrade + "\n";
    }

    public int compareTo(Employee o) {
        return this.empGrade.compareToIgnoreCase(o.empGrade);
    }
}

class T9_Employee_String {
    public static void main(String[] args) {
        ArrayList<Employee> al = new ArrayList<Employee>();
        al.add(new Employee(101, 70000, "Manager"));
        al.add(new Employee(103, 50000, "Developer"));
        al.add(new Employee(102, 90000, "Senior Manager"));
        System.out.println("As Entered");
        System.out.println(al);
        System.out.println("After SortBy String Property (empGrade)");
        Collections.sort(al);
        System.out.println(al);
    }
}