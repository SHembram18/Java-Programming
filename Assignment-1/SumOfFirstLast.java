// PROGRAM	: Write a Java program to calculate the sum of first and last digit of a 5 digit integer given as command line
// FILE		:SumOfFirstLast.java
// CREATED BY: SANTOSH HEMBRAM
// DATED	: 31-08-20

	
	class SumOfFirstLast
	{
		public static void main(String args[])
		{
			int num,first,last,sum;
			
			num = Integer.parseInt(args[0]);
			
			System.out.println("Entered five digit number is: "+num);
			
			first = num / 10000;
			last = num % 10;
			
			System.out.println("first digit = "+first);
			System.out.println("last digit = "+last);
			
			sum = first + last;
			
			System.out.println("The sum of first & last digit is = "+sum);
		}
	}
