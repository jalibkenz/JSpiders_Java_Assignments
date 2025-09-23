import java.util.Stack;

class Employee14 {
    int empId;
    String empName;
    long mobNumber;

    Employee14(int empId, String empName, long mobNumber) {
        this.empId = empId;
        this.empName = empName;
        this.mobNumber = mobNumber;
    }

    public String toString() {
        return "Employee14[ " +
                "Employee14 ID: " + empId + " | " +
                "Employee14 Name: " + empName + " | " +
                "Mobile Number: " + mobNumber +
                " ]";
    }

    public boolean equals(Object o) {
        Employee14 e = (Employee14) o;
        return this.empId == e.empId && this.empName == e.empName && this.mobNumber == e.mobNumber;
    }

    static void printStack(Stack<Employee14> xlist) {
        for (int i = 0; i < xlist.size(); i++) {
            Object o = xlist.get(i);
            Employee14 e = (Employee14) o;
            System.out.println(e);
        }

    }
}

public class Stack14 {

    public static void main(String[] args) {
        Stack<Employee14> al = new Stack<>();
        al.add(0, new Employee14(1, "Jalib", 9995550077L));
        al.add(1, new Employee14(2, "Karthik", 1234567890L));
        Employee14.printStack(al);


        //size()
        System.out.println("//size()");
        System.out.println("The size of the Stack is: "+al.size());

    }
}