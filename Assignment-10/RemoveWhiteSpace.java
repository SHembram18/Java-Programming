/*
 * PROGRAM    : To remove all the whitespaces from a string
 * FILE       : RemoveWhiteSpace.java
 * CREATED BY : Santosh Hembram
 * DATED      : 14-10-2020
 *
 */
 
 import java.util.*;
 class RemoveWhiteSpace {

 	public static void main(String[] args) {
 		
 		String str;
 		System.out.print("Enter a string: ");
 		Scanner sc = new Scanner(System.in);
 		str = sc.nextLine();

 		str = str.replaceAll(" ","");

 		System.out.print("After Remove all the whitespaces from the string:");
 		System.out.println(str);

 	}
 }