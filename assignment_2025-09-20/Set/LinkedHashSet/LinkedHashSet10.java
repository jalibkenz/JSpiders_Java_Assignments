// remove(Object 0)

import java.util.LinkedHashSet;
import java.util.Objects;

class Employee {
    int empId;
    String empName;
    long mobNumber;

    Employee(int empId, String empName, long mobNumber) {
        this.empId = empId;
        this.empName = empName;
        this.mobNumber = mobNumber;
    }

    public String toString() {
        return "Employee[ " +
                "Employee ID: " + empId + " | " +
                "Employee Name: " + empName + " | " +
                "Mobile Number: " + mobNumber +
                " ]";
    }

    public boolean equals(Object o) {
        Employee e=(Employee)o;
        return this.empId == e.empId && this.empName.equals(e.empName) && this.mobNumber == e.mobNumber;
    }

    public int hashCode(){
        return Objects.hash(empId,empName,mobNumber);
    }

    static void printLinkedHashSet(LinkedHashSet<Employee> xlist) {
        for (Employee x:xlist) {
            System.out.println(x);
        }

    }
}

public class LinkedHashSet10 {

    public static void main(String[] args) {
        LinkedHashSet<Employee> al = new LinkedHashSet<>();
        al.add(new Employee(1, "Jalib", 9995550077L));
        al.add(new Employee(2, "Karthik", 1234567890L));
        Employee.printLinkedHashSet(al);

        // remove(Object 0)
        System.out.println("//remove(Object 0)");
        Employee e=new Employee(2, "Karthik", 1234567890L);
        al.remove(e);
        System.out.println("//After removed");
        Employee.printLinkedHashSet(al);

    }
}