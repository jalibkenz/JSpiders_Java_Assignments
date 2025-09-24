// hashCode()

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

public class HashMap14 {

    public static void main(String[] args) {
        HashMap<Integer,Employee> al = new HashMap<Integer,Employee>();
        al.put(1,new Employee(100, "Jalib", 9995550077L));
        al.put(2,new Employee(101, "Karthik", 1234567890L));
        HashMap<Integer,Employee> al2 = new HashMap<Integer,Employee>();
        al2.put(1,new Employee(100, "Jalib", 9995550077L));
        al2.put(2,new Employee(101, "Karthik", 1234567890L));

        System.out.println("----------------HASH MAP for al-----------");
        for (Entry<Integer,Employee> x:al.entrySet()) {
            System.out.println(x);
        }

        System.out.println("----------------HASH MAP for al2-----------");
        for (Entry<Integer,Employee> x:al2.entrySet()) {
            System.out.println(x);
        }


        // equals(Object o)
        System.out.println("-----------------// hashCode() ------------------");
        System.out.println(al.equals(al2));
        
    }
}
