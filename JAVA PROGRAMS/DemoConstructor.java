class DemoConstructor
{
	int num = 20;
	
	public void m1(int num)
	{
		System.out.println(num);
		DemoConstructor dc = new DemoConstructor();
		System.out.println(dc.num);
	}
	
 	public static void main(String[] args)
	{
		DemoConstructor dc = new DemoConstructor();
		dc.m1(30);
	}
}

 