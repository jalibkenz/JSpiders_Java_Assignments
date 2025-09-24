// put(K key, V value)

import java.util.Map.Entry;
import java.util.LinkedHashMap;

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

public class LinkedHashMap01 {

    public static void main(String[] args) {
        LinkedHashMap<Integer, Employee> ll = new LinkedHashMap<Integer, Employee>();
        ll.put(1, new Employee(1, "Jalib", 9995550077L));
        ll.put(2, new Employee(2, "Karthik", 1234567890L));
        for (Entry<Integer, Employee> x : ll.entrySet()) {
            System.out.println(x);
        }
    }
}