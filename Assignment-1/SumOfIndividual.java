// PROGRAM : Write a Java program to find the sum of digits of a four digit integer
// fILE	   : SumOfIndividual.java
// CREATED BY: SANTOSH HEMBRAM
// DATED    : 31-08-20
	
		import java.util.*;
		class SumOfIndividual
		{
			public static void main(String args[])
			{
				
				int num,sum;
				
				System.out.println("Enter a four digit number: ");
				Scanner sc = new Scanner(System.in);
				
				num = sc.nextInt();
				
				sum = (num%10) + ((num%100)/10) + ((num % 1000)/100) + (num/1000) ;
				
				System.out.print("Sum of the individual digits is = "+sum);
			}
		}
