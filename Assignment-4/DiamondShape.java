/*
 * PROGRAM   : Java Program to generate Diamond shape number pattern.
 * FILE      : DiamondShape.java
 * CREATED BY: Santosh Hembram
 * DATED     : 14-09-20
 */

import java.util.Scanner;
  class DiamondShape{

    public static void main (String args[]) {

        Scanner sc = new Scanner(System.in);
   
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

        for(int i=1; i<=rows; i++) {

            for(int j=1; j<=rows-i; j++) {

                System.out.print(" ");
              }
      
            for(int k=i; k>=1; k--) {

                System.out.print(k);

            }


            for(int l=2; l<=i; l++) {
              System.out.print(l);
      }

      System.out.println();

    }


    for(int i=rows-1; i>=1; i--){ 

    for(int j=0; j<=rows-1-i; j++){
      System.out.print(" ");
    }

    for(int k=i; k>=1; k--){

      System.out.print(k);

    }

    for(int l=2; l<=i; l++){
      System.out.print(l);
    }

    System.out.println();
  }

}
}