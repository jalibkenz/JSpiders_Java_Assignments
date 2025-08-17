class SumCubeForward1
{
	public static void main(String[] args) 
	{
		square(1,10);
	}
	static void square(int start,int end)
	{
		int sum=0;
		while(start<=end)
		{
			sum=sum+cube(start);
			start++;
		}
		System.out.println(sum);
	}
	static int cube(int num)
	{
		int res=num*num*num;
		return res;
	}
}
