package com.Sorting;
import java.util.ArrayList;


public class BubbleSort_ArrayList {
	
	
	
	  //  private static ArrayList<String> list = new ArrayList<String>();
//	static ArrayList<String> list = new ArrayList<String>();
//
//	    public static ArrayList<String> sortByName(String [] input) {
//	        String temp;
//	        for (int i=0; i< input.length; i++){
//	            for(int j= i; j< input.length-1; j++){
//	                char first = input[i].charAt(0);
//	                char sec = input[j +1].charAt(0);
//	                 if (first < sec)  {
//	                     temp = input[j +1];
//	                     input[j +1] = input[i];        
//	                     input[i] = temp;
//	                 }
//	             }
//	            list.add(input[i]);
//	         }
//
//	        return list;
//	    }
//
//	    public static void main(String[] args) {
//	        String string[] =  {"Ezen", "Allen" , "Wilker", "Kruden", "Crocket"};
//	        System.out.println(sortByName(string));
//	        
//	    }
//	}
	
	//import java.util.ArrayList;

	//public class SortALByBubbleSort {

	public static void main(String[] args) {

	ArrayList<Integer> l = new ArrayList<Integer>();

	l.add(42);
	l.add(12);
	l.add(72);
	l.add(53);
	l.add(29);

	System.out.println("List Before Sort : " + l);

	for(int i = 0; i < l.size() ; i++) {
	for(int j = i+1 ; j < l.size() ; j++) {//comparison will be done with next number so j = i + 1s r5
	if(l.get(i) > l.get(j)) {
	Integer temp = l.get(i);
	l.set(i, l.get(j));
	l.set(j, temp);
	}
	}
	}

	System.out.println("List After Sort : " + l);
	}
	}


