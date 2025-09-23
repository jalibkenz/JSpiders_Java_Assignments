// retainAll(Collection c)

import java.util.HashSet;
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

    static void printHashSet(HashSet<Employee> xlist) {
        for (Employee x:xlist) {
            System.out.println(x);
        }

    }
}

public class HashSet12 {

    public static void main(String[] args) {
        HashSet<Employee> al = new HashSet<>();
        al.add(new Employee(1, "Jalib", 9995550077L));
        al.add(new Employee(2, "Karthik", 1234567890L));
        Employee.printHashSet(al);

        HashSet<Employee> al2 = new HashSet<>();
        al2.add(new Employee(1, "Bharath", 1234566760L));
        al2.add(new Employee(2, "Karthik", 1234567890L));
        Employee.printHashSet(al2);

        // retainAll(Collection c)
        System.out.println("//retainAll(Collection c)");
        al.retainAll(al2);
        Employee.printHashSet(al);

    }
}