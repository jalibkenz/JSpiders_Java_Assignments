interface Bike
{
	void sound();

}
class Java implements Bike
{
	public void sound()
	{
		System.out.println("java");
	}
}
class Pulsar implements Bike
{
	public void sound()
	{
		System.out.println("pulsar");
	}
}
class BMW implements Bike
{
	public void sound()
	{
		System.out.println("BMW");
	}
}
class stimulator
{
	static void veh_sound(Bike b1)
	{
		b1.sound();
	}
}
public class Mainclass1
{
	public static void main(String[] args) 
	{
		Java j1 = new Java();
		Pulsar p1 = new Pulsar();
		BMW b1 = new BMW();
		
		stimulator.veh_sound(j1);
		stimulator.veh_sound(p1);
		stimulator.veh_sound(b1);
	}
}
