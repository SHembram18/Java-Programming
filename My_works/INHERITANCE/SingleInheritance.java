// Single-Inheritance

class P
{
	int a =10;
	void display()
	{
		System.out.println("PARENT CLASS");
	}
}
class C extends P
{
	int b=20;
	void show()
	{
		System.out.println("CHILD CLASS");
	}
	
}
class Inherit
{
	public static void main(String args[])
	{
		C obj = new C();
		System.out.println(obj.b);
		obj.show();
		
		System.out.println(obj.a);
		obj.display();
	}
}
