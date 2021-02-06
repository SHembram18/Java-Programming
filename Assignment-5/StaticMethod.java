/*
 * PROGRAM	 : To demonstrate the use of static method in java class
 * FILE		 : StaticMethod.java
 * CREATED BY: Santosh Hembram
 * DATED 	 : 21-09-20
 *
 */
import java.util.*;
class StaticMethod {
	
	static String name;
	static int rollNo;

	

	public static void Method(int num) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your name: ");
		name = sc.nextLine();

		rollNo = num;



	}

	public static void main(String[] args) {

		Method(42);

		System.out.println("Name = "+name);
		System.out.println("Roll no = "+rollNo);
		
		
	}
}