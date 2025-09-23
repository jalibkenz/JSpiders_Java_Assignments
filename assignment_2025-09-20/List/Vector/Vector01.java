import java.util.Vector;
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
public class MainClass1 {

    public static void main(String[] args) {
        Vector<Employee> al = new Vector<>();
        // boolean add(Object o)
        al.add(new Employee(1, "Jalib", 9995550077L));
        al.add(new Employee(2, "Karthik", 1234567890L));
        for (int i = 0; i < al.size(); i++) {
            Object o=al.get(i);
            Employee e=(Employee)o;
            System.out.println(e);
        }
    }
}