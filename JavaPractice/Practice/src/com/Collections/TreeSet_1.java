package com.Collections;

import java.util.TreeSet;

public class TreeSet_1 {
	
	public static void main(String[] args) {
		
	
	
	TreeSet ts = new TreeSet();
	
	ts.add(12);
	ts.add(15);
	ts.add(29);
	//ts.add(null); java.lang.NullPointerException
	ts.add(29);
	ts.add(2);
	ts.add(3);
	
	System.out.println(ts);
	
	//ts.add("hi");java.lang.ClassCastException
	}

}
//[2, 3, 12, 15, 29]
