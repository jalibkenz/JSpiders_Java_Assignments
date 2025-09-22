import java.util.Stack;
class Employee7{
    int empId;
    String empName;
    long mobNumber;


    Employee7(int empId, String empName, long mobNumber){
        this.empId=empId;
        this.empName=empName;
        this.mobNumber=mobNumber;
    }

    public String toString(){
        return  "Employee7[ "+
                "Employee7 ID: "+empId+" | "+
                "Employee7 Name: "+empName+" | "+
                "Mobile Number: "+mobNumber+
        " ]";
    }
    public boolean equals(Object o){
        Employee7 e = (Employee7) o;
        return this.empId==e.empId && this.empName==e.empName && this.mobNumber==e.mobNumber;
    }
    static void printStack(Stack<Employee7> xlist){
        for (int i = 0; i < xlist.size(); i++) {
            Object o=xlist.get(i);
            Employee7 e=(Employee7)o;
            System.out.println(e);
        }

    }
}

public class Stack07 {

    public static void main(String[] args) {
        Stack<Employee7> al = new Stack<>();
        al.add(0,new Employee7(1, "Jalib", 9995550077L));
        al.add(1,new Employee7(2, "Karthik", 1234567890L));
        Employee7.printStack(al);
        Stack<Employee7> al2 = new Stack<>();
        al2.add(0,new Employee7(1, "Jalib", 9995550077L));
        al2.add(1,new Employee7(2, "Karthik", 1234567890L));
        Employee7.printStack(al2);
        
        
        //equals (Object o)
        
        if(al.equals(al2)){
            System.out.println("Yes they are both same");
        }
        else{
            System.out.println("No, they are not same");
        }

    }
}