//keySet()


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

public class HashMap10 {

    public static void main(String[] args) {
        HashMap<Integer,Employee> al = new HashMap<Integer,Employee>();
        al.put(1,new Employee(100, "Jalib", 9995550077L));
        al.put(2,new Employee(101, "Karthik", 1234567890L));
        Employee e = new Employee(007, "Zine", 9895001234L);
        al.put(3,e);
        System.out.println("----------------HASH MAP-----------");
        for (Entry<Integer,Employee> x:al.entrySet()) {
            System.out.println(x);
        }

        //keySet()
        System.out.println("-----------------------------------");
        System.out.println(al.keySet());
        
    }
}