/*
 * PROGRAM : To find the upper triangular matrix
 * FILE : UpperTriangularMatrix.java
 * CREATED BY : Santosh Hembram
 * DATE : 12-10-20
 */
import java.util.*;
class UpperTriangularMatrix {
	public static void upperTriangular(int mat[][],int r,int c){

		System.out.println("-------- Displaying the upper triangular matrix ---------");

		for (int i=0; i<r; i++) {
			for (int j=0; j<c; j++) {

				if (i<=j) {
					System.out.print(mat[i][j]+" ");
					
				}
				else {
					System.out.print("0"+" ");
				}	
			}
			System.out.println();	
		}

	}

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the row size: ");
 		int r = sc.nextInt();
 		System.out.print("Enter the coloumn size: ");
 		int c = sc.nextInt();
 		while (r!=c) {
 			System.out.println("WARNING!!!");
 			System.out.println("The row and coloumn size must be equal.");
 			System.out.print("re-Enter the coloumn size : ");
 			c = sc.nextInt();
 		}
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
		upperTriangular(mat,r,c);
	}
}