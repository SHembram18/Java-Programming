/*
 * PROGRAM: To create a class named "Person" with properties like id,name,name,gender.bloodgroup,nationality along with required methods and constructors 
 * FILE: PersonDetail.java
 * CREATED BY: Santosh Hembram
 * DATED: 21-09-20
 *
 */

import java.util.*;
class PersonDetail{

		int id;
		String name,nationality;
		char gender,bloodgroup;

	public void InputInfo(){

		Scanner sc = new Scanner(System.in);
		
			
				
			System.out.print("Enter your Name: ");	
			name = sc.nextLine();

			System.out.print("Enter your Nationality: ");
			nationality = sc.nextLine();

			System.out.print("Enter your Gender[M/F]:");
			gender = sc.next().charAt(0);

			System.out.print("Enter your Blood Group: ");
			bloodgroup = sc.next().charAt(0);

	}
	public  void DisplayInfo(){

		
		System.out.println("ID Number: "+id);
		System.out.println("NAME: "+name);
		System.out.println("NATIONALITY: "+nationality);
		System.out.println("GENDER: "+gender);
		System.out.println("BLOOD_GROUP: "+bloodgroup);

	}
	PersonDetail(){

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter your ID Number: ");
		id = sc.nextInt();
			

		
	}

	public static void main(String[] args) {

		System.out.println("============Enter for the 1st Person==============");
		PersonDetail obj1 = new PersonDetail();
		 obj1.InputInfo();

		 System.out.println("============Enter for the 2nd Person===================");
		PersonDetail obj2 = new PersonDetail();
		 obj2.InputInfo();

		 System.out.println("=======================DISPLAYING THE DATA =========================");
		 obj1.DisplayInfo();

		 System.out.println(" ");

		 obj2.DisplayInfo();
		
	} 
}	
