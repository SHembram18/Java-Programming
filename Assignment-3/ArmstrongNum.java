/*
 * PROGRAM   : To check an integer as ARMSTRONG or not using a method with run-time-input through Scanner class
 * FILE      : ArmstrongNum.java
 * CREATED BY: Santosh Hembram
 * DATED     : 09-09-20
 */
 
 	import java.util.*;
 	class ArmstrongNum{
 		public static void main(String[] args) {
 			
 			int num;

 			Scanner sc = new Scanner(System.in);

 			System.out.print("Enter a number: ");
 			num = sc.nextInt();

 			if( (isArmstrong(num)) == 1 )
 				System.out.println(+num+" is an Armstrong Number");
 			else
 				System.out.println(+num+" is not an Armstrong Number");

 		}

 		public static int isArmstrong(int num1) {

 			int temp,digit,sum=0;
 			temp = num1;

			while(num1!=0)
			{
				 digit = num1 % 10;
				 sum  = (digit * digit * digit) + sum;
				 num1 /= 10;
			}
			if(temp == sum)
				return 1;
			else
				return 0;
 			
 		}
}
 	
