// A Java program to demonstrate working of a Class type object created by JVM to represent .class file in memory.
// Java code to demonstrate use of Class object created by JVM



	import java.lang.reflect.Field;
	import java.lang.reflect.Method;
	
	public class JvmTest
	{
		public static void main(String []args)
		{
			Student s1 = new Student();
			
			Class c1 = s1.getClass();
			System.out.println( c1.getName() );
			
			Method []m = c1.getDeclaredMethods();
			for(Method method :m)
			{
				System.out.println( method.getName() );
			}
			
			Field []f = c1.getDeclaredFields();
			for(Field field: f)
			{
				System.out.println(field.getName());
			}
		}
	}
	
	class Student
	{
		private String name;
		private int rollNo;
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
