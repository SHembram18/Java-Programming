/*
 * PROGRAM   : Write a java Program to compare two floating point values given as run time input upto 3 decimal places
 * FILE      : FloatCompare.java
 * CREATED BY: Santosh Hembram
 * DATED     : 07-08-20
*/
	class FloatCompare{

		public static void main(String[] args)  {

			if(args.length < 2)
				System.out.println("====================\nINSUFFICIENT NO. OF ARGUMENTS====================");

			else{

				double x,y;

				x = Double.parseDouble(args[0]);
				y = Double.parseDouble(args[1]);

				System.out.print("Input two floating-point number: ");
        		

       			 x = Math.round(x * 1000);
        		x = x / 1000;

        		y = Math.round(y * 1000);
        		y = y / 1000;

        		if (x == y)
        		{
            		System.out.println("They are the same up to three decimal places");
        		}
       			 else
        		{
            		System.out.println("They are different");
       			 }
    
			}
		}
	}


			
	