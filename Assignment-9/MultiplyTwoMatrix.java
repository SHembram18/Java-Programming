/*
 * PROGRAM : To multiply two matrices using your own method. Print the resultant along with two input matrices.
 * FILE : MultiplyTwoMatrix.java
 * CREATED BY : Santosh Hembram
 * DATE : 12-10-20
 */
import java.util.*;
class MatrixMul {

	public void multiplyMatrix(int matrix[][], int matrix2[][]) {
		int mulResult[][] = new int[matrix.length][matrix2[0].length];
		
		for (int i=0; i<matrix.length; i++) {
			
			for (int j=0; j<matrix[0].length; j++) {
				 mulResult[i][j] = 0;
				for(int k=0; k<matrix2.length; k++) {

					mulResult[i][j] = mulResult[i][j] + matrix[i][k] * matrix2[k][j];
				}
				
			}
		}
		System.out.println("----- Displaying the resultant matrix -------");
		for (int i=0; i<matrix.length; i++) {
			
			for (int j=0; j<matrix[0].length; j++) {
				System.out.print(mulResult[i][j]+" ");
			}
			System.out.println();
		}

	}
}
class MultiplyTwoMatrix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
 		System.out.print("Enter the row size for 1st matrix: ");
 		int r = sc.nextInt();
 		System.out.print("Enter the coloumn size for 1st matrix: ");
 		int c = sc.nextInt();
 		int mat[][]  = new int[r][c];

 		System.out.println("---------- Enter the elements of the 1st matrix --------------");  
		for(int i=0; i<r; i++) { 
			for (int j=0; j<c; j++) {
				
				System.out.print("Enter the elements for row "+i+" coloumn "+j+": ");
				 mat[i][j] = sc.nextInt(); 
			}
		}	
		System.out.print("Enter the row size for 2nd matrix: ");
		int r2 = sc.nextInt();
		System.out.print("Enter the coloumn size for 2nd matrix: ");
		int c2 = sc.nextInt();
		while (r2!=c) {
			
				System.out.println("WARNING!!!");
				System.out.println("The row size must be same with the first Matrix column size !!!!!!!!!!!!!!");
				System.out.print("Again enter the coloumn size for 2nd matrix: ");
				 c2 = sc.nextInt();
		}

 		int mat2[][]  = new int[r2][c2];
 		System.out.println("--------- Enter the elements of the 2nd matrix --------------");  
		for(int k=0; k<r2; k++) {
			for (int l=0; l<c2; l++) {

				System.out.print("Enter the elements for row "+k+" coloumn "+l+": ");
				mat2[k][l] = sc.nextInt();
			}
		}
		System.out.println("------- Displaying the 1st Matrix ----------");
		for( int i=0; i<r; i++) { 
			for ( int j=0; j<c; j++) {
				System.out.print(mat[i][j]+" ");
			
			}
			System.out.println();

		}
		System.out.println("------- Displaying the 2nd Matrix ----------");
		for( int k=0; k<r2; k++) { 
			for ( int l=0; l<c2; l++) {
				System.out.print(mat2[k][l]+" ");
			
			}
			System.out.println();

		}

		MatrixMul obj = new MatrixMul();
		obj.multiplyMatrix(mat,mat2);	
	}
}
