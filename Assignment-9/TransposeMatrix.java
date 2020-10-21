/*
 * PROGRAM : To find the transpose of a matrix
 * FILE : TransposeMatrix.java
 * CREATED BY : Santosh Hembram
 * DATE : 12-10-20
 */
import java.util.*;
class TMatrix {

	public int[][] transpose(int mat[][],int r,int c) {

		int newMat[][] = new int[c][r];

		for (int i=0; i<r; i++) {
			for (int j=0; j<c; j++) {

				newMat[j][i] = mat[i][j];
				
			}	
		}
		return newMat;
	}
}
class TransposeMatrix {
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
		TMatrix obj = new TMatrix();
		int tmatrix[][] = obj.transpose(mat,r,c);
		System.out.println("---------- Displaying the Transpose matrix --------------");  
		for(int i=0; i<c; i++) { 
			for (int j=0; j<r; j++) {
				
				 System.out.print(tmatrix[i][j]+" ");
				 
			}
			System.out.println(); 
		}
	}
}
