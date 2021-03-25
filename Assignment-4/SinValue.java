/* PROGRAM    : To find the sin(x) for given x.
 * FILE       : SinValue.java
 * CREATED BY : Santosh Hembram
 * DATED      : 14-09-20
 */

import java.util.*;

class SinValue
{
    SinValue(Scanner sc)
    {
        int num;
        
        System.out.println("Enter the angle in degree:");
        num = sc.nextInt();

        double rad = Math.toRadians(num);
        double value = Math.sin(rad);       
	    System.out.println("sin( "+num+" ) = "+String.format("%.2f", value));
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        SinValue obj = new SinValue(sc);
        sc.close();
    }
}