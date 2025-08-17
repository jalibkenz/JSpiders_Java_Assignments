class EvenSquareBackward1
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
				System.out.println(square(start));
			}
			start--;
		}
	}
	static int square(int num)
	{
		int res=num*num;
		return res;
	}
}
