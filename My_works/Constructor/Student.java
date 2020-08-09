//Default Constructor
	
	class Student
	{
		String name;
		int r_no;
		Student()
		{
			name= "Santosh Hembram";
			r_no  = 42;
		}
		public static void main(String args[])
		{
			Student s1 = new Student();
			System.out.println(s1.name);
			System.out.println(s1.r_no);
			
		}
	}
	
