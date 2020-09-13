/*
 * PROGRAM   : To print the Nth fibonaccy number using a method , value 
 				of n is accepted command-line input. 
 * FILE      : FibonaccyMethod.java
 * CREATED BY: Santosh Hembram
 * DATED     : 09-09-20
 */

 	class FibonaccyMethod{
 		public static void main(String[] args) {
 			
 			if(args.length == 0)
 				System.out.println("=================You didn't enter an input========================");
 			else{

 				int n = Integer.parseInt(args[0]);

 				int fibo_num = fiboMethod(n);
 				System.out.print("The "+n+"th fibonaccy number is: "+fibo_num);
 			}
 		}

 			public static int fiboMethod(int n) {

 				int f1 = 0, f2 = 1, next;

 				if(n == 0)
 					return f1;

 				for (int i=0; i<n; i++ ) {

 					next = f1 + f2;
 					f1 = f2;
 					f2 = next;
 				}
 				return f2;
 				
 		}
 	}