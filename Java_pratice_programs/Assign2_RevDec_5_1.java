/* 5 4 3 2 1
   5 4 3 2 1
   5 4 3 2 1
   5 4 3 2 1
   5 4 3 2 1 */


class Assign2_RevDec_5_1
{
	public static void main(String[] args)
	{
		int row = 5;
		int count = 5;
		
		
		for(int i = 1 ; i <= row ; i++)
		{
			int num = 5;
			for(int j = 1 ; j <= count ; j++)
			{
				System.out.print(num-- + " ");
			}
			System.out.println();
			
		}
	}
}