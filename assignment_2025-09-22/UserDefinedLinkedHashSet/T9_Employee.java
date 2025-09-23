import java.util.LinkedHashMap;
import java.util.Map.Entry;

class Employee {
    int id;
    double salary;
    String grade;

    Employee(int id, double salary, String grade) {
        this.id = id;
        this.salary = salary;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Salary: " + salary + ", Grade: " + grade;
    }
}

class T9_Employee {
    public static void main(String[] args) {
        LinkedHashMap<Integer, Employee> lhm = new LinkedHashMap<>();

        lhm.put(1, new Employee(101, 75000.00, "A"));
        lhm.put(2, new Employee(102, 60000.00, "B"));
        lhm.put(3, new Employee(103, 90000.00, "A+"));

        for (Entry<Integer, Employee> x : lhm.entrySet()) {
            System.out.println("Key -> " + x.getKey() + " | " + x.getValue());
        }
    }
}