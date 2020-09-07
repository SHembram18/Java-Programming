/*
	ENUM with values(), ordinal(), and valuesOf() DEMONSTRATION PROGRAM IN JAVA
*/
	enum Color{

		RED, GREEN, BLUE, BLACK, YELLOW;
	}

	public class EnumMethodsDemo{
		 public static void main(String[] args) {
		 	Color c1 = Color.GREEN;

		 	Color arr[] = Color.values();  // values() method is used to get values of all named constants of the 

		 	// using conventional for loop
		 	System.out.println("=====================\nUsing conventional FOR LOOP\n=======================");
		 	for (int i = 0; i<arr.length; i++ ) {
		 		System.out.println(arr[i] + " is at index [" +i + "]");
		 		
		 	}

		 	//using enhanced for loop (only forward processing)
		 	System.out.println("=====================\nUsing Enhanced FOR LOOP\n===========================");
		 	for(Color c : arr){
		 		System.out.println(c + " is at index [ " + c.ordinal() + "]");
		 	}
			
		}
	}
