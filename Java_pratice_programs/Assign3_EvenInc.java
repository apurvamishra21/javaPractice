/* 2 4 6 8 10
   2 4 6 8 10
   2 4 6 8 10
   2 4 6 8 10
   2 4 6 8 10*/


class Assign3_EvenInc
{
	public static void main(String[] args)
	{
		int row = 5;
		int count = 5;

		for(int i = 1 ; i <= row ; i++)
		{
			
			for(int j = 1 ; j <= count ; j++)
			{
				System.out.print(j*2 + "  ");
			}
			System.out.println();
			
		}
	}
}	