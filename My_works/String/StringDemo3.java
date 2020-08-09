//Examples of String Method
	
	class StringDemo3
	{
		public static void main(String args[])
		{
			String str = new String("Hello"); /*creating object for string*/
			System.out.println(str); /*Displaying the string*/
		
			System.out.println(str.length());/*Displaying the length of the string*/
			
			System.out.println(str.indexOf("e"));/*Displaying the index value of a character*/
			
			System.out.println("Character at "+str.charAt(1));/*Displaying the character at entered index value*/
			
			System.out.println(str.toUpperCase()); /*Converting the string to upper case*/
			System.out.println(str); /*checking the content of the string*/ // whether the string content change or not?
			
			System.out.println(str.toLowerCase());/*Converting the string into lower case*/
			
			System.out.println(str.compareTo("hello"));/*compare between the two string*/
		}
	}
	/* The main disadvantage of the string is we cannot modify the string at the same location
	   to modify the string we have to create another location and assign it to that location.*/
	   
	   
	
