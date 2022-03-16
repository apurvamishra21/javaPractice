/*              1
			2   1
		3   2   1
	4   3   2   1
5   4   3   2   1*/

class LPatternStartsWithI
{
	public static void main(String[] args)
	{
		int row = 5 ;
		int count = 1 ;
		int space = 4 ;
		for(int i = 1 ; i <= row ; i++)
		{
			
			for(int j = 1 ; j <= space ; j++)
			{
				System.out.print(" ");
			}
			int num = i;
			for(int k = 1 ; k <= count ; k++)
			{
				System.out.print(num + "");
				num -- ;
			}
			
			System.out.println();
			count ++;
			space -- ;
		}
	}
}
			
			
			
			
			