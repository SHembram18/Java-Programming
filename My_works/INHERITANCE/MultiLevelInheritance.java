//Multi-level Inheritance

	class P
	{
		int a=10;
		void display()
		{
			System.out.println("A");
		}
	}
	class C extends P 
	{
		int b =20;
		void dis()
		{
			System.out.println("B");
		}
	}
	class CChild extends C
	{
		int c =30;
		void show()
		{
			System.out.println("C");
		}
	}
	class MultiLevelInheritance
	{
		public static void main(String args[])
		{
			CChild obj = new CChild();
			System.out.println(obj.c);
			obj.show();
			
			System.out.println(obj.b);
			obj.dis();
			
			System.out.println(obj.a);
			obj.display();
			
		}
	}
