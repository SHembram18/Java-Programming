/*
 * PROGRAM    : To design a class named "Bank" with data members such as rateOfIntrset,
 				 name along with required methods and constructors. Design new classes named SBI,ICICI,
 				 those inherit the base class "Bank" with their own members.Create objects of classes "SBI" and "ICICI" and final static data members.
 * FILE       : Bank.java
 * CREATED BY : Santosh Hembram
 * DATED      : 28-09-20
 *
 */

import java.util.*;
class Bank {
	 
 	 String name,acctNo;

 	public void accountInfo() {
 	 	
 	 	Scanner sc1 = new Scanner(System.in);

 		System.out.print("Enter the Account Holder Name: ");
 		name = sc1.nextLine();

 	 	System.out.print("Enter your Account Number: ");
 	 	acctNo = sc1.nextLine();
 	}

 	public void show() {

 	 	System.out.println("Account Holder Name: "+name);
 	 	System.out.println("Account Number: "+acctNo);

 	} 	

}
class SBI extends Bank {

 	String acType,phNum,ifsc,micr;
	 
 	public float rateOfInterest() { 

 			return 6.25f;
 	}

 	void details() {

 		Scanner sc = new Scanner(System.in);
 	
 		System.out.print("Account Type: ");
 		acType = sc.nextLine();

 		System.out.print("Enter your Mobile number: ");
 		phNum = sc.nextLine();

 		System.out.print("Enter the IFSC code: ");
 		ifsc = sc.nextLine();

 		System.out.print("Enter the MICR code: ");
 		micr = sc.nextLine();
 	}

 	void display() {
 
 		System.out.println("=============== Welcome to SBI ======================");
 		System.out.println("Account Type: "+acType);
 		System.out.println("IFSC code: "+ifsc);
 		System.out.println("MICR code: "+micr);
 		System.out.println("rate Of Interest= "+rateOfInterest());

 	}

}
class ICICI extends Bank {

	String acType,phNum,ifsc,micr;
	 

 	public float rateOfInterest(){

 		return 4.0f;
 	}

 	void details() {

 		Scanner sc = new Scanner(System.in);
 	
 		System.out.print("Account Type: ");
 		acType = sc.nextLine();

 		System.out.print("Enter your Mobile number: ");
 		phNum = sc.nextLine();

 		System.out.print("Enter the IFSC code: ");
 		ifsc = sc.nextLine();

 		System.out.print("Enter the MICR code: ");
 		micr = sc.nextLine();
 	}

 	void display() {
 
 		System.out.println("=============== Welcome to ICICI  ======================");
 		System.out.println("Account Type: "+acType);
 		System.out.println("IFSC code: "+ifsc);
 		System.out.println("MICR code: "+micr);
 		System.out.println("rate Of Interest= "+rateOfInterest());

 	}

 	

}

class CreatingAccount {

 	final static float balance = 1000.00f;


 	public static void main(String[] args) {

 		SBI obj = new SBI();
 		System.out.println("============= Creating Account in SBI ==========================");
 		obj.accountInfo();
 		obj.details();

 		obj.display();
 		obj.show();

 		System.out.println("Balance = "+balance);
 		System.out.println(" ");

 		ICICI obj1 = new ICICI();
 		System.out.println("================Creating Account in ICICI =====================");
 		obj1.accountInfo();
 		obj1.details();

 		obj1.display();
 		obj1.show();

 		System.out.println("Balance = "+balance);


 	}
}
