/*
 * PROGRAM   : To determine whether a string is PALLINDROME or NOT.
 * FILE      : PallindromeString.java
 * CREATED BY: Santosh Hembram
 * DATED     : 14-10-20
 */
import java.util.*;
 class PallindromeString {

 	public static void main(String[] args) {
 		
 		String str;

 		int i,j;
 		Scanner sc = new Scanner(System.in);
 		System.out.println("Enter a string: ");
 		str = sc.nextLine();

 		char arr[] = str.toCharArray();

 		char revArr[] = new char[arr.length];

 	
		for (i=0,j=arr.length-1; i<arr.length; i++,j-- ) {

				revArr[j] = arr[i];
			}

 		System.out.println("After Reverse the string:");
 		for (j=0; j<revArr.length; j++ ){

 			System.out.print(revArr[j]);
 		}

 		String s1 = new String(arr);
 		String s2 = new String(revArr);

 		int check = s1.compareTo(s2);

 		if(check==0)
 			System.out.println("\nThe String is Pallindrome");
 		else
 			System.out.println("\nThe String is not a Pallindrome");
 		


 	}
 }
