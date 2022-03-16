package com.String;

import java.util.Arrays;
import java.util.Scanner;

public class SortStringAlphabeticallyApproach5 {
	
	public static void main(String[] args) {
		
		
		String str = "swadheenta";
		char[] arr = str.toCharArray();
		//using sort()
		//Arrays.sort(arr);
		char temp = 0;
		for(int i = 0 ; i < arr.length ; i++)
		{
			for(int j = i+1 ; j < arr.length ; j++)
			{
				if(arr[i] > arr[j]) // ascii value of characters will be compared
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				
				}
			}
		}
		System.out.println(new String(arr));
		
	}
	
}


