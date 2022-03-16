/*1
  2 3
  4 5 6
  7 8 9 10*/

class FloydsTriangle
{
	public static void main(String [] args)
	{
		int row = 4;
		int count = 1;
		int num = 1 ;
		for(int i = 1 ; i <= row ; i++)
		{
			
			for(int j = 1 ; j <= count ; j++)
			{
				System.out.print(num++ + " ");
				
			}
		System.out.println();
		count++;
		
		}
	}
}