import java.util.ArrayList;
class HomeDetails{
	int home_cost;
	String home_name;
	String home_color;
	public String toString() {
		return "Home[Home Cost="+home_cost+",Home Name="+home_name+",Home Color="+home_color+"]";
	}
	public HomeDetails(int home_cost,String home_name,String home_color) {
		this.home_cost=home_cost;
		this.home_name=home_name;
		this.home_color=home_color;
	}
}
public class MainClass6{
	public static void main(String[] args) {
		ArrayList<HomeDetails> l1=new ArrayList<HomeDetails>();
		l1.add(new HomeDetails(30000000,"Sri Sai","Pink"));
		l1.add(new HomeDetails(20000000,"Sri","White"));
		l1.add(new HomeDetails(10000000,"Sai","Grey"));
		l1.add(new HomeDetails(35000000,"Om","Violet"));
		l1.add(new HomeDetails(45000000,"Namah","Green"));
		for (int i = 0; i < l1.size(); i++) {
			Object o1=l1.get(i);
			HomeDetails m1=(HomeDetails)o1;
			System.out.println(m1);
		}
	}
}
