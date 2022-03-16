package com.String;
import java.io.*;
import java.util.Arrays;
public class SortNamesAlphabetically {
	

	// Java Program to Sort Names in an Alphabetical Order
	
	  
//	
	    public static void main(String[] args)
	    {
//	        // storing input in variable
//	        int n = 4;
//	        
//	        // create string array called names
//	        String names[]
//	            = { "Rahul", "Ajay", "Gourav", "Riya" };
//	        String temp;
//	        for (int i = 0; i < n; i++) {
//	            for (int j = i + 1; j < n; j++) {
//	                
//	                // to compare one string with other strings
//	                if (names[i].compareTo(names[j]) > 0) {
//	                    // swapping
//	                    temp = names[i];
//	                    names[i] = names[j];
//	                    names[j] = temp;
//	                }
//	            }
//	        }
//	        
//	        // print output array
//	        System.out.println(
//	            "The names in alphabetical order are: ");
//	        for (int i = 0; i < n; i++) {
//	            System.out.println(names[i]);
//	        }
//	    }
//	}

/*// Java Program to Sort Names in an Alphabetical Order using sort function
import java.io.*;
import java.util.*;
  
class GFG {
    public static void main(String[] args)
    {
        // storing input in variable
        int n = 4;
        // create string array called names
        String names[]
            = { "Rahul", "Ajay", "Gourav", "Riya" };
        // inbuilt sort function
        Arrays.sort(names);
        // print output array
        System.out.println(
            "The names in alphabetical order are: ");
        for (int i = 0; i < n; i++) {
            System.out.println(names[i]);
        }
    }
}*/

//defining an array of type String  
String[] countries = {"Zimbabwe", "South-Africa", "India", "America", "Yugoslavia", " Australia", "Denmark", "France", "Netherlands", "Italy", "Germany"};  
int size = countries.length;  
//logic for sorting   
for(int i = 0; i<size-1; i++)   
{  
for (int j = i+1; j<countries.length; j++)   
{  
//compares each elements of the array to all the remaining elements  
if(countries[i].compareTo(countries[j])>0)   
{  
//swapping array elements  
String temp = countries[i];  
countries[i] = countries[j];  
countries[j] = temp;  
}  
}  
}  
//prints the sorted array in ascending order  
System.out.println(Arrays.toString(countries));  
}  
}  



