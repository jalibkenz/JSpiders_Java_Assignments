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

public class MainClass5 {

    public static void main(String[] args) {
        Vector<Employee> al = new Vector<>();
        al.add(0,new Employee(1, "Jalib", 9995550077L));
        al.add(1,new Employee(2, "Karthik", 1234567890L));

        for (int i = 0; i < al.size(); i++) {
            Object o=al.get(i);
            Employee e=(Employee)o;
            System.out.println(e);
        }
        System.out.println("Clearing about to start and print output");
        al.clear();
        System.out.println(al);
        System.out.println("Printed output after clear");

    }
}