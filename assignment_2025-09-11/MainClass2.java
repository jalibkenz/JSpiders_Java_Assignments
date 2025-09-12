import java.util.ArrayList;
class CarDetails{
	int car_cost;
	String model_name;
	String car_type;
	public String toString() {
		return "Car[Car Cost="+car_cost+",Model Name="+model_name+",Car Type="+car_type+"]";
	}
	public CarDetails(int car_cost,String model_name,String car_type) {
		this.car_cost=car_cost;
		this.model_name=model_name;
		this.car_type=car_type;
	}
}
public class MainClass2{
	public static void main(String[] args) {
		ArrayList<CarDetails> l1=new ArrayList<CarDetails>();
		l1.add(new CarDetails(30000000,"Lamborghini","Black"));
		l1.add(new CarDetails(20000000,"Audi","White"));
		l1.add(new CarDetails(10000000,"Ferrari","Black"));
		l1.add(new CarDetails(35000000,"Tesla","White"));
		l1.add(new CarDetails(45000000,"Porsche","Black"));
		for (int i = 0; i < l1.size(); i++) {
			Object o1=l1.get(i);
			CarDetails m1=(CarDetails)o1;
			System.out.println(m1);
		}
	}
}