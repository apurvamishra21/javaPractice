package com.Collections;

import java.util.Comparator;

public class MyComp_1 implements Comparator<Integer> {
	
	

	@Override
	public int compare(Integer o1, Integer o2) {
		return -o1.compareTo(o2);
	}

}
