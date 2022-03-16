/* *****
   *   *
   *   *
   *   *
   *****
*/

class SquarePattern
{
	public static void main(String[] args)
	{
			int row = 5;
			int count = 5;
			for(int i = 1 ; i <= row ; i++)
			{
				for(int j = 1 ; j <= count ; j++)
				{
					if(i == 1 || i == 5 || j == 1 || j == 5)
					{
						System.out.print("*");
					}else{
						System.out.print(" ");
					}
				}
				System.out.println();
			}
	}
}