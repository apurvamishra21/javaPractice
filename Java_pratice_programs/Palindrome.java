//WAP for a palindrome number by regular method and call it using a main()
class Palindrome
{
	int num = 323 ;
	int sum = 0 ;
	int temp = num ;

	public void rev()
	{
		while(temp != 0)
		{
			int rem = temp % 10 ;
			sum = sum * 10 + rem;
			temp = temp / 10 ;
		}
		String PalindromeSuccessMsg = (sum == num) ?   num + ": is a palindrome" :  num + " : is not a palindrome " ;
		System.out.println(PalindromeSuccessMsg);
	}
	public static void main(String[] args)
	{
		Palindrome pd = new Palindrome();
		pd.rev();
	}
}
//323: is a palindrome			 
		
		
		
		
	