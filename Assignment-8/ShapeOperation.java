/*
 * PROGRAM : Create an Interface named "Shape" with two abstract methods area(), perimeter(). Create three classes Circle, Square and Rectangle, both 
			  implement "Shape" interface. Add required methods along with constructors and instance variable(S). WAP in JAVA to implement it to performs operations on Objects of different classes.

 * FILE : ShapeOperation.java 
 * CREATED BY : Santosh Hembram
 * DATED : 09-10-20
 * 
 */
import java.util.*;
import java.lang.Math.*;
interface Shape {

	double area();
	double perimeter();

}
class Circle implements Shape {
	float r,ar;
	Circle(){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the radius of the circle: ");
		r = sc.nextFloat();
	}
	public double area() {
		double ar = Math.PI*r*r;
		return ar;
	}
	public double perimeter() {
		double peri = 2*Math.PI*r;
		return peri;
	}

}
class Square implements Shape {
	float a;
	Square() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the side of the square: ");
		a = sc.nextFloat();			
	}
	public double area() {
		double ar = a*a;
		return ar; 
	}
	public double perimeter() {
		double peri = 4*a;
		return peri;
	}

}
class Rectangle implements Shape {
	float l,b;
	Rectangle() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length of the rectangle: ");
		l = sc.nextFloat();		
		System.out.print("Enter the breadth of the rectangle: ");
		b = sc.nextFloat();	
	}
	public double area() {
		double ar = l * b;
		return ar;
	}
	public double perimeter() {
		double peri = 2*(l+b);
		return peri;
	}
	

}
class ShapeOperation {

	public static void main(String[] args) {
		Shape obj;
		obj = new Circle();
		double area = obj.area();
		double perimeter = obj.perimeter();
		System.out.printf("Area of Circle = %.2f\n",area);
		System.out.printf("perimeter of Circle = %.2f\n",perimeter);
		System.out.println("-----------------------------------");

		obj = new Square();
		 area = obj.area();
		 perimeter = obj.perimeter();
		System.out.printf("Area of Square = %.2f\n",area);
		System.out.printf("perimeter of Square = %.2f\n",perimeter);
		System.out.println("-----------------------------------");  
		
		obj = new Rectangle();
		 area = obj.area();
		 perimeter = obj.perimeter();
		System.out.printf("Area of Rectangle = %.2f\n",area);
		System.out.printf("perimeter of Rectangle = %.2f\n",perimeter);
		System.out.println("-----------------------------------"); 
	}
}
