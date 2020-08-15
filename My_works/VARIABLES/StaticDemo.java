// Accesing Static variables in a same class 
	
	class StaticDemo
	{
		static int a=10;
		
		static void display()
		{
			System.out.println("STATIC METHOD");
		}
		public static void main(String args[])
		{
			System.out.println(a);
			display();
		}
	}
