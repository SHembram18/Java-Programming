// Implementing Variables
	
	class Variable
	{
		static int c = 30;/*Static Variable*/
		int a=10; //Instance Variable
		public static void main(String args[])
		{
			int b=20;/*LOCAL VARIABLE*/
			Variable obj = new Variable();
			System.out.println("Instance Variable = "+obj.a);
			System.out.println("Local Variable = "+b);
			System.out.println("Static Variable = "+c);
		}
	}	
