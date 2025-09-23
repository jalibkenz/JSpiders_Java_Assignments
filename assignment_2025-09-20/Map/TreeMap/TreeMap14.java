// size()

import java.util.TreeSet;
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
        Employee e = (Employee) o;
        return this.empId == e.empId && this.empName.equals(e.empName) && this.mobNumber == e.mobNumber;
    }
    public int hashCode(){
        return Objects.hash(empId,empName,mobNumber);
    }

    static void printTreeSet(TreeSet<Employee> xlist) {
        for (Employee x:xlist) {
            System.out.println(x);
        }

    }
}

public class TreeSet14 {

    public static void main(String[] args) {
        TreeSet<Employee> al = new TreeSet<>();
        al.add(new Employee(1, "Jalib", 9995550077L));
        al.add(new Employee(2, "Karthik", 1234567890L));
        Employee.printTreeSet(al);

        // size()
        System.out.println("//size()");
        System.out.println("The size of the TreeSet is: " + al.size());

    }
}