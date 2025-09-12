public class MainClass9 {

    int empId;
    double empSalary;
    String empGrade;

    MainClass9(int empId, double empSalary, String empGrade) {
        this.empId = empId;
        this.empSalary = empSalary;
        this.empGrade = empGrade;
    }

    public boolean equals(Object obj) {
        MainClass9 e = (MainClass9) obj;
        return this.empGrade.equals(e.empGrade);
    }

    public static void main(String[] args) {
        MainClass9 e1 = new MainClass9(101, 60000, "A");
        MainClass9 e2 = new MainClass9(102, 70000, "A");

        if (e1.equals(e2)) {
            System.out.println("Both employees have the same grade");
        } else {
            System.out.println("Employee grades are different");
        }
    }
}