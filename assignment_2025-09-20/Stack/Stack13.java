import java.util.Stack;

class Employee13 {
    int empId;
    String empName;
    long mobNumber;

    Employee13(int empId, String empName, long mobNumber) {
        this.empId = empId;
        this.empName = empName;
        this.mobNumber = mobNumber;
    }

    public String toString() {
        return "Employee13[ " +
                "Employee13 ID: " + empId + " | " +
                "Employee13 Name: " + empName + " | " +
                "Mobile Number: " + mobNumber +
                " ]";
    }

    public boolean equals(Object o) {
        Employee13 e = (Employee13) o;
        return this.empId == e.empId && this.empName == e.empName && this.mobNumber == e.mobNumber;
    }

    static void printStack(Stack<Employee13> xlist) {
        for (int i = 0; i < xlist.size(); i++) {
            Object o = xlist.get(i);
            Employee13 e = (Employee13) o;
            System.out.println(e);
        }

    }
}

public class Stack13 {

    public static void main(String[] args) {
        Stack<Employee13> al = new Stack<>();
        al.add(0, new Employee13(1, "Jalib", 9995550077L));
        al.add(1, new Employee13(2, "Karthik", 1234567890L));
        Employee13.printStack(al);


        //set(int index, Object o)
        System.out.println("//set(int index, Object o)");
        al.set(0,new Employee13(777, "Jalib Kenz", 7778880011L));
        Employee13.printStack(al);

    }
}