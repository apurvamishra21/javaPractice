class DemoConstructor1
{
	int num = 20;
	
	public void m1(int num)
	{
		System.out.println(num);
		
		System.out.println(this.num);
	}
	
 	public static void main(String[] args)
	{
		DemoConstructor dc1 = new DemoConstructor();
		dc1.m1(30);
		DemoConstructor dc2 = new DemoConstructor();
		dc2.num = 50;
		dc2.m1(30);
		
	}
}

 