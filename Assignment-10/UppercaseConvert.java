/*
 * PROGRAM : To convert a string to uppercase without string method.
 * FILE : UppercaseConvert.java
 * CREATED BY : Santosh Hembram
 * DATED : 14-10-2020
 */
import java.util.*;
class UppercaseConvert {

	public static void main(String[] args) {
			
		String str;
	
		System.out.print("Enter the string: ");
		Scanner sc = new Scanner(System.in);
		str = sc.nextLine();

		int len = str.length();

		char strArr[] = str.toCharArray();


		for(int i=0;i<len;i++) {

			if (strArr[i] > 90) {

				 strArr[i] = (char) ( (int) strArr[i] - 32 );
			}
		}
		str = new String(strArr);
		System.out.println("After Converting the string to uppercase: ");
		System.out.print(str);
	}
}
