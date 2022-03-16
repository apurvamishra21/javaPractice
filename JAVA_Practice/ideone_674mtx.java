/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	int[] numbers = { 5, 8, 14, 1, 5678 };
int tempVar;
for (int i = 0; i < numbers.length-1; i++)
{
   for(int j = 0; j < numbers.length-i-1; j++)
   {
            if(numbers[j] > numbers[j + 1])
            {
                   tempVar = numbers [j + 1];
                   numbers [j + 1]= numbers [j];
                   numbers [j] = tempVar;
            }
   }
}
for (int i = 0; i < numbers.length; i++)
{
     System.out.println(numbers[i]);
}
	}
}