import java.util.Stack;

class Employee12 {
    int empId;
    String empName;
    long mobNumber;

    Employee12(int empId, String empName, long mobNumber) {
        this.empId = empId;
        this.empName = empName;
        this.mobNumber = mobNumber;
    }

    public String toString() {
        return "Employee12[ " +
                "Employee12 ID: " + empId + " | " +
                "Employee12 Name: " + empName + " | " +
                "Mobile Number: " + mobNumber +
                " ]";
    }

    public boolean equals(Object o) {
        Employee12 e = (Employee12) o;
        return this.empId == e.empId && this.empName == e.empName && this.mobNumber == e.mobNumber;
    }

    static void printStack(Stack<Employee12> xlist) {
        for (int i = 0; i < xlist.size(); i++) {
            Object o = xlist.get(i);
            Employee12 e = (Employee12) o;
            System.out.println(e);
        }

    }
}

public class Stack12 {

    public static void main(String[] args) {
        Stack<Employee12> al = new Stack<>();
        al.add(0, new Employee12(1, "Jalib", 9995550077L));
        al.add(1, new Employee12(2, "Karthik", 1234567890L));
        Employee12.printStack(al);

        Stack<Employee12> al2 = new Stack<>();
        al2.add(0, new Employee12(1, "Bharath", 1234566760L));
        al2.add(1, new Employee12(2, "Karthik", 1234567890L));
        Employee12.printStack(al2);

        //retainAll(Collection c)
        System.out.println("//retainAll(Collection c)");
        al.retainAll(al2);
        Employee12.printStack(al);

    }
}