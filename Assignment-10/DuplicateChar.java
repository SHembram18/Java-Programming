/*
 * PROGRAM   : To find the duplicate character(s) in a string.
 * FILE      : DuplicateChar.java
 * CREATED BY: Santosh Hembram
 * DATED     : 14-10-20
 */

 import java.util.*;
 class DuplicateChar {

 	public static void duplicate(char arr[]) {

 		for (int i=0; i<arr.length; i++) {
 			int count = 1;
 			for (int j=i+1; j<arr.length; j++ ) {
 				
 				if (arr[i] == arr[j] && arr[i]!=' ') {
 					count++;
 					arr[j]='0';
 				}
 			}
 			if (count>1 && arr[i]!='0') {
 				System.out.println(arr[i]);					
 			}	
 		}		
 	}

 	public static void main(String[] args) {
 		
 		String str;

 		System.out.print("Enter a string: ");
 		Scanner sc = new Scanner(System.in);
 		str = sc.nextLine();

 		char arr[] = str.toCharArray();

 		duplicate(arr);
 	}

}