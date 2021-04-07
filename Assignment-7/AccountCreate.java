/* PROGRAM    : To create an Abstract class named "Account" with members like acc_type, balance, min_balance, acc_holder_name, mobile_no and abstract methods
 				getBalance(), getAccType(), getMobileNo(), getAccHoldername(). Create two subclasses like "SavingAccount" and "CurrentAccount" 
 				to create their objects and get their information through abstract methods.

 * FILE       : AccountCreate.java
 * CREATED BY : Santosh Hembram
 * DATED      : 05/10/20
 *
 */ 

 import java.util.*;
 abstract class Account {


 	abstract float getBalance(); 
 	abstract String getAccType(); 
 	abstract long getMobileNo();	
 	abstract String getAccHoldername(); 	

 	String acc_type, acc_holder_name;
 	float balance, min_balance;
 	long mobile_no; 
}

class SavingAccount extends Account {

	Scanner sc = new Scanner(System.in);

 	float getBalance() {

 		System.out.println("Enter your balance amount: ");
 		balance = sc.nextFloat();
 		return balance;
 	}

 	long getMobileNo() {

 		System.out.println("Enter your mobile Number: ");
 		mobile_no = sc.nextLong();
 		sc.nextLine();
 		return mobile_no;
 	}

 	String getAccHoldername() {

 		System.out.println("Enter Account Holder Name: ");
 		acc_holder_name = sc.nextLine();
 		return acc_holder_name;
 	}

 	String getAccType() {

 		return acc_type = "Saving";
 	}

}

class CurrentAccount extends Account {

	Scanner inp = new Scanner(System.in);

 	float getBalance() {

 		System.out.println("Enter your balance amount: ");
 		balance = inp.nextFloat();
 		return balance;
 	}

 	long getMobileNo() {

 		System.out.println("Enter your mobile Number: ");
 		mobile_no = inp.nextLong();
 		return mobile_no;
 	}

 	String getAccHoldername() {

 		System.out.println("Enter Account Holder Name: ");
 		acc_holder_name = inp.nextLine();
 		return acc_holder_name;
 	}
 	String getAccType() {

 		return	acc_type = "Current";
 	
 	}


}

public class AccountCreate {

 	public static void main(String[] args) {

 		Account obj = new SavingAccount();

 		String name =  obj.getAccHoldername();
 		float bal = obj.getBalance();
 		long mob = obj.getMobileNo();	
 		String a_type = obj.getAccType(); 

 		System.out.println("============== Displaying the data ================");
 		System.out.println("Account Holder Name: "+name);
 		System.out.println("Mobile number: "+mob);
 		System.out.println("Account Type: "+a_type);
 		System.out.println("Balance = "+bal);

 		System.out.println("\n");


 		Account obj2 = new CurrentAccount();

 		String name2 =  obj2.getAccHoldername();
 		float bal2 = obj2.getBalance();
 		long mob2 = obj2.getMobileNo();	
 		String a_type2 = obj2.getAccType(); 

 		System.out.println("============== Displaying the data ================");
 		System.out.println("Account Holder Name: "+name2);
 		System.out.println("Mobile number: "+mob2);
 		System.out.println("Account Type: "+a_type2);
 		System.out.println("Balance = "+bal2);
		
 	}

}

