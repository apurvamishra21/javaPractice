class Prime_Palindrome_ArmStrong
{
	public static void main(String[] args)
	{
		Prime_Palindrome_ArmStrong ppa = new Prime_Palindrome_ArmStrong();
		ppa.prime(3);
		ppa.palindrome(121);
		ppa.armstrong(9474);
	}
	
	public void prime(int num)
	{
		int factor = 0 ;
		
		for(int i = 1 ; i <= num ; i++)
		{
			if(num % i == 0)
			{
				factor ++;
			}
			
			
		}
		System.out.println((factor == 2 ) ? num + " : is a prime number " : num + "  : is not a prime number " );
	
	}
	
	public void palindrome(int num)
	{
		
		int temp = num ;
		int sum = 0 ;
		while(temp != 0)
		{
			int rem = temp % 10 ;
			sum = sum * 10 + rem ;
			temp = temp / 10 ;
		}
	
	System.out.println((sum == num ) ? num + " : is a palindrome number "  :  num + " : is not a palindrome number " );	
	}
	
	public void armstrong(int num)
	{
		int sum = 0 ;
		int temp = num ;
		int count = 0 ;

		while(temp != 0)
		{
			temp = temp / 10 ;
			count ++ ;
		}
		
		temp = num ;
		
		while(temp != 0)
		{
			
			int rem = temp % 10 ;
			int prod = 1 ;
			
			for(int i = 1 ; i <= count ; i++)
			{
				prod = prod * rem ;
				
				
			}
			sum = sum + prod ;
			temp = temp / 10 ;
		}
			System.out.println((sum == num ) ? num + " : is a armstrong number " : num + "  : is not a armstrong number " );
			
		}
	}
		
