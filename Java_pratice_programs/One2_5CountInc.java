/*1
  1 2 
  1 2 3
  1 2 3 4
  1 2 3 4 5*/

class One2_5CountInc
{
	public static void main(String[] args){

		int row = 5;
		int count = 1;
		
		
		for(int i = 1 ; i <= row ; i++)
		{
			
			for(int j = 1 ; j <= count ; j++)
			{
				System.out.print(j + " ");
			}
			System.out.println();
			count++;
			
		}
	}
}