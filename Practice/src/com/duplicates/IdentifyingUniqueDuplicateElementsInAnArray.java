package com.duplicates;

public class IdentifyingUniqueDuplicateElementsInAnArray {
	
	public static void main(String[] args) {
		
		int duplicatesCount = 0;
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
			
			
			if(count>1)
			{
				duplicatesCount ++;
				
			}
			
		
		}
		System.out.println(duplicatesCount);
	}

}
