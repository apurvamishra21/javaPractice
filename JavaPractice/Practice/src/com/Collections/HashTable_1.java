package com.Collections;

import java.util.Hashtable;

public class HashTable_1 {
	
	public static void main(String[] args) {
		
		Hashtable ht = new Hashtable();
		
		ht.put(25 , "A");
		ht.put(22 , "X");
		ht.put(242 , "v");
		ht.put(271 , "P");
		ht.put('I' , "A");
		
		System.out.println(ht);
		
		
	}

}
//{I=A, 271=P, 25=A, 242=v, 22=X}
