/* 5 5 5 5 5
   4 4 4 4 4 
   3 3 3 3 3
   2 2 2 2 2
   1 1 1 1 1 */


class Assign1_Rev_5_1
{
	public static void main(String[] args)
	{
		int row = 5;
		int count = 5;
		int num = 5;
		
		for(int i = 1 ; i <= row ; i++)
		{
			for(int j = 1 ; j <= count ; j++)
			{
				System.out.print(num + " ");
			}
			System.out.println();
			num--;
		}
	}
}
