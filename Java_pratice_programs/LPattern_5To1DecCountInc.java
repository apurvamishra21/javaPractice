/*5
  5 4
  5 4 3
  5 4 3 2
  5 4 3 2 1*/

class LPattern_5To1DecCountInc
{
	public static void main(String[] args)
	{
		int row = 5;
		int count = 1;
		
		for(int i = 1 ; i <= row ; i++)
		{
			int num = 5;
			for(int j = 1 ; j <= count ; j++)
			{
				System.out.print(num + " ");
				num--;
			}
		System.out.println();
		count++;
		
		}
	}
}
