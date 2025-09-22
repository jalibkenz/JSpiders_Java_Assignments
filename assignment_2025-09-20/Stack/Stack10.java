import java.util.Stack;

class Employee10 {
    int empId;
    String empName;
    long mobNumber;

    Employee10(int empId, String empName, long mobNumber) {
        this.empId = empId;
        this.empName = empName;
        this.mobNumber = mobNumber;
    }

    public String toString() {
        return "Employee10[ " +
                "Employee10 ID: " + empId + " | " +
                "Employee10 Name: " + empName + " | " +
                "Mobile Number: " + mobNumber +
                " ]";
    }

    public boolean equals(Object o) {
        Employee10 e = (Employee10) o;
        return this.empId == e.empId && this.empName == e.empName && this.mobNumber == e.mobNumber;
    }

    static void printStack(Stack<Employee10> xlist) {
        for (int i = 0; i < xlist.size(); i++) {
            Object o = xlist.get(i);
            Employee10 e = (Employee10) o;
            System.out.println(e);
        }

    }
}

public class Stack10 {

    public static void main(String[] args) {
        Stack<Employee10> al = new Stack<>();
        al.add(0, new Employee10(1, "Jalib", 9995550077L));
        al.add(1, new Employee10(2, "Karthik", 1234567890L));
        Employee10.printStack(al);

        //remove(Object 0)
        System.out.println("//remove(Object 0)");
        al.remove(al.get(1));
        // al.removeIf(p -> p.empName.equals("Karthik"));
        Employee10.printStack(al);

    }
}