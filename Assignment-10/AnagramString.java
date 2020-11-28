/*
 * PROGRAM    : To check as two strings are ANAGRAM or NOT.
 * FILE       : AnagramString.java
 * CREATED BY : Santosh Hembram
 * DATED      : 14-10-20
 * 
 */

import java.util.*;

class AnagramString {

  	public static boolean isAnagram(String str1, String str2) {

  		if ( str1.length() != str2.length() ) {

  			return false;
  		}

  		int count = 0;

  		for (int i=0; i<str1.length(); i++ ) {

  			count = count + str1.charAt(i);
  		}

  		for (int j=0; j<str2.length(); j++ ) {

  			count = count - str2.charAt(j);
  			
  		}
  		return (count == 0);

  	}

  	public static void main(String[] args) {
  		
  		String str1,str2;

  		System.out.println("Enter the first string: ");
  		Scanner sc = new Scanner(System.in);
  		str1 = sc.nextLine();

  		System.out.println("Enter the second string: ");
  		str2 = sc.nextLine();

  		System.out.print("----------------------\n");

  		if(isAnagram(str1,str2) ) 

  			System.out.println("Two strings are ANAGRAM.");

  		else
  			System.out.println("Two strings are not ANAGRAM.");
  	}
}