/*
 * PROGRAM : To find the frequency of ODD and EVEN integers in a matrix.
 * FILE : CalOddEvenMatrix.java
 * CREATED BY : Santosh Hembram
 * DATE : 12-10-20
 */
import java.util.*;
 class CalOddEvenMatrix {
 	public static void matrix(int mat[][]) {
 		int c_odd=0,c_even=0;

 		for (int i=0; i<mat.length; i++) {
 			for (int j=0; j<mat[0].length; j++) {

 				if (mat[i][j] % 2 == 0) {

 					c_even++;
 					
 				}
 				else
 					c_odd++;
 				
 			}
 			
 		}
 		System.out.println("The frequency of odd integers in the matrix = "+c_odd);
 		System.out.println("The frequency of even integers in the matrix = "+c_even );

 	}

 	public static void main(String[] args) {
 		Scanner sc = new Scanner(System.in);
 		System.out.print("Enter the row size: ");
 		int r = sc.nextInt();
 		System.out.print("Enter the coloumn size: ");
 		int c = sc.nextInt();
 		int mat[][]  = new int[r][c];

 		System.out.println("---------- Enter the elements of the matrix --------------");  
		for(int i=0; i<r; i++) { 
			for (int j=0; j<c; j++) {
				
				System.out.print("Enter the elements for row "+i+" coloumn "+j+": ");
				 mat[i][j] = sc.nextInt(); 
			}
		}
		System.out.println("---------- Displaying the matrix --------------");  
		for(int i=0; i<r; i++) { 
			for (int j=0; j<c; j++) {
				
				 System.out.print(mat[i][j]+" ");
				  
			}
			System.out.println();
		}
		CalOddEvenMatrix obj = new CalOddEvenMatrix();
		obj.matrix(mat);
 	}
 }