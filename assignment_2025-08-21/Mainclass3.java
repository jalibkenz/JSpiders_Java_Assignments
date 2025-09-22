interface Tea
{
	void taste();

}
class lemon_tea implements Tea
{
	public void taste()
	{
		System.out.println("lemontea");
	}
}
class Green_tea implements Tea
{
	public void taste()
	{
		System.out.println("greentea");
	}
}class Black_tea implements Tea
{
	public void taste()
	{
		System.out.println("blacktea");
	}
}
class stimulator3
{
	static void tea_taste(Tea t1)
	{
		t1.taste();
	}
}
public class Mainclass3

{
	public static void main(String[] args) 
	{
		lemon_tea j1 = new lemon_tea();
		Green_tea p1 = new Green_tea();
		Black_tea b1 = new Black_tea();
		
		stimulator3.tea_taste(j1);
		stimulator3.tea_taste(p1);
		stimulator3.tea_taste(b1);
	}
}
