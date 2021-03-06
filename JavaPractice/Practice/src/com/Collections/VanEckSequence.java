package com.Collections;

import java.util.HashMap;

public class VanEckSequence {

	public static void main(String[] args) {
		
		System.out.println("Vaneck sequence upto 100 : ");
		
		int distance = 0 ;
		int nextNumber = 0;
		
		String sequence = "";// empty string
		HashMap<Integer , Integer> hm = new HashMap<Integer,Integer>();
		
		for(int i = 0 ; i < 100 ; i++) {
			if(hm.containsKey(nextNumber)) {
				
				distance = i - hm.get(nextNumber);
			}else {
				distance = 0 ;
			}
			hm.put(nextNumber, i);
			sequence = sequence + nextNumber + ", ";
			nextNumber = distance ;
		}
			System.out.println(sequence);

	}

}
//Vaneck sequence upto 100 : 
//0,0,1,0,3,0,5,0,7,0,9,0,11,0,13,0,15,0,17,0,19,0,21,0,23,0,25,0,27,0,29,0,31,0,33,0,35,0,37,0,39,0,41,0,43,0,45,0,47,0,49,0,51,0,53,0,55,0,57,0,59,0,61,0,63,0,65,0,67,0,69,0,71,0,73,0,75,0,77,0,79,0,81,0,83,0,85,0,87,0,89,0,91,0,93,0,95,0,97,0,*/26