package com.Collections;

import java.util.PriorityQueue;

public class PriorityQueue_2 {
	
	public static void main(String[] args) {
		
		PriorityQueue pq = new PriorityQueue();
		
		pq.add(26);
		pq.add(28);
		pq.add(13);
		pq.add(68);
		pq.add(46);
		pq.add(78);
		pq.add(99);
		
		System.out.println(pq);
		
		System.out.println("--------------");
		
		int size = pq.size();
		
		for(int i = 1 ; i <= size ; i++)
		{
			System.out.println(pq.poll());
			System.out.println(pq.remove());
			
			System.out.println(pq);
			
			System.out.println("--------------");
			
		}
		
	}

}
