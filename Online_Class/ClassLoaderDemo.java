//JAVA CODE TO DEMONSTRATE CLASS LOADER SUBSYSTEM

public class ClassLoaderDemo
{
	public static void main(String []args)
	{
		//string class is loaded by bootstrap loader,and
		//bootstrap loadeder is not java object,hence null
		System.out.println(String.class.getClassLoader());
		
		//classLoaderDemo class is loaded by Application loader
		System.out.println(ClassLoaderDemo.class.getClassLoader());
	}
}
