/* WAP to check the use of class and object in java */

	import java.util.*;
	
	class DemoClass
	{
		int no1,no2,res;
		String name;
		void input()
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter values");
			no1 = sc.nextInt();
			no2 = sc.nextInt();
			System.out.println("Enter value for string");
			name = sc.next();
		}
		void add()
		{
			res = no1+no2;
		}
		void show()
		{
			System.out.println(res+" is the sum of "+no1+"and"+no2);
			System.out.println("Name is "+name);
		}
		public static void main(String args[])
		{
			DemoClass ob = new DemoClass(); //Objectis created
			ob.input();
			ob.add();
			ob.show();
		}
	}
