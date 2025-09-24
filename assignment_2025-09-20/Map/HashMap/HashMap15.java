// getOrDefault(Object key, V defaultValue)

import java.util.Map.Entry;
import java.util.HashMap;
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
        return "Employee ID: " + empId + " | " +
                "Employee Name: " + empName + " | " +
                "Mobile Number: " + mobNumber + "\n";
    }

    @Override
    public boolean equals(Object obj) {
        Employee e = (Employee) obj;
        return this.empId == e.empId && this.empName.equals(e.empName) && this.mobNumber == e.mobNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(empId, empName, mobNumber);
    }
}

public class HashMap15 {

    public static void main(String[] args) {
        HashMap<Integer,Employee> al = new HashMap<Integer,Employee>();
        al.put(1,new Employee(100, "Jalib", 9995550077L));
        al.put(2,new Employee(101, "Karthik", 1234567890L));


        System.out.println("----------------HASH MAP for al-----------");
        for (Entry<Integer,Employee> x:al.entrySet()) {
            System.out.println(x);
        }



        // equals(Object o)
        System.out.println("-----------------// getOrDefault(Object key, V defaultValue) ------------------");
        System.out.println(al.getOrDefault(1, new Employee(000, "Default", 0000000000L)));
        System.out.println(al.getOrDefault(5, new Employee(000, "Default", 0000000000L)));
        
    }
}
