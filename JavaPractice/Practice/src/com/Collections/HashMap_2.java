package com.Collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap_2 {

	public static void main(String[] args) {

		HashMap hm = new HashMap();
		
		
		hm.put(25, "A");
		hm.put(88, "v");
		hm.put(86, "n");
		hm.put(83, "i");
		
		System.out.println(hm);
		
		System.out.println(hm.containsKey(10));
		System.out.println(hm.containsKey(30));
		System.out.println(hm.containsValue("X"));
		System.out.println(hm.get(63));
		System.out.println(hm.containsKey(88));
		System.out.println(hm.containsValue("i"));
		
		
		hm.remove(10);
		
		System.out.println(hm);
		
		System.out.println("All Keys: -");
		
		Set allKeys = hm.keySet();
		
		for(Object obj : allKeys) {
			
			System.out.println(obj);
		}
		
		System.out.println("All Values : - ");
		
		Collection allValue = hm.values();
		
		for(Object obj : allValue) {
			
			System.out.println(obj);
		}
		
		System.out.println("All Entries : -");
		
		Set allEntry = hm.entrySet();
		
		for(Object obj : allEntry) {
			
			Map.Entry e = (Map.Entry)obj ;
			
			System.out.println("Key is " + e.getKey());
			System.out.println("Value is :" + e.getValue());
			
			if(e.getValue().equals("T")) {
				
				e.setValue("M");
			}
		}
		
		System.out.println(hm);
		
		
		

	}

}


/*83=i, 86=n, 88=v, 25=A}
false
false
false
null
{83=i, 86=n, 88=v, 25=A}
All Keys: -
83
86
88
25
All Values : - 
i
n
v
A
*/
//{83=i, 86=n, 88=v, 25=A}


/*{83=i, 86=n, 88=v, 25=A}
false
false
false
null
true
true
{83=i, 86=n, 88=v, 25=A}
All Keys: -
83
86
88
25
All Values : - 
i
n
v
A

*
*
*
*
{83=i, 86=n, 88=v, 25=A}
false
false
false
null
true
true
{83=i, 86=n, 88=v, 25=A}
All Keys: -
83
86
88
25
All Values : - 
i
n
v
A
All Entries : -
Key is 83
Value is :i
Key is 86
Value is :n
Key is 88
Value is :v
Key is 25
Value is :A
{83=i, 86=n, 88=v, 25=A}
*/