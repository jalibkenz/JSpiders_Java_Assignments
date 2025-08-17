class Telegram_v1
{
	void feature()
	{
		System.out.println("smaller files can be shared");
	}
}
class Telegram_v2 extends Telegram_v1
{
	void feature()
	{
		System.out.println("larger files can be shared");
	}
}
class Mainclass2
{
	public static void main(String[] args) 
	{
		Telegram_v2 T1 = new Telegram_v2();
		T1.feature();
	}
}
