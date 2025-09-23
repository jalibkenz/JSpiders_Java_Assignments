import java.util.Stack;

class Employee11 {
    int empId;
    String empName;
    long mobNumber;

    Employee11(int empId, String empName, long mobNumber) {
        this.empId = empId;
        this.empName = empName;
        this.mobNumber = mobNumber;
    }

    public String toString() {
        return "Employee11[ " +
                "Employee11 ID: " + empId + " | " +
                "Employee11 Name: " + empName + " | " +
                "Mobile Number: " + mobNumber +
                " ]";
    }

    public boolean equals(Object o) {
        Employee11 e = (Employee11) o;
        return this.empId == e.empId && this.empName == e.empName && this.mobNumber == e.mobNumber;
    }

    static void printStack(Stack<Employee11> xlist) {
        for (int i = 0; i < xlist.size(); i++) {
            Object o = xlist.get(i);
            Employee11 e = (Employee11) o;
            System.out.println(e);
        }

    }
}

public class Stack11 {

    public static void main(String[] args) {
        Stack<Employee11> al = new Stack<>();
        al.add(0, new Employee11(1, "Jalib", 9995550077L));
        al.add(1, new Employee11(2, "Karthik", 1234567890L));
        Employee11.printStack(al);

        Stack<Employee11> al2 = new Stack<>();
        al2.add(0, new Employee11(1, "Bharath", 1234566760L));
        al2.add(1, new Employee11(2, "Karthik", 1234567890L));
        Employee11.printStack(al2);

        //remove(Collection c)
        System.out.println("//remove(Collection c)");
        al.removeAll(al2);
        Employee11.printStack(al);

    }
}