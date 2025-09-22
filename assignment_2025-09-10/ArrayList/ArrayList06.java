import java.util.ArrayList;
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
    public boolean equals(Object o){
        Employee e = (Employee) o;
        return this.empId==e.empId && this.empName==e.empName && this.mobNumber==e.mobNumber;
    }
}

public class MainClass6 {

    public static void main(String[] args) {
        ArrayList<Employee> al = new ArrayList<>();
        al.add(0,new Employee(1, "Jalib", 9995550077L));
        al.add(1,new Employee(2, "Karthik", 1234567890L));
        al.add(0,new Employee(1, "Lokesh", 7816278377L));
        al.add(1,new Employee(2, "Gowtham", 9985642638L));
        //contains(Object o) 
        for (int i = 0; i < al.size(); i++) {
            Object o=al.get(i);
            Employee e=(Employee)o;
            System.out.println(e);
        }
        if(al.contains(new Employee(2, "Karthik", 1234567890L))){
            System.out.println("Yes it contains");
        }
        else{
            System.out.println("No, it doesn't contains");
        }

    }
}