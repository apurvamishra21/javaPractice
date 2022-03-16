class Prime_Armstrong
{
	public static void main(String[] args)
	{
		Prime_Armstrong pa = new Prime_Armstrong();
		pa.prime();
		
		
		armstrong();
	}

	public void prime()
	{
		int num = 23 ;
		int factor = 0;

		for(int i = 1 ; i <= num ; i++)
		{
			if(num % i == 0)
			{
				factor ++;
			}
		}
		String primeSuccessmsg = (factor == 2) ? num + " : is a prime no " : num + " : is not a prime no " ;
		System.out.println(primeSuccessmsg);
	}
	public static void armstrong()
	{
		int num = 370 ;
		int temp = num ;
		int sum = 0;
		int count = 0;

		while(temp != 0)
		{
			temp = temp/10;
			count ++ ;
		}
			
			temp = num ;

			while(temp != 0){
		
			int rem = temp % 10 ;
			int prod = 1 ;
			
			for(int i = 1 ; i <=count ; i++)
			{
				prod = prod * rem ;
			}
			sum = sum + prod;
			temp = temp / 10 ;
		}
		String armstrongSuccessmsg = (num == sum) ? num + " : is a armstrong no " : num + " : is not a armstrong no " ;
		System.out.println(armstrongSuccessmsg);
	}
}	
		
		

		
		
		