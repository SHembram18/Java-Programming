/*
 * PROGRAM   : To find the most repeated word in a string.
 * FILE      :  RepeatWord.java
 * CREATED BY: Santosh Hembram
 * DATED     : 14-10-20
 */
import java.util.*;
 class RepeatWord {

 	public static void mostRepeatWord(String str) {

 		for (int i=0; i<str.length; i++) {

 			System.out.println(str[i]);
 			
 		}

 	}

 	public static void main(String[] args) {
 		
 		String str;
 		System.out.print("Enter a string: ");
 		Scanner sc = new Scanner(System.in);
 		str = sc.nextLine();

 		mostRepeatWord(str);
 	}
 }
