import java.util.Stack;
class Employee2{
    int empId;
    String empName;
    long mobNumber;


    Employee2(int empId, String empName, long mobNumber){
        this.empId=empId;
        this.empName=empName;
        this.mobNumber=mobNumber;
    }

    public String toString(){
        return  "Employee2[ "+
                "Employee2 ID: "+empId+" | "+
                "Employee2 Name: "+empName+" | "+
                "Mobile Number: "+mobNumber+
        " ]";
    }
}

public class Stack02 {

    public static void main(String[] args) {
        Stack<Employee2> al = new Stack<>();
        al.add(0,new Employee2(1, "Jalib", 9995550077L));
        //void  add (int index, Object o)
        al.add(1,new Employee2(2, "Karthik", 1234567890L));
        al.add(1,new Employee2(11, "Kenz", 9567550077L));
        for (int i = 0; i < al.size(); i++) {
            Object o=al.get(i);
            Employee2 e=(Employee2)o;
            System.out.println(e);
        }
    }
}