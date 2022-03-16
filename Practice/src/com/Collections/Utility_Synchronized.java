package com.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Utility_Synchronized {
	
public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		al.add(15);
		al.add(25);
		al.add(5);
		
		
		List l1 = Collections.synchronizedList(al);
		
		System.out.println(al);
		System.out.println(l1);
		
		HashSet hs = new HashSet();
		
		hs.add("H");
		
		System.out.println(hs);
		
		Set s = Collections.synchronizedSet(hs);
		
		System.out.println(s);
		
		HashMap hm = new HashMap();
		hm.put(19 , "Hi");
		
		System.out.println(hm);
		
		Map m = Collections.synchronizedMap(hm);
		
		System.out.println(m);
	
		
		
	}

}

/*[15]
[H]
[H]
{19=Hi}
{19=Hi}

[15, 25, 5]
[15, 25, 5]
[H]
[H]
{19=Hi}
{19=Hi}
*/
