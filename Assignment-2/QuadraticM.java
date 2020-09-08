/*
 * PROGRAM   : JAVA PROGRAM TO FIND THE ROOTS OF A QUADRATIC EQUATION WITH RUN TIME INPUT.
 * FILE      : Quadratic.java
 * CREATED BY: Santosh Hembram
 * DATED     : 07-09-20
 *
 */
		import java.lang.Math;
		class QuadraticM{

			public static void main(String[] args) {

				if( (args.length < 3 ) || (args.length > 3) ){

					System.out.println("=========================INSUFFICIENT NO. OF ARGUMENTS===========================");

				}
				else{

					int a,b,c;
					int d;
					float root;
					float root1,root2;

					a = Integer.parseInt(args[0]);
					b = Integer.parseInt(args[1]);
					c = Integer.parseInt(args[2]);

					d = (b*b)-4*a*c;

					System.out.println("The coefficient of a = "+a);
					System.out.println("The coefficient of b = "+b);
					System.out.println("The coefficient of c = "+c);

					if( (a==0) && (b==0) )
						System.out.println("======================\nNO SOLUTION FOUND===============================");

					else if (a==0) {
						System.out.println("====================ONE ROOT FOUND==============================");

						root = -c/b;
						System.out.println("root = "+root);

					}
					else if (d>0) {
						System.out.println("=====================TWO DISTINCT REAL ROOT EXISTS======================");
						root1 = (float) ( -b + Math.sqrt(d) ) / (2*a) ;
						root2 = (float) ( -b - Math.sqrt(d) ) / (2*a) ;

						System.out.println("root1 = " +root1+ " root2 = "+root2 );

					}
					else if (d==0) {
						System.out.println("========================TWO REAL AND EQUAL ROOT EXISTS=====================" );
						root1=root2 = -b / (2*a);
						System.out.println("root1=roo2 = " +root1) ;

					}
					else if (d<0) {
						System.out.println("==========================\nIMAGINARY ROOTS==============================");
						
					}


				}


				
			}
		}
