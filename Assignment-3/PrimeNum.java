/*
 * PROGRAM   : To list all PRIME NO.s between two integer values ,given as run time input  
 * FILE      : PrimeNum.java
 * CREATED BY: Santosh Hembram
 * DATED     : 09-09-20
 */

	
	class PrimeNum{
		public static void main(String[] args) {
			
			int n1,n2,i=0,flag=0,j;

			if(args.length < 2)
				System.out.println("=======================Insufficient no. of argument==========================");
			else{


				n1 = Integer.parseInt(args[0]);
			    n2 = Integer.parseInt(args[1]);

			   
			   if (n1>n2)
			   	System.out.println("=====================Greater bound should be more than lower bound=========================");

			   else{

			   		 System.out.printf("\nPrime numbers between %d and %d are: ", n1, n2);

			    	for( i=n1; i<=n2; i++ ){

			    		 if (i == 1 || i == 0) 
                			continue; 
  
			    		flag = 1;

			    		for( j=2; j<=i/2; ++j ){

			    			if(i % j == 0 ){
			    				flag = 0;
			    				break;
			    			}
			    		}
			    	
			    		if(flag == 1)
			    		System.out.println(i);
			    	}
			    }		

			}

			
		}
	}