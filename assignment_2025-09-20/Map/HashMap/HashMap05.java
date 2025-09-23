// clear()

import java.util.HashSet;

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
}

public class HashSet05 {

    public static void main(String[] args) {
        HashSet<Employee> al = new HashSet<>();
        al.add(new Employee(1, "Jalib", 9995550077L));
        al.add(new Employee(2, "Karthik", 1234567890L));

        for (Employee x:al) {
            System.out.println(x);
        }
        System.out.println("Clearing about to start and print output");
        // clear()
        al.clear();
        System.out.println(al);
        System.out.println("Printed output after clear");

    }
}