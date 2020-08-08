//Accessing Static block in more than one class 
	
	class Demo
	{
		static int a=10;
		
		static void display()
	
		{
			System.out.println("STATIC METHOD");
		}
		static
		{
			System.out.println("Welcome to STATIC BLOCK");
		}
	}
	
	class StaticDemo3
	{
		public static void main(String args[])
		{
			System.out.println("MAIN METHOD");
			System.out.println(Demo.a);
			Demo.display();
		}
	}
