import java.util.Stack;

class Employee15 {
    int empId;
    String empName;
    long mobNumber;

    Employee15(int empId, String empName, long mobNumber) {
        this.empId = empId;
        this.empName = empName;
        this.mobNumber = mobNumber;
    }

    public String toString() {
        return "Employee15[ " +
                "Employee15 ID: " + empId + " | " +
                "Employee15 Name: " + empName + " | " +
                "Mobile Number: " + mobNumber +
                " ]";
    }

    public boolean equals(Object o) {
        Employee15 e = (Employee15) o;
        return this.empId == e.empId && this.empName == e.empName && this.mobNumber == e.mobNumber;
    }

    static void printStack(Stack<Employee15> xlist) {
        for (int i = 0; i < xlist.size(); i++) {
            Object o = xlist.get(i);
            Employee15 e = (Employee15) o;
            System.out.println(e);
        }

    }
}

public class Stack15 {

    public static void main(String[] args) {
        Stack<Employee15> al = new Stack<>();
        al.add(0, new Employee15(1, "Jalib", 9995550077L));
        al.add(1, new Employee15(2, "Karthik", 1234567890L));
        Employee15.printStack(al);


        //toArray()
        System.out.println("//toArray()");
        Object[] oarr=al.toArray();

        for (int i = 0; i < oarr.length; i++) {
            System.out.println("----------");
            System.out.println(oarr[i]);  // calls toString()
            
        }

    }
}