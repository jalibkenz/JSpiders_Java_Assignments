class OddBackward1 
{
	public static void main(String[] args) 
	{
		printOdd(10,1);
	}
	static void printOdd(int start,int end)
	{
		while(start>=end)
		{
			if(start%2==1)
			{
				System.out.println(start);
			}
			start--;
		}
	}
}
