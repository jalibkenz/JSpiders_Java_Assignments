import java.util.Stack;
class Employee5{
    int empId;
    String empName;
    long mobNumber;


    Employee5(int empId, String empName, long mobNumber){
        this.empId=empId;
        this.empName=empName;
        this.mobNumber=mobNumber;
    }

    public String toString(){
        return  "Employee5[ "+
                "Employee5 ID: "+empId+" | "+
                "Employee5 Name: "+empName+" | "+
                "Mobile Number: "+mobNumber+
        " ]";
    }
}

public class Stack05 {

    public static void main(String[] args) {
        Stack<Employee5> al = new Stack<>();
        al.add(0,new Employee5(1, "Jalib", 9995550077L));
        al.add(1,new Employee5(2, "Karthik", 1234567890L));

        for (int i = 0; i < al.size(); i++) {
            Object o=al.get(i);
            Employee5 e=(Employee5)o;
            System.out.println(e);
        }
        System.out.println("Clearing about to start and print output");
        al.clear();
        System.out.println(al);
        System.out.println("Printed output after clear");

    }
}