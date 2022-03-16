package com.Collections;
import java.util.ArrayList;

public class ArrayList_1 {
	
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add("Swadheenta");
		al.add(1995);
		al.add(97.98);
		al.add('A');
		al.add(false);
		al.add("Swadheenta");
		al.add(null);
		al.add(98);
		al.add(null);
		
		System.out.println(al);
		
		al.add(2 , 108);
		System.out.println(al);
	
		
		
	}

}
