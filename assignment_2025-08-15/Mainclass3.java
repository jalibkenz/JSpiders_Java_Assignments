class Ola_v1  
{
	void Booking()
	{
		System.out.println("Before only cabs can be booked ");
	}
}
class Ola_v2  extends Ola_v1
{
	void Booking()
	{
		System.out.println("now bikes ,autos, cabs can be booked ");
	}
}
class Mainclass3
{

	public static void main(String[] args) 
	{
		Ola_v2 O1 = new Ola_v2();
		O1.Booking();
	}
}
