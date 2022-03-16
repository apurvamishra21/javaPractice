package com.Collections;

import java.util.Comparator;

public class MyComp implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		
		Integer i = (Integer)o1 ;
		Integer j = (Integer)o2;
		return -i.compareTo(j);
	}
	
	

}
