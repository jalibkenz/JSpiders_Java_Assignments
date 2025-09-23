import java.util.Stack;
class Employee1{
    int empId;
    String empName;
    long mobNumber;


    Employee1(int empId, String empName, long mobNumber){
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
public class Stack01 {

    public static void main(String[] args) {
        Stack<Employee1> al = new Stack<>();
        // boolean add(Object o)
        al.add(new Employee1(1, "Jalib", 9995550077L));
        al.add(new Employee1(2, "Karthik", 1234567890L));
        for (int i = 0; i < al.size(); i++) {
            Object o=al.get(i);
            Employee1 e=(Employee1)o;
            System.out.println(e);
        }
    }
}