package com.Collections;

import java.util.HashMap;

public class HashMap_1 {
	
	public static void main(String[] args) {
		
		
		HashMap hm = new HashMap();
		
		hm.put(123, "Apu");
		hm.put(123, null);
		hm.put(123, "avni");
		hm.put(123, null);
		hm.put('I', "Apu");
		hm.put(null, 56);
		hm.put(null, 89);
		
		System.out.println(hm);
		
		
	}

}
//{null=89, 123=Apu}

//{I=A, 271=P, 25=A, 242=v, 22=X}
