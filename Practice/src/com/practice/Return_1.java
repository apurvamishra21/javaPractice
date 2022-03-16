package com.practice;

public class Return_1 {
	
	int x = 0;
	static int y = 5;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main starts");
		Return_1 t = new Return_1();
		t.m1();
		int z = t.m2();
		System.out.println(z);
		System.out.println("main ends");
		

	}
	
	public void m1() {
		
		System.out.println("welcome");
		System.out.println(x + y);
	}
	
	public static void m2() {
		
		System.out.println("again");
		
		System.out.println(x * y);
	}
	
	

}
