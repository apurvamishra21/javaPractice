package com.Collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet_2 {
	
	public static void main(String[] args) {
		
		TreeSet ts = new TreeSet();
		ts.add(new Student("kalam" , 71));
		ts.add(new Student("subhash" , 48));
		ts.add(new Student("Kiran" , 72));
		ts.add(new Student("Shruti" , 58));
		ts.add(new Student("Robin" , 57));
		
		System.out.println(ts);
		
		//Using for each loop
//		
//		for(Object obj : ts) {
//			Student s1 = (Student)obj;
//			System.out.println(s1);
//		}
		
		//Using Iterator
		
		Iterator itr = ts.iterator();
		while(itr.hasNext()) {
			
			Object obj = itr.next();
			Student s1 = (Student)obj;
			System.out.println(s1);
		}
		
		
	}

}

/*[Name : subhashRollnum : 48
, Name : RobinRollnum : 57
, Name : ShrutiRollnum : 58
, Name : kalamRollnum : 71
, Name : KiranRollnum : 72
]
Name : subhashRollnum : 48

Name : RobinRollnum : 57

Name : ShrutiRollnum : 58

Name : kalamRollnum : 71

Name : KiranRollnum : 72

*/
