package com.Collections;

import java.util.ArrayList;
import java.util.Collections;

public class Utility_Sort {
	
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		al.add(15);
		al.add(25);
		al.add(30);
		al.add(34);
		al.add(10);
		
		System.out.println(al);
		
		Collections.sort(al);
		System.out.println(al);
		
		
		
	}

}


//[15, 25, 30, 34, 10]
//[10, 15, 25, 30, 34]