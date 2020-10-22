/*
 * PROGRAM : To find the sum of each row and each column of a matrix. Print the results along with input matrix.
 * FILE : SumOfRowCol.java
 * CREATED BY : Santosh Hembram
 * DATE : 12-10-20
 */
import java.util.*;
class SumOfRowCol {
	public static void sumMatrix(int mat[][]) {
		
		int r=1,c=1;
		for (int i=0; i<mat.length; i++) {
			int sum=0;
			
			for (int j=0; j<mat[0].length; j++) {
				
				 sum = sum + mat[i][j];
					
			}
			System.out.println("Sum of "+r+" row: "+sum);
			r++;
		}
		System.out.println();
		for (int i=0; i<mat[0].length; i++) {
			int colSum=0;
			for (int j=0; j<mat.length; j++) {
				colSum = colSum + mat[j][i];
				
			}
			System.out.println("Sum of "+c+" column: "+colSum);
			c++;
			
		}
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
		SumOfRowCol obj = new SumOfRowCol();
		obj.sumMatrix(mat);
	}
}