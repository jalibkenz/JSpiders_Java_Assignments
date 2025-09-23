import java.util.Stack;
class Employee6{
    int empId;
    String empName;
    long mobNumber;


    Employee6(int empId, String empName, long mobNumber){
        this.empId=empId;
        this.empName=empName;
        this.mobNumber=mobNumber;
    }

    public String toString(){
        return  "Employee6[ "+
                "Employee6 ID: "+empId+" | "+
                "Employee6 Name: "+empName+" | "+
                "Mobile Number: "+mobNumber+
        " ]";
    }
    public boolean equals(Object o){
        Employee6 e = (Employee6) o;
        return this.empId==e.empId && this.empName==e.empName && this.mobNumber==e.mobNumber;
    }
}

public class Stack06 {

    public static void main(String[] args) {
        Stack<Employee6> al = new Stack<>();
        al.add(0,new Employee6(1, "Jalib", 9995550077L));
        al.add(1,new Employee6(2, "Karthik", 1234567890L));
        al.add(0,new Employee6(1, "Lokesh", 7816278377L));
        al.add(1,new Employee6(2, "Gowtham", 9985642638L));
        //contains(Object o) 
        for (int i = 0; i < al.size(); i++) {
            Object o=al.get(i);
            Employee6 e=(Employee6)o;
            System.out.println(e);
        }
        if(al.contains(new Employee6(2, "Karthik", 1234567890L))){
            System.out.println("Yes it contains");
        }
        else{
            System.out.println("No, it doesn't contains");
        }

    }
}