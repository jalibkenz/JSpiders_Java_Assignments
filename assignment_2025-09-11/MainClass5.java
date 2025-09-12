import java.util.ArrayList;
class EmployeeDetails{
	int emp_id;
	char emp_grade;
	int emp_sal;
	public String toString() {
		return "Employee[Emp Name="+emp_id+",Emp Grade="+emp_grade+",Emp Sal="+emp_sal+"]";
	}
	public EmployeeDetails(int emp_id,char emp_grade,int emp_sal) {
		this.emp_id=emp_id;
		this.emp_grade=emp_grade;
		this.emp_sal=emp_sal;
	}
}
public class MainClass5{
	public static void main(String[] args) {
		ArrayList<EmployeeDetails> l1=new ArrayList<EmployeeDetails>();
		l1.add(new EmployeeDetails(101,'A',1000000));
		l1.add(new EmployeeDetails(102,'B',2000000));
		l1.add(new EmployeeDetails(103,'C',3000000));
		l1.add(new EmployeeDetails(104,'D',4000000));
		l1.add(new EmployeeDetails(105,'E',5000000));
		for (int i = 0; i < l1.size(); i++) {
			Object o1=l1.get(i);
			EmployeeDetails m1=(EmployeeDetails)o1;
			System.out.println(m1);
		}
	}
}