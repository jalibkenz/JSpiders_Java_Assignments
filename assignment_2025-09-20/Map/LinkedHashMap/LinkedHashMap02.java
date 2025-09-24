
//putAll(Map<? extends K,? extends V> m)
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
        return "Employee ID: " + empId + " | " +
                "Employee Name: " + empName + " | " +
                "Mobile Number: " + mobNumber;
    }
}

public class LinkedHashMap02 {

    public static void main(String[] args) {
        LinkedHashMap<Integer, Employee> ll = new LinkedHashMap<Integer, Employee>();
        ll.put(1, new Employee(1, "Jalib", 9995550077L));
        ll.put(2, new Employee(2, "Manjunath", 1234567890L));

        for (Entry<Integer, Employee> x : ll.entrySet()) {
            System.out.println(x);
        }

        LinkedHashMap<Integer, Employee> ll2 = new LinkedHashMap<Integer, Employee>();
        ll2.put(3, new Employee(3, "Lokesh", 9995550077L));
        ll2.put(4, new Employee(4, "Gowtham", 1234567890L));

        for (Entry<Integer, Employee> x : ll2.entrySet()) {
            System.out.println(x);
        }

        ll.putAll(ll2);
        System.out.println("After adding all elements of ll2 to ll1");
        for (Entry<Integer, Employee> x : ll.entrySet()) {
            System.out.println(x);  
        }
    }
}