package com.Collections;

import java.util.LinkedHashMap;

public class LinkedHashMap_1 {
	
	public static void main(String[] args) {
		
		LinkedHashMap lhm = new LinkedHashMap();
		
		lhm.put(25 , "A");
		lhm.put(88 , "A");
		lhm.put(null , "hi");
		
		lhm.put(1,"Apu");
		lhm.put(2, "Apu");
		
		System.out.println(lhm);
		lhm.put(null, 83);
		lhm.put(25, "B");
		
		
		
//		lhm.put(A , "A");
//		lhm.put(B, "A");
//		lhm.put(C, "hi");
//		
//		lhm.put(D,"Apu");
//		lhm.put(E, "Apu");
//		
//		System.out.println(lhm);
//		
	}

}
//{25=A, 88=A, null=hi, 1=Apu, 2=Apu}