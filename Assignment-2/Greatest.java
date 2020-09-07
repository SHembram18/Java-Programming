/*
	  PROGRAM : Write a Java Program to find the greatest among three numeric values with nested if construct and command line argument
    FILE    : Greatest.java
    CREATED BY : SANTOSH HEMBRAM
    DATED      : 07-09-20
*/

	class Greatest{

		public static void main(String args[]){
			if ( args.length > 3 ){ 

				System.out.println("============Input is more than 3========");
				return;}
				
			else if(args.length == 0){

				System.out.println("==========Input is empty===========");
				return;}

			else if(args.length < 3){

				System.out.println("=========Input is less than 3============");
				return;}

			int a,b,c;

			a = Integer.parseInt(args[0]);
			b = Integer.parseInt(args[1]);
			c = Integer.parseInt(args[2]);

			if( a<b )
			{
				if( b>c )
				
					System.out.println( b+ " is greatest among three");
				
				else

					System.out.println(c+ " is greatest among three");
				

			}
			else
			{

				if( a>c)

					System.out.println(a+ " is greatest among three");
				
				else

					System.out.println(c+ " is greatest among three");
			
			}


		}
	}
