//Method Overloading

class A
{
	void add()
	{
		int a = 10,b=20;
		int c = a+b;
		System.out.println("SUM = "+c);
	}
	void add(int x,int y)
	{
		int z = x+y;
		System.out.println("Sum ="+z);
	}
}
class Moverload
{
	public static void main(String arg[])
	{
		A obj = new A();
		obj.add();
		obj.add(40,50);
	}
}
