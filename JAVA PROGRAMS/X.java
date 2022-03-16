class X
{
	X(String s)
	{
		System.out.println("X constructor running");
	}
}
class Y extends X
{
	Y()
	{
		this(10);
		System.out.println("Y constructor running 1");
	}
	Y(int i)
	{
		super("hello");
		System.out.println("Y constructor running 2");
	}
}
class DemoConstructor
{
	public static void main(String[] args){
	
		Y y = new Y();
	}
}

