// contains(Object o)

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
    public int hashCode() {
        return Objects.hash(empId, empName, mobNumber);
    }
}

public class HashSet06 {

    public static void main(String[] args) {
        HashSet<Employee> al = new HashSet<>();
        al.add(new Employee(1, "Jalib", 9995550077L));
        al.add(new Employee(2, "Karthik", 1234567890L));
        al.add(new Employee(1, "Lokesh", 7816278377L));
        al.add(new Employee(2, "Gowtham", 9985642638L));
        // contains(Object o)
        for (Employee x:al) {

            System.out.println(x);
            System.out.println("----------All Hash Codes");
            System.out.println(x.hashCode());
        }
        
        System.out.println("-----------------------Hash Code to be checked if the earlier list contains it or not");
        Employee e= new Employee(2, "Karthik", 1234567890L);
        System.out.println(e.hashCode());

        if (al.contains(e)) {

            System.out.println("Yes it contains");
        } else {
            System.out.println("No, it doesn't contains");
        }

    }
}