/*
 * PROGRAM   : To print first n fibonaccy numebrs,where value of n is run time input.
 * FILE      : FibonaccyNum.java
 * CREATED BY: Santosh Hembram
 * DATED     : 09-09-20
 */ 

	import java.util.*;
	class FibonaccyNum{
		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the range for n: ");
			int n = sc.nextInt();
				
			int f1 = 0, f2 = 1, next;

				if(n<0)
					return;

				else{

					for(int i=0; i<n; i++){

					 	System.out.print(f2+" ");
					 	next = f1 + f2; 
					 	f1 = f2;
					 	f2 = next;


					}
				
				}

		}
			



			
	}

	