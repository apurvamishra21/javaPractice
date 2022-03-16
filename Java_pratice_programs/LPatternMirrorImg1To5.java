/*     1
      21
     321
	4321
   54321
*/

class LPatternMirrorImg1To5
{
	public static void main(String[] args)
	{
		int row = 5;
		int count = 1;
		int space = 4;
		for(int i = 1 ; i <= row ; i++)
		{
			int num = i;
			for(int k = 1 ; k <= space ; k++)
			{
				System.out.print(" ");
				
			}
			for(int j = 1 ; j <= count ; j++)
			{
				System.out.print(num--);
				
			}	
		System.out.println();
		count++;
		space--;
		
		
		}
	}
}