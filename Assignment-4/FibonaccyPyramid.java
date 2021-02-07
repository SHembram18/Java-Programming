/*
 * PROGRAM   : Java Program to generate fibonaccy pyramid.
 * FILE      : FibonaccyPyramid.java
 * CREATED BY: Santosh Hembram
 * DATED     : 14-09-20
 */

import java.util.*;
public class FibonaccyPyramid {
	public static void main(String[] args) {
		int row;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		row=sc.nextInt();

		printFibonaccy(row);
		
	}
	
	public static void printFibonaccy(int n){
	int f1=0,f2=1,f3=0;
	
		for(int i=1;i<=n;i++) {

			for(int j=0;j<i;j++) {

				System.out.print(f1+" ");

				f3=f1+f2;
				f1=f2;
				f2=f3;
			}

			System.out.println();
			
			f1=0;
			f2=1;
		}
	}
}