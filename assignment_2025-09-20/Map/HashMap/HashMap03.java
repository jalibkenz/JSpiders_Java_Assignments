//get(Object key)

import java.util.Map.Entry;
import java.util.HashMap;

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

public class HashMap03 {

    public static void main(String[] args) {
        HashMap<Integer,Employee> al = new HashMap<Integer,Employee>();
        al.put(1,new Employee(100, "Jalib", 9995550077L));
        al.put(2,new Employee(101, "Karthik", 1234567890L));
        for (Entry<Integer,Employee> x:al.entrySet()) {
            System.out.println(x);
        }

        //get(Object key)
        System.out.println(al.get(1));
        
    }
}