package com.Collections;

import java.util.ArrayList;

public class Generics_1 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(12);
		al.add(2);
//		al.add("hello");
//		al.add(12.25);
//		al.add(true);
		
		System.out.println(al);
	}

}

//[12, 2]