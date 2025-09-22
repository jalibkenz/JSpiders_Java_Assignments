import java.util.Stack;
class Employee8{
    int empId;
    String empName;
    long mobNumber;


    Employee8(int empId, String empName, long mobNumber){
        this.empId=empId;
        this.empName=empName;
        this.mobNumber=mobNumber;
    }

    public String toString(){
        return  "Employee8[ "+
                "Employee8 ID: "+empId+" | "+
                "Employee8 Name: "+empName+" | "+
                "Mobile Number: "+mobNumber+
        " ]";
    }
    public boolean equals(Object o){
        Employee8 e = (Employee8) o;
        return this.empId==e.empId && this.empName.equals(empName) && this.mobNumber==e.mobNumber;
    }
    static void printStack(Stack<Employee8> xlist){
        for (int i = 0; i < xlist.size(); i++) {
            Object o=xlist.get(i);
            Employee8 e=(Employee8)o;
            System.out.println(e);
        }

    }
}

public class Stack08 {

    public static void main(String[] args) {
        Stack<Employee8> al = new Stack<>();
        al.add(0,new Employee8(1, "Jalib", 9995550077L));
        al.add(1,new Employee8(2, "Karthik", 1234567890L));
        Employee8.printStack(al);
        Stack<Employee8> al2 = new Stack<>();
        al2.add(0,new Employee8(1, "Jalib", 9995550077L));
        al2.add(1,new Employee8(2, "Karthik", 1234567890L));
        Employee8.printStack(al2);
        
        
        //get(int index)
        System.out.println("//get(int index)");
        System.out.println(al.get(0));
        


    }
}