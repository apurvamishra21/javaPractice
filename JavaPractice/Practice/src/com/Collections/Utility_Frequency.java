package com.Collections;

import java.util.ArrayList;
import java.util.Collections;

public class Utility_Frequency {
	
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		al.add(15);
		al.add(25);
		al.add(20);
		al.add(15);
		al.add(22);
		al.add(23);
		al.add(25);
		
		int count1 = Collections.frequency(al, 15);
		
		System.out.println(count1);
		
		System.out.println(Collections.frequency(al, 20));
		
		System.out.println(Collections.frequency(al, 23));
		
		
	}

}
/*2
1
1*/