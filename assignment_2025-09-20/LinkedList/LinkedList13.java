// set(int index, Object o)

import java.util.LinkedList;

class Employee {
    int empId;
    String empName;
    long mobNumber;

    Employee(int empId, String empName, long mobNumber) {
        this.empId = empId;
        this.empName = empName;
        this.mobNumber = mobNumber;
    }

    public String toString() {
        return "Employee[ " +
                "Employee ID: " + empId + " | " +
                "Employee Name: " + empName + " | " +
                "Mobile Number: " + mobNumber +
                " ]";
    }

    public boolean equals(Object o) {
        Employee e = (Employee) o;
        return this.empId == e.empId && this.empName == e.empName && this.mobNumber == e.mobNumber;
    }

    static void printLinkedList(LinkedList<Employee> xlist) {
        for (int i = 0; i < xlist.size(); i++) {
            Object o = xlist.get(i);
            Employee e = (Employee) o;
            System.out.println(e);
        }

    }
}

public class LinkedList13 {

    public static void main(String[] args) {
        LinkedList<Employee> al = new LinkedList<>();
        al.add(0, new Employee(1, "Jalib", 9995550077L));
        al.add(1, new Employee(2, "Karthik", 1234567890L));
        Employee.printLinkedList(al);

        // set(int index, Object o)
        System.out.println("//set(int index, Object o)");
        al.set(0, new Employee(777, "Jalib Kenz", 7778880011L));
        Employee.printLinkedList(al);

    }
}