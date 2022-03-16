package com.Collections;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMap_1 {
	
	public static void main(String[] args) {
		
	
	
	TreeMap tm = new TreeMap();
	
	tm.put(11 , "Bye");
	tm.put(22 , "hi");
	tm.put(24 , "bye");
	tm.put(16 , null);
	tm.put(19 , 8.66);
	
	System.out.println(tm);
	TreeMap tm1 = new TreeMap(new IntegerComp());
	
	tm1.put(12, "Bye");
	tm1.put(89, "hi");
	tm1.put(10 , "Bye");
	tm1.put(46 , null);
	tm1.put(64, 8.56);
	
	System.out.println(tm1);
	}
}
	
	class IntegerComp implements Comparator
	{
		
		@Override
		public int compare(Object obj1  , Object obj2)
		{
			Integer i = (Integer)obj1;
			
			Integer j = (Integer)obj2;
			
			return -i.compareTo(j);
		}

	
	
	
	

}
//{11=Bye, 16=null, 19=8.66, 22=hi, 24=bye}
//	{89=hi, 64=8.56, 46=null, 12=Bye, 10=Bye}

