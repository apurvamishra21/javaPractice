package com.collections;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;

public class HackerankDeque {
	
	public static void main(String[] args) {
		
		approach1();
		approach2();
		
	}
	
	public static void approach1()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter total size :");
		int sizeNum = s.nextInt();
		System.out.println("Enter total group size :");
		int groupNum = s.nextInt();
		
		LinkedList<Integer> q = new LinkedList<Integer>();
		System.out.println("Enter Numbers :");
		
		for(int i = 0 ; i < sizeNum ; i++)
		{
			q.add(s.nextInt());
		}
		System.out.println(q);
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		int size = (q.size() - groupNum) + 1;
		
		for(int i = 0 ; i < size ; i++)
		{
			int distinctNum = 0;
			Integer[] arr = new Integer[groupNum];
			 int x = i;
			 
			 for(int j = 0 ; j < groupNum ; j++) {
				 arr[j] = q.get(x++);
			 }
			 
			 for(int m = 0 ; m < arr.length ; m++) {
				 int count = 0;
				 
				 for(int n = 0 ; n < arr.length ; n++) {
					 
					 if(arr[m] == arr[n] && m > n) {
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
	
	public static void approach2() {
		
		Scanner sc = new Scanner(System.in);
		Deque<Integer> deque = new ArrayDeque<>();
		HashSet<Integer> set = new HashSet<>();
		
		
		int num = sc.nextInt();
		int m = sc.nextInt();
		int max = -1 ;
		
		for(int i = 0 ; i < num ; i++) {
			
			int input = sc.nextInt();
			
			deque.add(input);
			set.add(input);
			
			if(deque.size() == m) {
				if(set.size() > max) {
					max = set.size();
					
				}
				
				int first = deque.remove();
				if(!deque.contains(first)) {
					set.remove(first);
				}
			}
		}
		System.out.println(max);
		
	}
}
