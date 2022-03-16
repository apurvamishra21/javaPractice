package com.Collections;

import java.util.ArrayList;

public class RemoveDuplicatesFromArray{
	
	public static void main(String[] args) {
		
		int[]  x = {10 , 20 , 30 ,40 , 10 , 25 , 56 , 20 , 56 , 78 ,89};
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		for(int i = 0 ; i < x.length ; i++) {
			
			int count = 0 ;
			
			for(int j = 0 ; j < x.length ; j++) {
				
				if(x[i] == x[j]  && i > j) {
					break ;
				}
				
				if( x[i] == x[j]) {
					count ++ ;
				}
			}
			if(count == 1) {
				al.add(x[i]);
			}
		}
		
		Object[] arr = al.toArray();
		int []y = new int[arr.length];
		int i = 0 ;
		for(Object obj : arr) {
			y[i++] = (Integer)obj;
		}
		
		System.out.println("Original Array is : ");
		for(int ele : x) {
			System.out.println(ele + "");
		}
		System.out.println();
		System.out.println("Array after removing duplicates : - ");
		
		for(int ele : y) {
			
			System.out.println(ele + " ");
		}
	}

}
/*Original Array is : 
10
20
30
40
10
25
56
20
56
78
89

Array after removing duplicates : - 
30 
40 
25 
78 
89 
*/