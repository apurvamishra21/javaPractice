package com.Collections;

import java.util.TreeSet;

public class TreeSet_4 {

	public static void main(String[] args) {
		
		TreeSet ts = new TreeSet(new StudentByDescRollNum());
		
		
		ts.add(new Student("kalam" , 71));
		ts.add(new Student("subhash" , 48));
		ts.add(new Student("Kiran" , 72));
		ts.add(new Student("Shruti" , 58));
		ts.add(new Student("Robin" , 57));
		
		System.out.println(ts);

	}

}
/*[Name : KiranRollnum : 72
, Name : kalamRollnum : 71
, Name : ShrutiRollnum : 58
, Name : RobinRollnum : 57
, Name : subhashRollnum : 48
]
*/