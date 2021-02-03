/*
 * PROGRAM   : To generate the Pascal traingle pattern
 * FILE      : PascalTriangle.java
 * CREATED BY: Santosh Hembram
 * DATED     : 14-09-20
 */
import java.util.*;
class PascalTriangle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		int row = sc.nextInt();

		int space = row;
		int number = 1;

		for (int i=0; i<row; i++ ) {

			for (int s=1; s<=space; s++ ) {
				System.out.print(" ");
				
			}
			number = 1;
			for (int j=0; j<=i; j++ ) {
				System.out.print(number+" ");
				number = number * (i-j)/(j+1);
			 	
			}
			space--;
			System.out.println(); 	
		}
	}
}