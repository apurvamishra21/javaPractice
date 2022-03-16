/*1
  2 6
  3 7 10
  4 8 11 13
  5 9 12 14 15*/





class PatternDiff_4
{
	public static void main(String[] args)
	{
		int row = 5;
		int count = 1;
		
		for(int i = 1 ; i <= row ; i++)
		{
			int x = i;
			int diff = 4 ;
			for(int j = 1 ; j <=count ; j++)
			{
				System.out.print(x + " ");
				x = x + diff -- ;
			}
		System.out.println();
		count ++ ;
		}
	}
}	
				