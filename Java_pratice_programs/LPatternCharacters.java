/* A
   A B
   A B C
   A B C D
   A B C D E
*/

class LPatternCharacters
{
	public static void main(String[] args)
	{
		int row = 5;
		int count = 1 ;

		
		for( int i = 1 ; i <= row ; i++)
		{
			char ch = 'A';
			for(int j = 1 ; j <= count ; j++)
			{
			System.out.print(ch ++ + " ");
			}
			System.out.println();
			count ++;
		}
	}
}
		
		