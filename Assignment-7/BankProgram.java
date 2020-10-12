/*
 * PROGRAM    : To create an abstract class "Bank" having abstract methods like getRateOfIntrest() and getBalance(). Create a subclasses like SBI, PNB, BOI, IOB, UCO to find rate-of-intrest, balance of each bank. 
 * FILE       : BankProgram.java
 * CREATED BY : Santosh Hembram
 * DATED      : 05-10-20
 */
import java.util.*;
abstract class Bank {

	abstract float getRateOfIntrest();
	abstract float getBalance(float rof);
	void BalanceInput(){

	}
}

class SBI extends Bank {

	float fixDeposit,balance;
	void BalanceInput() {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your amount to be deposit in SBI: ");
		fixDeposit = sc.nextFloat(); 
	}
	float getRateOfIntrest(){

		return 7.5f;  
		
	}
	float getBalance(float rof) {

		balance = ( (fixDeposit * rof) / 100 ) + fixDeposit ; 
		return balance;
	}

}


class PNB extends Bank {

	float fixDeposit,balance;
	void BalanceInput() {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your amount to be deposit in PNB: ");
		fixDeposit = sc.nextFloat(); 
	}
	float getRateOfIntrest(){

		return 5.0f;  
		
	}
	float getBalance(float rof) {

		balance = ( (fixDeposit * rof) / 100 ) + fixDeposit ; 
		return balance;
	}

}

class BOI extends Bank {

	float fixDeposit,balance;
	void BalanceInput() {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your amount to be deposit in BOI: ");
		fixDeposit = sc.nextFloat(); 
	}
	float getRateOfIntrest(){

		return 4.25f;  
		
	}
	float getBalance(float rof) {

		balance = ( (fixDeposit * rof) / 100 ) + fixDeposit ; 
		return balance;
	}

}

class IOB extends Bank {

	float fixDeposit,balance;
	void BalanceInput() {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your amount to be deposit in IOB: ");
		fixDeposit = sc.nextFloat(); 
	}
	float getRateOfIntrest(){

		return 3.75f;  
		
	}
	float getBalance(float rof) {

		balance = ( (fixDeposit * rof) / 100 ) + fixDeposit ; 
		return balance;
	}

}

class UCO extends Bank {

	float fixDeposit,balance;
	void BalanceInput() {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your amount to be deposit in UCO: ");
		fixDeposit = sc.nextFloat(); 
	}
	float getRateOfIntrest(){

		return 2.50f;  
		
	}
	float getBalance(float rof) {

		balance = ( (fixDeposit * rof) / 100 ) + fixDeposit ; 
		return balance;
	}

}

class BankProgram {

	public static void main(String[] args) {
		
		Bank obj;

		obj = new SBI();
		
		obj.BalanceInput();
		float rofSBI = obj.getRateOfIntrest();
		float balSBI =  obj.getBalance(rofSBI);

		System.out.println("SBI Rate of Interest: "+rofSBI+"%");
		System.out.println("Balance = "+balSBI);
		System.out.println("--------------------------------------");

		obj = new PNB();

		obj.BalanceInput();
		float rofPNB = obj.getRateOfIntrest();
		float balPNB =  obj.getBalance(rofPNB);

		System.out.println("PNB Rate of Interest: "+rofPNB+"%");
		System.out.println("Balance = "+balPNB);
		System.out.println("--------------------------------------");

		obj = new BOI();

		obj.BalanceInput();
		float rofBOI = obj.getRateOfIntrest();
		float balBOI =  obj.getBalance(rofBOI);

		System.out.println("PNB Rate of Interest: "+rofBOI+"%");
		System.out.println("Balance = "+balBOI);
		System.out.println("--------------------------------------");

		obj = new IOB();

		obj.BalanceInput();
		float rofIOB = obj.getRateOfIntrest();
		float balIOB =  obj.getBalance(rofIOB);

		System.out.println("PNB Rate of Interest: "+rofIOB+"%");
		System.out.println("Balance = "+balIOB);
		System.out.println("--------------------------------------");

		obj = new UCO();

		obj.BalanceInput();
		float rofUCO = obj.getRateOfIntrest();
		float balUCO =  obj.getBalance(rofUCO);

		System.out.println("PNB Rate of Interest: "+rofUCO+"%");
		System.out.println("Balance = "+balUCO);
		System.out.println("--------------------------------------");



	}

}
