package com.duplicates;

import java.util.ArrayList;

public class CountNumberOfDuplicatesInAArrayList {
	
	public static void main(String[] args) {
		
		int duplicatesCount = 0;
		ArrayList<Integer> l = new ArrayList<Integer>();
		
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(10);
		l.add(200);
		l.add(20);
		l.add(10);
		
		
		for(int i = 0; i < l.size() ; i++) {
			
			int count = 0;
			for(int j = 0 ; j < l.size() ; j++) {
				
				if(l.get(i).equals(l.get(j)) && i > j)
				{
					break;
				}
				if(l.get(i).equals(l.get(j)))
				{
					count++;
				}
					
				}
			if(count > 1) {
				duplicatesCount ++;
				
			}
			}
	
		System.out.println(duplicatesCount);
	}
}
				
				
				
				
			
				
				
			
