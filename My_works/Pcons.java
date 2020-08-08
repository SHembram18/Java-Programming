//Parameterised Constructor
	
	class Pcons
	{
		String name;
		int r_no;
		
		Pcons()
		{
			name= "Santosh Hembram";
			r_no  = 42;
		}
		
		Pcons(String str,int n)
		{
			name = str;
			r_no = n;
		}
		public static void main(String args[])
		{
			Pcons s1 = new Pcons(); /*Default Constructor*/
			Pcons s2 = new Pcons("Bhawani",11); /*Parameterised Constructor*/
			
			System.out.println(s1.name);
			System.out.println(s1.r_no);
			
			System.out.println(s2.name);
			System.out.println(s2.r_no);
			
		}
	}
	
