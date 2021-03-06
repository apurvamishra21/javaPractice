package com.Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap_3 {
	
	public static void main(String[] args) {
		
		HashMap hm = new HashMap();
		
		
		hm.put(125, hm);
		hm.put(100, hm);
		hm.put(99, hm);
		hm.put(96, hm);
		hm.put(50, hm);
		hm.put(57, hm);
		
		System.out.println(hm);
		
		Set entries = hm.entrySet();
		
		Iterator itr = entries.iterator();
		while(itr.hasNext()) {
			
			Object obj = itr.next();
			
			Map.Entry e = (Map.Entry)obj;
			
			Entry e1 = (Entry)obj;
			
			System.out.println("Key :" + e.getKey());
			System.out.println("Value :" + e.getValue());
			
			if(e.getValue().toString().equals("Apurva")) {
				e.setValue("I.A.S Apurva");
			}
		}
		
		System.out.println(hm);
	}

}
/*{96=(this Map), 50=(this Map), 99=(this Map), 100=(this Map), 57=(this Map), 125=(this Map)}
Key :96
Value :{96=(this Map), 50=(this Map), 99=(this Map), 100=(this Map), 57=(this Map), 125=(this Map)}
Key :50
Value :{96=(this Map), 50=(this Map), 99=(this Map), 100=(this Map), 57=(this Map), 125=(this Map)}
Key :99
Value :{96=(this Map), 50=(this Map), 99=(this Map), 100=(this Map), 57=(this Map), 125=(this Map)}
Key :100
Value :{96=(this Map), 50=(this Map), 99=(this Map), 100=(this Map), 57=(this Map), 125=(this Map)}
Key :57
Value :{96=(this Map), 50=(this Map), 99=(this Map), 100=(this Map), 57=(this Map), 125=(this Map)}
Key :125
Value :{96=(this Map), 50=(this Map), 99=(this Map), 100=(this Map), 57=(this Map), 125=(this Map)}
{96=(this Map), 50=(this Map), 99=(this Map), 100=(this Map), 57=(this Map), 125=(this Map)}
*/