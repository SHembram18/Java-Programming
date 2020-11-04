/*
 * PROGRAM   : To swap two string variables without using third variable
 * FILE      : StringSwap.java
 * CREATED BY: Santosh Hembram
 * DATED     : 14-10-20
 */

import java.util.*;
class StringSwap {

	public static void swap(String str1, String str2) {

		str1 = str1 + str2;

		str2 = str1.substring( 0,str1.length() - str2.length() );

		str1 = str1.substring(str2.length() );

		System.out.println("After swapping the string: ");
		System.out.println("string 1: "+str1);
		System.out.println("string 2: "+str2);

			
		}

	public static void main(String[] args) {
		
		String str1,str2;

		System.out.print("Enter the first string: ");
		Scanner sc = new Scanner(System.in);
		str1 = sc.nextLine();

		System.out.print("Enter the second string: ");
		str2 = sc.nextLine();

		System.out.println("Display the string before swapping: ");
		System.out.println("string 1: "+str1);
		System.out.println("string 2: "+str2);

		swap(str1,str2);
	}
}