/*
 * PROGRAM   : Java Program to prepare Floyd's triangle.
 * FILE      : FloydTriangle.java
 * CREATED BY: Santosh Hembram
 * DATED     : 14-09-20
 */
import java.util.*;
class FloydTriangle {

	public static void main(String[] args) {

		int k=1;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows for floyd's triangle: ");
		int row = sc.nextInt();

		for (int i=1; i<=row; i++ ) {

			for (int j=1; j<=i; j++ ) {

				System.out.print(k+" ");
				k++;
				
			}
			System.out.println();
		}	
	}

 }
