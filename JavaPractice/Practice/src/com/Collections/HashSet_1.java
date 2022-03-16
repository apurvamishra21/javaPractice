package com.Collections;

import java.util.HashSet;

public class HashSet_1 {
	
	public static void main(String[] args) {
		
		HashSet hs = new HashSet();
		hs.add("Swadheenta");
		hs.add(923);
		hs.add(null);
		hs.add(456789);
		hs.add(18);
		
		System.out.println(hs);
		hs.add(null);
		System.out.println(hs);
		
		
	}

}
