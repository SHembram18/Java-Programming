// PROGRAM	: Writa a Java program to convert Fahrenheit to Celcius
// FILE		: Convert.java
// CREATED BY:SANTOSH HEMBRAM
// DATED	: 31-08-20

	import java.util.*;
	
	class Convert
	{
		public static void main(String args[])
		{
			double far;
			double cel;
			
			System.out.print("Fahrenheit = ");
			
			Scanner sc = new Scanner(System.in);
			far = sc.nextDouble();
			
			cel = (far - 32) / 1.8;
			
			System.out.println("After converting Celcius = "+cel);
			
		}
	}
