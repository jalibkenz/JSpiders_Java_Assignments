import java.util.Stack;

class Employee9 {
    int empId;
    String empName;
    long mobNumber;

    Employee9(int empId, String empName, long mobNumber) {
        this.empId = empId;
        this.empName = empName;
        this.mobNumber = mobNumber;
    }

    public String toString() {
        return "Employee9[ " +
                "Employee9 ID: " + empId + " | " +
                "Employee9 Name: " + empName + " | " +
                "Mobile Number: " + mobNumber +
                " ]";
    }

    public boolean equals(Object o) {
        Employee9 e = (Employee9) o;
        return this.empId == e.empId && this.empName == e.empName && this.mobNumber == e.mobNumber;
    }

    static void printStack(Stack<Employee9> xlist) {
        for (int i = 0; i < xlist.size(); i++) {
            Object o = xlist.get(i);
            Employee9 e = (Employee9) o;
            System.out.println(e);
        }

    }
}

public class Stack09 {

    public static void main(String[] args) {
        Stack<Employee9> al = new Stack<>();
        al.add(0, new Employee9(1, "Jalib", 9995550077L));
        al.add(1, new Employee9(2, "Karthik", 1234567890L));
        Employee9.printStack(al);

        // remove(int index)
        System.out.println("//remove(int index)");
        al.remove(0);
        Employee9.printStack(al);

    }
}