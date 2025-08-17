class SearchForward1
{
	public static void main(String[] args) 
	{
		searchNumber(1,6,4);
	}
	static void searchNumber(int start,int end,int search)
	{
		while(start<=end)
		{
			if(start==search)
			{
				System.out.println("Im Present");
			}
			start++;
		}
	}
}
