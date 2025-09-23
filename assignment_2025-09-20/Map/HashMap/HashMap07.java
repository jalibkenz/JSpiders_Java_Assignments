// equals (Object o)

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
        for (Employee e:xlist) {
            System.out.println(e);
        }

    }
}

public class HashSet07 {

    public static void main(String[] args) {
        HashSet<Employee> al = new HashSet<Employee>();
        al.add(new Employee(1, "Jalib", 9995550077L));
        al.add(new Employee(2, "Karthik", 1234567890L));
        Employee.printHashSet(al);
        HashSet<Employee> al2 = new HashSet<Employee>();
        al2.add(new Employee(1, "Jalib", 9995550077L));
        al2.add(new Employee(2, "Karthik", 1234567890L));
        Employee.printHashSet(al2);

        // equals (Object o)

        if (al.equals(al2)) {
            System.out.println("Yes they are both same");
        } else {
            System.out.println("No, they are not same");
        }

    }
}