//Accessing Static block in one class 
	
	class StaticDemo2
	{
		static int a=10; /*STATIC VARIABLE*/
		
		
		static void display() /* STATIC METHOD */
	
		{
			System.out.println("STATIC METHOD");
		}
		static /* STATIC BLOCK */
		{
			System.out.println("Welcome to STATIC BLOCK");
		}
		public static void main(String args[])
		{
			System.out.println("MAIN METHOD");
			System.out.println(StaticDemo2.a);
			StaticDemo2.display();
		}
	}
