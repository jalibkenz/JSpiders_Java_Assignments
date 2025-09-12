import java.util.ArrayList;
class LaptopDetails{
	int laptop_cost;
	String laptop_name;
	String laptop_brand;
	public String toString() {
		return "Laptop[Laptop Cost="+laptop_cost+",Laptop Name="+laptop_name+",Laptop brand="+laptop_brand+"]";
	}
	public LaptopDetails(int laptop_cost,String laptop_name,String laptop_brand) {
		this.laptop_cost=laptop_cost;
		this.laptop_name=laptop_name;
		this.laptop_brand=laptop_brand;
	}
}
public class MainClass7{
	public static void main(String[] args) {
		ArrayList<LaptopDetails> l1=new ArrayList<LaptopDetails>();
		l1.add(new LaptopDetails(30000,"HP","HP Victus"));
		l1.add(new LaptopDetails(20000,"DELL","Dell Inspiron"));
		l1.add(new LaptopDetails(10000,"MACBOOK","MacBook Air"));
		l1.add(new LaptopDetails(35000,"ASUS","Asus Tuf Gaming"));
		l1.add(new LaptopDetails(45000,"SAMSUNG","Samsung Galaxy Book5"));
		for (int i = 0; i < l1.size(); i++) {
			Object o1=l1.get(i);
			LaptopDetails m1=(LaptopDetails)o1;
			System.out.println(m1);
		}
	}
}