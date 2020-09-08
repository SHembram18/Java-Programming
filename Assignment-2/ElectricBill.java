/*
 *
 * PROGRAM:	JAVA program to compute electric bill of a consumer for a consumer wih following criteria:
			Units Consumed 			Rate
			--------------			----
			1st 50 Units 			Rs.125
			upto 100 Units			Rs. 4.5/unit extra
			upto 200 Units			Rs. 6.0/units extra
			upto 300 Units    		Rs. 8.50/units extra
			Above 300 units  		Rs. 10/units extra

			Accept unit consumed through run-time input with bufferedReader
 *
 * FILE      : ElectricBill.java
 * CREATED BY: Santosh Hembram
 * DATED     : 07-09-20
 *
 *
 */

import java.io.*;
class ElectricBill{

	public static void main(String args[])throws Exception{

		float pay,total;
		float extra;
	

		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);

		System.out.print("Enter the unit consumed by the consumer: ");

		int unit = Integer.parseInt( br.readLine() );
		System.out.println("Units Usage = "+unit);

		if (unit<=50) {

			pay = 125;
			extra = 0;
			System.out.println("The total Bill Amount[pay + extra]: "+pay+ " + "+ extra+ " = "+pay);
			
		}
		else if(unit<=100) {

			pay = 125;
			extra = (float)(unit-50) * (float)4.5;
			total = pay + extra;
			System.out.println("The total Bill Amount[pay + extra]: "+pay+ " + "+ extra+ " = "+total);

		}
		else if (unit<=200) {

			pay = 125;
			extra = (float)(50 * (float)4.5) + (float)(unit-100) * (float)6.0;
			total = pay + extra ;
			System.out.println("The total Bill Amount[pay + extra]: "+pay+ " + "+ extra+ " = "+total);

		}
		else if (unit<=300) {

			pay = 125;
			extra = (float)(50 * (float)4.5) + (float)(100 * (float)6.0) + (float)(unit-100) * (float)8.50;
			total = pay + extra;
			System.out.println("The total Bill Amount[pay + extra]: "+pay+ " + "+ extra+ " = "+total);
			
		}
		else if(unit>300) {

			pay = 125;
			extra = (float)(50 * (float)4.5) + (float)(100 * (float)6.0) + (float)(100 * (float)8.50) + (float)(unit-100) * (float)10.0;
			total = pay + extra;
			System.out.println("The total Bill Amount[pay + extra]: "+pay+ " + "+ extra+ " = "+total);
			

		}



	}
	}
