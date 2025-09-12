
import java.util.ArrayList;
class TvDetails{
	int tv_cost;
	String tv_brand;
	String tv_type;
	public String toString() {
		return "Tv[Tv Cost="+tv_cost+",Tv brand="+tv_brand+",Tv type="+tv_type+"]";
	}
	public TvDetails(int tv_cost,String tv_brand,String tv_type) {
		this.tv_cost=tv_cost;
		this.tv_brand=tv_brand;
		this.tv_type=tv_type;
	}
}
public class MainClass9a{
	public static void main(String[] args) {
		ArrayList<TvDetails> l1=new ArrayList<TvDetails>();
		l1.add(new TvDetails(30000,"LG","Black"));
		l1.add(new TvDetails(20000,"Samsung","White"));
		l1.add(new TvDetails(10000,"Sony","Black"));
		l1.add(new TvDetails(35000,"Panasonic","White"));
		l1.add(new TvDetails(45000,"Croma","Black"));
		for (int i = 0; i < l1.size(); i++) {
			Object o1=l1.get(i);
			TvDetails m1=(TvDetails)o1;
			System.out.println(m1);
		}
	}
}