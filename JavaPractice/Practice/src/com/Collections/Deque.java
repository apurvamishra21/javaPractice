package com.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Deque {
	
	public static void main(String[] args) {
		
	approach1();
	//approach2();
		
	}
	
	public static void approach1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter total size :");
		
		int sizeNum = sc.nextInt();
		
		System.out.println("Enter total group size :");
		
		int groupNum = sc.nextInt(); 
		
		LinkedList<Integer> ll = new LinkedList<Integer>();
		
		System.out.println("Enter number : -");
		
		for(int i = 0 ; i < sizeNum ; i++) {
			ll.add(sc.nextInt());
		}
		System.out.println(ll);
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		int size = (ll.size() - groupNum) + 1 ;
		
		for(int i = 0 ; i < size ; i++) {
			
			int distinctNum = 0;
			
			Integer [] arr = new Integer[groupNum];
			 int x = i ;
			 
			 for(int j = 0 ; j < groupNum ; j++) {
				 arr[j] = ll.get(x++);
			 }
			 
			 for(int m = 0 ; m < arr.length ; m++){
				 
				 int count = 0;
			for(int n = 0 ; n < arr.length ; n++) {
				
				if(arr[m] == arr[n]  && m > n) {
					break;
				}
				if(arr[m] == arr[n]) {
					count ++;
				}
			}
			if(count > 0) {
				distinctNum ++;
			}
				 
		}
			 al.add(distinctNum);
		}
		Collections.sort(al);
		Integer maxValue = Collections.max(al);
		System.out.println(maxValue);
	}

}
