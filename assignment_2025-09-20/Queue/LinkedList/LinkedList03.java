//addAll(collection c)

import java.util.LinkedList;

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

public class LinkedList03 {

    public static void main(String[] args) {
        LinkedList<Employee> al = new LinkedList<>();
        al.add(0, new Employee(1, "Jalib", 9995550077L));
        al.add(1, new Employee(2, "Karthik", 1234567890L));
        LinkedList<Employee> al2 = new LinkedList<>();
        al2.add(0, new Employee(1, "Lokesh", 7816278377L));
        al2.add(1, new Employee(2, "Gowtham", 9985642638L));
        // addAll(collection c)
        al.addAll(al2);
        for (int i = 0; i < al.size(); i++) {
            Object o = al.get(i);
            Employee e = (Employee) o;
            System.out.println(e);
        }
    }
}