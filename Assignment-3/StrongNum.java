/*
 */
	import java.util.*;
 	class StrongNum{

 		public static void main(String args[]){

 			int num;
 			System.out.print("Enter a number: ");
 			Scanner sc = new Scanner(System.in);
 			num = sc.nextInt();

 			
 
 			if( isStrong(num) == 1)
 				System.out.println(+num+" is a Strong Number");
 			else
 				System.out.println(+num+" is not a Strong Number");

 			
 	  
 		
 		}
 		public static int isStrong(int num){

 			int remainder,i,factorial,sum = 0;
 			int num1 = num;
 			while(num!=0){

 				 i=1;
 				 factorial = 1;
 				 remainder=num%10;

				while(i<=remainder) {

					factorial = factorial * i;
					i++;
				}
				sum = (sum+factorial);
				num/=10;
		}
		if(num1==sum)
				return 1;
		else
			return 0;
		
 	}

 }

 		
 	