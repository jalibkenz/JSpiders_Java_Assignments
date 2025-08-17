class EvenBackward1 
{
	public static void main(String[] args) 
	{
		printEven(10,1);
	}
	static void printEven(int start,int end)
	{
		while(start>=end)
		{
			if(start%2==0)
			{
				System.out.println(start);
			}
			start--;
		}
	}
}
