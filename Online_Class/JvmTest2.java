// A Java program to demonstrate working of a Class type object created by JVM to represent .class file in memory.
// Java code to demonstrate use of Class object created by JVM

import java.lang.reflect.Field;
	import java.lang.reflect.Method;
	
	public class JvmTest2
	{
		public static void main(String []args)
		{
			Student s1 = new Student();
			
			Class c1 = s1.getClass();
			System.out.println( c1.getName() );
			
			Method []m = c1.getDeclaredMethods();
		
		for(int i=0; i<m.length; i++)
			{
				System.out.println( m[i].getName() );
			}
			
			Field []f = c1.getDeclaredFields();
			for(int i=0; i<f.length; i++)
			{
				System.out.println(f[i].getName());
			}
		}
	}
	
	class Student
	{
		private String name;
		private int rollNo;
		public int age;
		public String getName()
		{
			return name;
		}
		public void setName(String sName)
		{
			this.name = sName;
			
		}
		public int getRollNo()
		{
			return rollNo;
		}
		public void setRollNo(int sRollNo)
		{
			this.rollNo = sRollNo;
		}
		
	}
