package com.Sorting;

public class BubbleSort_Array {
	
	public static void main(String[] args) {
		
		//correct approach 1
		int[] numbers = { 5, 8, 14, 1, 5678 };
		int tempVar;
		for (int i = 0; i < numbers.length-1; i++)
		{
		   for(int j = 0; j < numbers.length-i-1; j++)
		   {
		            if(numbers[j] > numbers[j + 1])
		            {
		                   tempVar = numbers[j + 1];
		                   numbers[j + 1]= numbers[j];
		                   numbers[j] = tempVar;
		            }
		   }
		}
		for (int i = 0; i < numbers.length; i++)
		{
		     System.out.println(numbers[i]);
		}
			}
		
	}
		
	
		
		


