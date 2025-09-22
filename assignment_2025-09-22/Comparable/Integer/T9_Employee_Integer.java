import java.util.ArrayList;
import java.util.Collections;

class Employee implements Comparable<Employee> {
    int eId;
    int eSalary;
    String eGrade;

    Employee(int eId, int eSalary, String eGrade) {
        this.eId = eId;
        this.eSalary = eSalary;
        this.eGrade = eGrade;
    }

    public String toString() {
        return "Employee->" + "ID: " + eId + " | Salary: " + eSalary + " | Grade: " + eGrade + "\n";
    }

    public int compareTo(Employee o) {
        return Integer.compare(o.eSalary, this.eSalary);
    }
}

class T9_Employee_Integer {
    public static void main(String[] args) {
        ArrayList<Employee> al = new ArrayList<Employee>();
        al.add(new Employee(101, 80000, "Senior"));
        al.add(new Employee(102, 50000, "Junior"));
        al.add(new Employee(103, 100000, "Manager"));

        System.out.println("As Entered");
        System.out.println(al);

        System.out.println("After SortBy Integer Property (Descending)");
        Collections.sort(al);
        System.out.println(al);
    }
}