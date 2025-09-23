// boolean add(Object o)

import java.util.TreeSet;
class Employee{
    int empId;
    String empName;
    long mobNumber;


    Employee(int empId, String empName, long mobNumber){
        this.empId=empId;
        this.empName=empName;
        this.mobNumber=mobNumber;
    }

    public String toString(){
        return  "Employee[ "+
                "Employee ID: "+empId+" | "+
                "Employee Name: "+empName+" | "+
                "Mobile Number: "+mobNumber+
        " ]";
    }
}
public class TreeSet01 {

    public static void main(String[] args) {
        TreeSet<Employee> ll = new TreeSet<>();
        // boolean add(Object o)
        ll.add(new Employee(1, "Jalib", 9995550077L));
        ll.add(new Employee(2, "Karthik", 1234567890L));
        for (Employee x:ll) {
            System.out.println(x);
        }
    }
}