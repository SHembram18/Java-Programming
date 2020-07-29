/*Use of command line argument for addition of two numbers in Java*/
	
class TestCommandline
{
	public static void main(String args[])
	{
		int num1,num2,res;
		
		num1 = Integer.parseInt(args[0]);
		num2 = Integer.parseInt(args[1]);
		
		res = num1 + num2;
		System.out.println("sum of "+num1+" and "+num2+" is "+res);
	}
}
		
