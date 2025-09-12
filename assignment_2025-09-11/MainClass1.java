import java.util.ArrayList;
class BikeDetails{
	int bike_cost;
	String bike_brand;
	String bike_color;
	public String toString() {
		return "Bike[Bike Cost="+bike_cost+",Bike brand="+bike_brand+",Bike color="+bike_color+"]";
	}
	public BikeDetails(int bike_cost,String bike_brand,String bike_color) {
		this.bike_cost=bike_cost;
		this.bike_brand=bike_brand;
		this.bike_color=bike_color;
	}
}
public class MainClass1{
	public static void main(String[] args) {
		ArrayList<BikeDetails> l1=new ArrayList<BikeDetails>();
		l1.add(new BikeDetails(300000,"NS 200","Black"));
		l1.add(new BikeDetails(200000,"RS 200","White"));
		l1.add(new BikeDetails(100000,"R15","Black"));
		l1.add(new BikeDetails(350000,"BMW","White"));
		l1.add(new BikeDetails(450000,"Duke","Black"));
		for (int i = 0; i < l1.size(); i++) {
			Object o1=l1.get(i);
			BikeDetails m1=(BikeDetails)o1;
			System.out.println(m1);
		}
	}
}