class SearchBackward1
{
	public static void main(String[] args) 
	{
		searchNumber(6,1,2);
	}
	static void searchNumber(int start,int end,int search)
	{
		while(start>=end)
		{
			if(start==search)
			{
				System.out.println("Im Present");
			}
			start--;
		}
	}
}
