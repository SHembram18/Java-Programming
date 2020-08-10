/* WAP to implement Multi-level inheritance */
import java.util.*;

class Base1
{
	int no1;
	void show()
	{
		System.out.println("Base Class");
	}
	
}
class Base2 extends Base1
{
	int no2;
	void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter values");
		no1 = sc.nextInt();
		no2 = sc.nextInt();
	}
}
class Derived1 extends Base2
{
	void show1()
	{
		System.out.println("Derived Class");
		System.out.println("Values are no1 = "+no1+" and no2 = "+no2);
	}
}
class InheritanceDemo1
{
	public static void main(String args[])
	{
		Derived1 ob = new Derived1();
		ob.input();
		ob.show();
		ob.show1();
	}
}
