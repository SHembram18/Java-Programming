//Hierarchical Inheritance

	class P
	{
		int a=20;
		void display()
		{
			System.out.println("PARENT");
		}
	}
	class C extends P
	{
		int b=40;
		void show()
		{
			System.out.println("CHILD");
		}
		
	}
	class D extends P 
	{
		int c = 50;
		void dis()
		{
			System.out.println("CHILD2");
		}
	}
	class Hierarchy
	{
		public static void main(String args[])
		{
			C obj1 = new C();
			System.out.println(obj1.b);
			obj1.show();
			System.out.println(obj1.a);
			obj1.display();
			
			D obj2 = new D();
			System.out.println(obj2.c);
			obj2.dis();
			System.out.println(obj2.a);
			obj2.display();
		}
	}
