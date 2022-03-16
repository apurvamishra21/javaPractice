package com.collections;
import java.util.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Scanner;
public class RemoveDuplicatesFromCollection2 {
	
   
        public static void main(String[] args) {
        	

         System.out.println("Enter a number : ");
        	
        	Scanner in = new Scanner(System.in);
        	
        	int arraySize = in.nextInt();
        	int subArraySize = in.nextInt();
        	
        	ArrayDeque<Integer>  subArray = new ArrayDeque<Integer>(subArraySize);
        	LinkedList<Integer> uniqueNumbers = new LinkedList<Integer>();
        	
        	int currentUniqueCount = 0;
        	
        	for(int i = 0; i < arraySize && currentUniqueCount < subArraySize; i++) {
        		int number = in.nextInt();
        		if(subArraySize == subArray.size())
        			subArray.poll();
        		subArray.offer(number);
        		
        		uniqueNumbers.clear();
        		for(int n : subArray) {
        			if(!uniqueNumbers.contains(n))
        				uniqueNumbers.add(n);
        		}
        		
        		currentUniqueCount = Math.max(currentUniqueCount, uniqueNumbers.size());
        	}
        	in.close();
        	System.out.println(currentUniqueCount);
        }


    }