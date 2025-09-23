import java.util.Stack;
class Employee4{
    int empId;
    String empName;
    long mobNumber;


    Employee4(int empId, String empName, long mobNumber){
        this.empId=empId;
        this.empName=empName;
        this.mobNumber=mobNumber;
    }

    public String toString(){
        return  "Employee4[ "+
                "Employee4 ID: "+empId+" | "+
                "Employee4 Name: "+empName+" | "+
                "Mobile Number: "+mobNumber+
        " ]";
    }
}

public class Stack04 {

    public static void main(String[] args) {
        Stack<Employee4> al = new Stack<>();
        al.add(0,new Employee4(1, "Jalib", 9995550077L));
        al.add(1,new Employee4(2, "Karthik", 1234567890L));
        Stack<Employee4> al2 = new Stack<>();
        al2.add(0,new Employee4(1, "Lokesh", 7816278377L));
        al2.add(1,new Employee4(2, "Gowtham", 9985642638L));
        //addAll(int index, Collection c)    
        al.addAll(1,al2);
        for (int i = 0; i < al.size(); i++) {
            Object o=al.get(i);
            Employee4 e=(Employee4)o;
            System.out.println(e);
        }
    }
}