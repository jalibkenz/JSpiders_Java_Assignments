import java.util.ArrayList;
class SchoolDetails{
	String school_name;
	char school_grade;
	int school_strength;
	public String toString() {
		return "School[School Name="+school_name+",School Grade="+school_grade+",School Strength="+school_strength+"]";
	}
	public SchoolDetails(String school_name,char school_grade,int school_strength) {
		this.school_name=school_name;
		this.school_grade=school_grade;
		this.school_strength=school_strength;
	}
}
public class MainClass9{
	public static void main(String[] args) {
		ArrayList<SchoolDetails> l1=new ArrayList<SchoolDetails>();
		l1.add(new SchoolDetails("Amrita Vidyalayam",'A',100));
		l1.add(new SchoolDetails("Navodaya",'B',200));
		l1.add(new SchoolDetails("Edu Asia",'C',300));
		l1.add(new SchoolDetails("Sapthagiri",'D',400));
		l1.add(new SchoolDetails("Bapuji",'E',500));
		for (int i = 0; i < l1.size(); i++) {
			Object o1=l1.get(i);
			SchoolDetails m1=(SchoolDetails)o1;
			System.out.println(m1);
		}
	}
}