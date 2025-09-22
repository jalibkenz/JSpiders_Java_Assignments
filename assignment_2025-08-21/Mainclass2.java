interface ola
{
	void Ride();

}
class Auto implements ola
{
	public void Ride()
	{
		System.out.println("auto booked");
	}
}
class Bike1 implements ola
{
	public void Ride()
	{
		System.out.println("Bike booked");
	}
}class Car implements ola
{
	public void Ride()
	{
		System.out.println("Car booked");
	}
}
class stimulator1
{
	static void veh_ride(ola o1)
	{
		o1.Ride();
	}
}
public class Mainclass2

{
	public static void main(String[] args) 
	{
		Auto j1 = new Auto();
		Car p1 = new Car();
		Bike1 b1 = new Bike1();
		
		stimulator1.veh_ride(j1);
		stimulator1.veh_ride(p1);
		stimulator1.veh_ride(b1);
	}
}
