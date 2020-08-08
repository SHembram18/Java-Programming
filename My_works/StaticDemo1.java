// Accesing Static variables in a more than one class 
	
	class Demo
	{
		static int a=10;
		
		static void display()
	
		{
			System.out.println("STATIC METHOD");
		}
	}
	
	class StaticDemo1
	{
		public static void main(String args[])
		{
			System.out.println(Demo.a);
			Demo.display();
		}
	}
