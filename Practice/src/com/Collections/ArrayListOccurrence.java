package com.Collections;

import java.util.ArrayList;

public class ArrayListOccurrence {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(10);
		al.add(20);
		al.add(10);
		al.add(30);
		al.add(140);
		al.add(20);
		
		for(int i = 0 ; i < al.size() ; i++)
		{
			int count = 0;
			
			for(int j = 0 ; j < al.size() ; j++)
			{
				if(al.get(i).equals(al.get(j))  && i > j)
				{
					break;
				}
				
				if(al.get(i).equals(al.get(j)))
				{
					count ++;
				}
			}
			if(count > 0)
			{
				System.out.println(al.get(i) + " present " + count + " times ");
			}
		}
		
	}

}
/*10present2times
20present2times
30present1times
140present1times

10 present 2 times 
20 present 2 times 
30 present 1 times 
140 present 1 times 
*/