package com.Collections;

import java.util.TreeSet;

public class Comparable_1 {
	
	public static void main(String[] args) {
		
		TreeSet ts = new TreeSet();
		
		ts.add(new StringBuffer("Q"));
		ts.add(new StringBuffer("u"));
		ts.add(new StringBuffer("E"));
		ts.add(new StringBuffer("E"));
		ts.add(new StringBuffer("N"));
		
		System.out.println(ts);
		
	}

}
//[E, N, Q, u]