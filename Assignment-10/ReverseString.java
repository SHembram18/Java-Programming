/*
 * PROGRAM   : To find the reverse of a string
 * FILE      : ReverseString.java
 * CREATED BY: Santosh Hembram
 * DATED     : 14-10-20
 */

	import java.util.*;
	class ReverseString {

		public static void reverse(String str){

			String revStr="";

			int len = str.length();

			for (int i=len-1; i>=0; i--) {
				revStr = revStr+str.charAt(i);

			}
			System.out.println("Reverse of the string: "+revStr);
		}

		public static void main(String[] args) {
			
			String str;

			System.out.print("Enter a string: ");
			Scanner sc = new Scanner(System.in);
			str = sc.nextLine();

			reverse(str);
		}
	}
