package com.collections;
import java.util.ArrayList;

public class RemoveDuplicatesFromArray {
	
	public static void main(String[] args) {
		
		int[] x = {10 , 20 , 30 ,40 , 50 , 60 , 70 , 80 , 90 , 10 , 20};
		ArrayList<Integer> l = new ArrayList<Integer>();
		for(int i = 0 ; i < x.length ; i++ ) {
			int count = 0;
			for(int j = 0 ; j < x.length ; j++) {
				if(x[i] == x[j] && i>j) {
					break;
				}
				if(x[i] == x[j]) {
					count++;
				}
			}
			if(count == 1) {
				l.add(x[i]);
			}
		}
		 Object[] arr = l.toArray();
		 int[] y = new int[arr.length];
		 int i = 0 ;
		 for(Object obj : arr) {
			 y[i++] = (Integer)obj;
			 
		 }
		 System.out.println("OriginalArray is:");
		 for(int ele:x) {
			 System.out.println(ele + "");
		 }
		 System.out.println();
		 System.out.println("Array after removing duplicates : ");
		 for(int ele:y) {
			 System.out.println(ele + "");
			 
	
		 }
	}
	
	

}
