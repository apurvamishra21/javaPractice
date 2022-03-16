package com.duplicates;

public class ArrayOccurrence {
	
	public static void main(String[] args) {
		
		
		int []x = {1,2,3,1,2,3,1};
		for(int i = 0 ; i <= x.length-1 ; i++)
		{
			int count = 0;
			
			for(int j = 0 ; j <= x.length-1 ; j++)
			{
				if(x[i] == x[j] && i > j)
			{
				break;
			}
			
			if(x[i] == x[j])
			{
				count++;
			}
			
			}
			
			
			if(count>0)
			{
		System.out.println(x[i]+"-"+count);
			}
		
		
	}

}
}
/*1-3
2-5
3-7
1-7
2-7
3-7
1-7
*/
