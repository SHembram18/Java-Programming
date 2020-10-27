/*
 * PROGRAM   : To find total no. of characters in a string.(Do not use String method)
 * FILE      : StringLength.java
 * CREATED BY: Santosh Hembram
 * DATED     : 14-10-20
*/
import java.util.*;


class StringLength {
	public static void main(String[] args) {
		int count = 0; 
		String str;
		System.out.print("Enter a string: ");
		Scanner sc = new Scanner(System.in);
		str = sc.nextLine();

		char arr[] = str.toCharArray();

		
		for ( char c : arr ) {

			count++;
			
		}
		System.out.println("The total no. of characters in the string : "+count);
	}

}

	
