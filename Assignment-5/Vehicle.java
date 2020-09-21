/*
 * PROGRAM: To create a class named Vehicle with properties such as 
 chassis No, engine No, color, brand, variant, model and required methods.Add a static variable also. Initialize the static variable through static block. And , Implement it in the program.

 * FILE: Vehicle.java 
 * CREATED BY: Santosh Hembram 
 * DATED: 21-09-20
 */
import java.util.*;
class Vehicle {

    int chassisNo;
	String engineNo, color, model, variant;
	static String brand;

	public void VehicleInformation() { 

		System.out.print("Enter the Chassis Number: ");
		Scanner sc = new Scanner(System.in);
		chassisNo = sc.nextInt();
		sc.nextLine();

		System.out.print("Enter the Engine Number: ");
		engineNo = sc.nextLine();

		System.out.print("Enter the Color: ");
		color = sc.nextLine();

		System.out.print("Enter the Model: ");
		model = sc.nextLine();		

	}
	public void DisplayVehicleInformation() {

		System.out.println("Chassis Number = "+chassisNo);
		System.out.println("Engine Number = "+engineNo);
		System.out.println("Color = "+color);
		System.out.println("Model = "+model);
	}
	static {

		System.out.print("Enter the Brand: ");
		Scanner obj = new Scanner(System.in);
		brand = obj.nextLine();

		
	}

	public static void main(String[] args) {

		Vehicle obj = new Vehicle();
		Vehicle obj2 = new Vehicle(); 

		System.out.println("============Enter the status for 1st Vehicle================");
		obj.VehicleInformation();

		System.out.println("============Enter the status for the 2nd Vehicle==============");
		obj2.VehicleInformation();

		System.out.println(" ");

		System.out.println("=============DISPLAYING THE VEHICLE INFORMATION===============");

		System.out.println("Brand = "+brand);

		System.out.println(" ");

		obj.DisplayVehicleInformation();

		System.out.println(" ");

		obj2.DisplayVehicleInformation();
		
	}
	


 }
