package com.Collections;

import java.util.PriorityQueue;

public class PriorityQueue_1 {
	
	public static void main(String[] args) {
		
		PriorityQueue pq = new PriorityQueue();
		
		pq.add(26);
		pq.add(36);
		pq.add(46);
		pq.add(56);
		pq.add(66);
		
		System.out.println(pq);
		
		System.out.println("------------");
		
		int size = pq.size();
		
		for(int i = 1 ; i <= size ; i++)
		{
			//System.out.println(pq.peek());
			
			pq.element();
			
			System.out.println(pq);
			
			System.out.println("------------");
		}
	}

}

/*
 * peek 
 * [26, 36, 46, 56, 66]
------------
26
[26, 36, 46, 56, 66]
------------
26
[26, 36, 46, 56, 66]
------------
26
[26, 36, 46, 56, 66]
------------
26
[26, 36, 46, 56, 66]
------------
26
[26, 36, 46, 56, 66]
------------

[26, 36, 46, 56, 66]
------------
[26, 36, 46, 56, 66]
------------
[26, 36, 46, 56, 66]
------------
[26, 36, 46, 56, 66]
------------
[26, 36, 46, 56, 66]
------------
[26, 36, 46, 56, 66]
------------*/
