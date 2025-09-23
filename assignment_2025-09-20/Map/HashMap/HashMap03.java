//addAll(collection c)

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

public class HashSet03 {

    public static void main(String[] args) {
        HashSet<Employee> al = new HashSet<>();
        al.add(new Employee(1, "Jalib", 9995550077L));
        al.add(new Employee(2, "Karthik", 1234567890L));
        HashSet<Employee> al2 = new HashSet<>();
        al2.add(new Employee(1, "Lokesh", 7816278377L));
        al2.add(new Employee(2, "Gowtham", 9985642638L));
        // addAll(collection c)
        al.addAll(al2);
        for (Employee x:al) {
            System.out.println(x);
        }
    }
}