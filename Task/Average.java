// Writa a Java Program to find average of 5 number using command line argument

		class Average
		{
			public static void main(String args[])
			{
				float a,b,c,d,e,total;
				float avg;
				
				
				
				a = Integer.parseInt(args[0]);
				b = Integer.parseInt(args[1]);
				c = Integer.parseInt(args[2]);
				d = Integer.parseInt(args[3]);
				e = Integer.parseInt(args[4]);
				
				total = (a+b+c+d+e);
				
				avg = total / 5; 
				
				System.out.println("Average = "+avg);
				
				
			}
		}
		
