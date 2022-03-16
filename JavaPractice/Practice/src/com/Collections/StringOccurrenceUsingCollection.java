package com.Collections;

import java.util.HashMap;

public class StringOccurrenceUsingCollection {
	
	public static void main(String[] args) {
		
		String s = "Swadheenta";
		
		s = s.toLowerCase();
		
		HashMap<Character , Integer> hm = new HashMap();
		char[] ch = s.toCharArray();
		
		for(char ch1 : ch) {
			
			if(!hm.containsKey(ch1)) {
				hm.put(ch1 ,  1);
			}else {
				int count = hm.get(ch1);
				hm.put(ch1 ,  ++count);
			}
		}
		System.out.println(hm);
	}

}
//{a=2, s=1, d=1, t=1, e=2, w=1, h=1, n=1}