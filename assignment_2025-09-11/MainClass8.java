import java.util.ArrayList;
class MobileDetails{
	int mobile_cost;
	String model_name;
	String mobile_color;
	public String toString() {
		return "Mobile[Mobile Cost="+mobile_cost+",Model Name="+model_name+",mobile_color="+mobile_color+"]";
	}
	public MobileDetails(int mobile_cost,String model_name,String mobile_color) {
		this.mobile_cost=mobile_cost;
		this.model_name=model_name;
		this.mobile_color=mobile_color;
	}
}
public class MainClass8{
	public static void main(String[] args) {
		ArrayList<MobileDetails> l1=new ArrayList<MobileDetails>();
		l1.add(new MobileDetails(30000,"iQOO","Black"));
		l1.add(new MobileDetails(20000,"Samsung","White"));
		l1.add(new MobileDetails(10000,"iPhone","Black"));
		l1.add(new MobileDetails(35000,"Realme","White"));
		l1.add(new MobileDetails(45000,"Poco","Black"));
		for (int i = 0; i < l1.size(); i++) {
			Object o1=l1.get(i);
			MobileDetails m1=(MobileDetails)o1;
			System.out.println(m1);
		}
	}
}
