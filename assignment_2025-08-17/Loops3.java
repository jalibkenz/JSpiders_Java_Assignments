class Loops3 
{
	static void bwd(char start,char end)
	{
		for (char i=start;i>=end;i-- )
		{
			System.out.print("HI"+i+" ");
		}
	}
	public static void main(String[] args) 
	{
		bwd('F','A');
	}
}
