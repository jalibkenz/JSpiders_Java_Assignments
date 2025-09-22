import java.util.Stack;
class Employee3{
    int empId;
    String empName;
    long mobNumber;


    Employee3(int empId, String empName, long mobNumber){
        this.empId=empId;
        this.empName=empName;
        this.mobNumber=mobNumber;
    }

    public String toString(){
        return  "Employee3[ "+
                "Employee3 ID: "+empId+" | "+
                "Employee3 Name: "+empName+" | "+
                "Mobile Number: "+mobNumber+
        " ]";
    }
}

public class Stack03 {

    public static void main(String[] args) {
        Stack<Employee3> al = new Stack<>();
        al.add(0,new Employee3(1, "Jalib", 9995550077L));
        al.add(1,new Employee3(2, "Karthik", 1234567890L));
        Stack<Employee3> al2 = new Stack<>();
        al2.add(0,new Employee3(1, "Lokesh", 7816278377L));
        al2.add(1,new Employee3(2, "Gowtham", 9985642638L));
        //addAll(collection c)
        al.addAll(al2);
        for (int i = 0; i < al.size(); i++) {
            Object o=al.get(i);
            Employee3 e=(Employee3)o;
            System.out.println(e);
        }
    }
}