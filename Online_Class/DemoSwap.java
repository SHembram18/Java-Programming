/* WAP to swap the values of two different classes*/

	import java.util.*;
	
	class First
	{
			int no1;
			void input1()
			{
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter first value");
				no1 = sc.nextInt();
			}
			void show1()
			{
					System.out.println("Value of no1= "+no1);
			}
	}
	class Second
	{
			int no2;
			void input2()
			{
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter second value");
				no2 = sc.nextInt();
			}
			void show2()
			{
					System.out.println("Value of no2= "+no2);
			}
	}
	class DemoSwap
	{
			void swap(First ob1,Second ob2)
			{
				int temp;
				temp = ob1.no1;
				ob1.no1 = ob2.no2;
				ob2.no2 = temp;
			}
			
			
			public static void main(String args[])
			{
					First ob1 = new First();
					ob1.input1();
					Second ob2 = new Second();
					ob2.input2();
					System.out.println("Before swapping the values are");
					ob1.show1();
					ob2.show2();
					DemoSwap ob3 = new DemoSwap();
					ob3.swap(ob1,ob2);
					System.out.println("After the swapping the values are");
					ob1.show1();
					ob2.show2();
			}
	}
					
					
