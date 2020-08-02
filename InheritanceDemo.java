/* WAP to implement single inheritance */
import java.util.*;
class Base
{
	int no1;
	void show()
	{
		System.out.println("Base Class");
	}
}
class Derived extends Base
{
	int no2;
	void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter values");
		no1 = sc.nextInt();
		no2 = sc.nextInt();
	}
	void show1()
	{
		System.out.println("Derived Class");
		System.out.println("Values are no1 = "+no1+" and no2 = "+no2);
	}
}
class InheritanceDemo
{
	public static void main(String args[])
	{
		Derived ob = new Derived();
		ob.input();
		ob.show();
		ob.show1();
	}
}
