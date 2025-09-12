import java.util.ArrayList;
class ClothDetails{
	String cloth_color;
	char cloth_size;
	int cloth_cost;
	public String toString() {
		return "Cloth[Cloth color="+cloth_color+",Cloth size="+cloth_size+",Cloth cost="+cloth_cost+"]";
	}
	public ClothDetails(String cloth_color,char cloth_size,int cloth_cost) {
		this.cloth_color=cloth_color;
		this.cloth_size=cloth_size;
		this.cloth_cost=cloth_cost;
	}
}
public class MainClass3{
	public static void main(String[] args) {
		ArrayList<ClothDetails> l1=new ArrayList<ClothDetails>();
		l1.add(new ClothDetails("White",'S',2000));
		l1.add(new ClothDetails("Grey",'M',3000));
		l1.add(new ClothDetails("Pink",'L',4000));
		for (int i = 0; i < l1.size(); i++) {
			Object o1=l1.get(i);
			ClothDetails m1=(ClothDetails)o1;
			System.out.println(m1);
		}
	}
}