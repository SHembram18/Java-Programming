/*
 * PROGRAM   : To find the gcd of any two integer values using a method findGCD()
 				Where values are run-time-input through BufferedReader class
 * FILE      : Gcd.java
 * CREATED BY: Santosh Hembram
 * DATED     : 09/09/20
 */
 	import java.io.*;
	class Gcd{

		 public static void main(String args[]) throws Exception{

		 	int num1,num2,gcd_val;

		 	InputStreamReader is = new InputStreamReader(System.in);
		 	BufferedReader br = new BufferedReader(is);

		 	System.out.print("Enter any two number: ");
		 	num1 = Integer.parseInt( br.readLine() );
		 	num2 = Integer.parseInt( br.readLine() );

		 	gcd_val = findGCD(num1,num2);
		 	System.out.println("The GCD of "+num1+" and "+num2+" is: "+gcd_val);
			
		}

		public static int findGCD(int n1, int n2){

			int value=0,i;
			for( i=1; i<=n1 && i<=n2; i++ )
			{
				if( (n1%i==0) && (n2%i==0) )
					 value = i;
		 	}
		 	return value;
		}
	} 				

