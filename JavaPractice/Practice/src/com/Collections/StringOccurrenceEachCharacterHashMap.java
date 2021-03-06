package com.Collections;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class StringOccurrenceEachCharacterHashMap {
	
	public static void main(String[] args) {
		
		Scanner str = new Scanner(System.in);
		
		String s = str.next();
		
		LinkedHashMap<Character , Integer> m = new LinkedHashMap<Character , Integer>();
		
		for(int i = 0 ; i < s.length() ; i++) {
			
			char ch = s.charAt(i);
			
			if(m.containsKey(ch)) {
				
				int value = m.get(ch);
				m.put(ch,  value + 1);
				
			}else {
				m.put(ch, 1);
			}
		}
		Set<Entry<Character , Integer>> es = m.entrySet();
		
		for(Entry<Character , Integer> e : es) {
			
			System.out.println(e.getKey() + "-" + e.getValue());
		}
		
	}

}
/*a-2
p-1
u-1
r-1
v-1

A-1
p-1
u-1
r-1
v-1
a-1
*/
