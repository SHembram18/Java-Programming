/* WAP to find GCD & LCM of two numbers*/

import java.util.Scanner;

class GCDLCM
{
	public static void main(String args[])
	{
		int num1,num2;
		int temp1,temp2,gcd,lcm;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first value");
		num1 = sc.nextInt();
		System.out.println("Enter the second value");
		num2 = sc.nextInt();
		
		temp1 = num1;
		temp2 = num2;
		
		while(num1 != num2)
		{
			if(num1 > num2)
			{
				num1 = num1 - num2;
			}
			else
			{
				num2 = num2 - num1;
			}
		}
		gcd = num1;
		lcm = (temp1 * temp2)/gcd;
		
		System.out.println("The GCD and LCM of "+temp1+" and "+temp2+" are "+gcd+","+lcm);
	}
	
}
