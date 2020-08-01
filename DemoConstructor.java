/* WAP to check the use of constructor in Java */

	import java.util.*;
	class DemoClass2
	{
		
			int no1,no2,res;
			DemoClass2(int temp1,int temp2)
			{	
					no1 = temp1;
					no2 = temp2;
			}
			void add()
			{
					res = no1 + no2;
			}
			void show()
			{
					System.out.println(res+" is the sum of "+no1+" and "+no2);
			}
		
	}
	class DemoConstructor
	{
			public static void main(String args[])
			{
					DemoClass2 ob = new DemoClass2(12,25); //Object is created and constructor is called automatically
					ob.add();
					ob.show();
					int no1,no2;
					Scanner sc = new Scanner(System.in);
					System.out.println("Enter valus");
					no1 = sc.nextInt();
					no2 = sc.nextInt();
					DemoClass2 ob1 = new DemoClass2(no1,no2);
					ob1.add();
					ob1.show();
			}
	}
