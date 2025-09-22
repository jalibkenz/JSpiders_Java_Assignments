interface Redbus
{
	void booking();

}
class volvo implements Redbus
{
	public void booking()
	{
		System.out.println("volvo");
	}
}
class benz implements Redbus
{
	public void booking()
	{
		System.out.println("benz");
	}
}
class airavat implements Redbus
{
	public void booking()
	{
		System.out.println("airavat");
	}
}
class stimulator5
{
	static void bus_book(Redbus r1)
	{
		r1.booking();
	}
}
public class Mainclass5
{
	public static void main(String[] args) 
	{
		volvo v1 = new volvo();
		benz b1 = new benz();
		airavat a1 = new airavat();
		
		stimulator5.bus_book(v1);
		stimulator5.bus_book(b1);
		stimulator5.bus_book(a1);
	}
}
