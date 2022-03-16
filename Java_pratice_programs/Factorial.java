class Factorial
{
	public static void main(String[] args)
	{
		int num = 13;
		int fact = 1 ;
		
		for(int i = num ; i >= 1 ; i--)
		{
			fact = fact * i;
		}
		System.out.print("Factorial of " + num + " is : " + fact);
		
	}
}
//1932053504 or fact = fact * num-- but this is easier