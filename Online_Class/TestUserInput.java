/*Write a program to accept the input form user*/

	import java.util.*;
	
	class TestUserInput
	{
		public static void main(String args[])
		{
			int num;
			
			Scanner sc = new Scanner(System.in);//Predefined class to accept input from keyboard
			System.out.println("Enter the value");
			num = sc.nextInt();//Method is used from Scanner class
			System.out.println("The value of num is "+num);
			
		}
	}
