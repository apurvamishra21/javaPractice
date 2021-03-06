package com.Collections;

import java.util.HashMap;

public class Vaneck_2 {
	
	public static void main(String[] args) {
	System.out.println("Van Eck Sequence upto 100: ");
	
	int distance = 0;
	int nextNumber = 0;
	String sequence = "";
	HashMap<Integer, Integer> hm = new HashMap<Integer , Integer>();
	for (int i = 0; i < 100; i++) {
		if (hm.containsKey(nextNumber)) {
			distance = i - hm.get(nextNumber);
		} else {
			distance = 0;
		}
		hm.put(nextNumber, i);
		sequence = sequence + nextNumber + ", ";
		nextNumber = distance;
	}
	System.out.println(sequence);

}
}
