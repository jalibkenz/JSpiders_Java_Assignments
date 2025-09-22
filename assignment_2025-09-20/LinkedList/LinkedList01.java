// boolean add(Object o)

import java.util.LinkedList;
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
public class LinkedList01 {

    public static void main(String[] args) {
        LinkedList<Employee> ll = new LinkedList<>();
        // boolean add(Object o)
        ll.add(new Employee(1, "Jalib", 9995550077L));
        ll.add(new Employee(2, "Karthik", 1234567890L));
        for (int i = 0; i < ll.size(); i++) {
            Object o=ll.get(i);
            Employee e=(Employee)o;
            System.out.println(e);
        }
    }
}