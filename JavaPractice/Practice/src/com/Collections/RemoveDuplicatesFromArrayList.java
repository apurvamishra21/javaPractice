package com.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromArrayList {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,2,2,5,3,4,5,6,7,8,9,10));
		
		//1.LinkedHashSet 
		
		LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>(numbers);
		
		//linkedhashset will remove all duplicates from the given list.
		ArrayList<Integer> numberswithoutduplicates = new ArrayList<Integer>(linkedHashSet);
		
		System.out.println(numberswithoutduplicates);
		
		//2.JDK 8 -Stream:
		
		ArrayList<Integer> marksList = new ArrayList<Integer>(Arrays.asList(1,2,3,2,2,3,1,4,5,6,7,8,9,7));
		List<Integer> marksListUnique = marksList.stream().distinct().collect(Collectors.toList());
		System.out.println(marksListUnique);
		
	}
	
}
//[1, 2, 5, 3, 4, 6, 7, 8, 9, 10]
