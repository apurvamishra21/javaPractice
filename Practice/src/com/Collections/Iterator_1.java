package com.Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator_1 {
	
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		for(int i = 1 ; i <= 10 ; i++)
		{
			al.add(i);
		}
		System.out.println(al);
		
		Iterator itr = al.iterator();
		
		while(itr.hasNext()) {
			Object obj = itr.next();
			Integer i = (Integer)obj;
			
		
//		if(i%2 == 0) {
//			System.out.println(i);
//			itr.remove();
//		}
			
					if(i%2 != 0) {
				System.out.println(i);
				itr.remove();
			}
			
			
		
	}
	
	System.out.println(al);
	}
}
