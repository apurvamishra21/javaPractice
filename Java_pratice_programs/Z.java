class Z
{
		public static void main(String[] args)
		{
		int row = 5;
		int count = 5 ;
	
				for(int i = 1 ; i <= row ; i++)
	   			{
					for(int j = 1 ; j <= count ; j++)
					{
						if( i == 1 || i == 5 || i + j == row +1)
						{
							System.out.print("*");
						}
						else
						{
							System.out.print(" ");
						}
				}
						System.out.println();
					
				}
		}
}
			