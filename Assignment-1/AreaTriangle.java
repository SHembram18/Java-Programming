// PROGRAM	: Write a Java program to find an area of a scalene traingle whose sides are given as run -time input			 
// fILE		: AreaTriangle.java
// CREATED BY:SANTOSH HEMBRAM
//DATED		: 31-08-20 

	class AreaTriangle
	{
		public static void main(String args[])
		{
			int a,b,c,z;
			int s;
			double area;
			a = Integer.parseInt(args[0]);
			b = Integer.parseInt(args[1]);
			c = Integer.parseInt(args[2]);
			
			if( (a+b)>c && (b+c)>a && (c+a)>b )
			{
				if( (a!=b) && (b!=c) && (c!=a) )
				{
					System.out.println("Sides of the triangle are a = "+a+" , b = "+b+" , c = "+c );
			    		
					s = (a+b+c)/2;
			
					area =  Math.sqrt(s*(s-a)*(s-b)*(s-c));
					System.out.println("The area of the traingle is : "+area);
				}
				else
				{
					System.out.println("Triangle is not Scalene");
				}
			}
			else
			{
				System.out.println("Triangle is not valid");
			}
			
			
			
		}
	}
