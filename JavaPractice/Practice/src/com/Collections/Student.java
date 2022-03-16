package com.Collections;

public class Student implements Comparable {
	
	String name ;
	int rollnum ;
	
	public Student(String name , int rollnum) {
		
		this.name = name ;
		this.rollnum = rollnum ;
	}
	
	@Override
	public String toString() {
		return "Name : " + name + "Rollnum : " + rollnum + "\n" ;
	}

	@Override
	public int compareTo(Object obj) {
		
		Student s1 = this ;
		Student s2 = (Student)obj ;
//		if(s1.rollnum > s2.rollnum) {
//			return 1 ;
//		}else if(s1.rollnum < s2.rollnum) {
//			return -1;
//		}else {
//			return 0;
//		}
		
//		Integer i = s1.rollnum;
//		Integer j = s2.rollnum;
//		
//		return i.compareTo(j);
		
		Integer i = this.rollnum;
		Integer j = ((Student)obj).rollnum;
		return i.compareTo(j);
		
		}
	}

	
	
	
	


