package com.Arrays;
import java.util.Arrays; 
public class PrintEvenNumberAtEvenIndexAndOddAtOddIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		    int[] array_nums = {5, 7, 2, 4, 9};
			System.out.println("Original Array: "+Arrays.toString(array_nums)); 
			int ctr = 0;
			for(int i = 0; i < array_nums.length; i++)
			{
				if(array_nums[i] % 2 == 0)
					ctr++;
			}
			System.out.println("Number of even numbers : "+ctr);
			System.out.println("Number of odd numbers  : "+(array_nums.length-ctr));
		 }

	}
/*Original Array: [5, 7, 2, 4, 9]
Number of even numbers : 2
Number of odd numbers  : 3
*/

