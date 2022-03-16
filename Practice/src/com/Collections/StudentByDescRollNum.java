package com.Collections;

import java.util.Comparator;

public class StudentByDescRollNum implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		
		Student s1 = (Student)o1;
		Student s2 = (Student)o2;
		
		
		Integer i = s1.rollnum;
		Integer j = s2.rollnum;
		
		return -i.compareTo(j);
		}

}
	class StudentByAsecName implements Comparator
	{

		@Override
		public int compare(Object o1, Object o2) {
			
			Student s1 = (Student)o1;
			Student s2 = (Student)o2;
			
			String i = s1.name;
			String j = s2.name;
			
			return i.compareTo(j);
		}
		
	}
