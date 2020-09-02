// PROGRAM	: Write a Java program to find the greatest number among three number,given as run time input
// FILE		: GreatestNum.java
// CREATED BY:SANTOSH HEMBRAM
// DATED	: 31-08-20

	class GreatestNum
	{
		public static void main(String args[])
		{
			int a,b,c,temp,lar;
			
			a = Integer.parseInt(args[0]);
			b = Integer.parseInt(args[1]);
			c = Integer.parseInt(args[2]);
			
			System.out.println("The numbers are : a = "+a+ " , b = "+b+ " , c = "+c);

			temp = (a < b) ? b : a ;
			lar = (temp > c) ? temp : c ;
			
			System.out.println("The greatest number is : "+lar);
		}
	}
