import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee {
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
}

class SortByEmpSalary implements Comparator<Employee> {
    public int compare(Employee e1, Employee e2) {
        return Integer.compare(e1.empSalary, e2.empSalary);
    }
}

class SortByEmpGrade implements Comparator<Employee> {
    public int compare(Employee e1, Employee e2) {
        return e1.empGrade.compareToIgnoreCase(e2.empGrade);
    }
}

class T9_Employee {
    public static void main(String[] args) {
        ArrayList<Employee> al = new ArrayList<Employee>();
        al.add(new Employee(101, 70000, "Manager"));
        al.add(new Employee(103, 50000, "Developer"));
        al.add(new Employee(102, 90000, "Senior Manager"));
        System.out.println("As Entered");
        System.out.println(al);
        System.out.println("After SortByEmpSalary()");
        Collections.sort(al, new SortByEmpSalary());
        System.out.println(al);
        System.out.println("After SortByEmpGrade()");
        Collections.sort(al, new SortByEmpGrade());
        System.out.println(al);
    }
}