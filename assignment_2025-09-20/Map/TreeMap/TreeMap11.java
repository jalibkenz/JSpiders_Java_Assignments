// removeAll(Collection c)

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

public class TreeSet11 {

    public static void main(String[] args) {
        TreeSet<Employee> al = new TreeSet<>();
        al.add(new Employee(1, "Jalib", 9995550077L));
        al.add(new Employee(2, "Karthik", 1234567890L));
        Employee.printTreeSet(al);

        TreeSet<Employee> al2 = new TreeSet<>();
        al2.add(new Employee(1, "Bharath", 1234566760L));
        al2.add(new Employee(2, "Karthik", 1234567890L));
        Employee.printTreeSet(al2);

        // removeAll(Collection c)
        System.out.println("//remove(Collection c)");
        al.removeAll(al2);
        Employee.printTreeSet(al);

    }
}