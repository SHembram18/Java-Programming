/*
 * PROGRAM   : To count vowel and consonants in a string.
 * FILE      : CountVowelCons.java
 * CREATED BY: Santosh Hembram
 * DATED     : 14-10-20
*/

import java.util.*;

class MyString {

	public int count(char arr[]) {

		int vowel = 0, cons = 0;

		for (int i=0; i<arr.length; i++ ) {

			if ( (arr[i] == 'a') || (arr[i]=='e') || (arr[i]=='i') || (arr[i]=='o') || (arr[i]=='u')  ) {
				
				vowel ++;
			}
			else if (arr[i] >= 'a' && arr[i] <= 'z') {
				cons++;
			}
			
			
		}
		System.out.println("Number of Consonants characters: "+cons);
		return vowel;

	}
}


class CountVowelCons {

	public static void main(String[] args) {
		
		String str;
		System.out.print("Enter a string: ");
		Scanner sc = new Scanner(System.in);
		str = sc.nextLine();

		str = str.toLowerCase();
	
		char arr[] = str.toCharArray();

		MyString obj = new MyString();

		int c_vowel = obj.count(arr);
		
		System.out.println("Number of Vowels characters: "+c_vowel);
	}

}

	


