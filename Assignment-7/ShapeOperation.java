/*
 *
 * PROGRAM    : To create an Abstract class "Shape" with abstract methods like area(),perimeter(). Define classes like "Rectangle", "Square" and "Circle" to find the area and perimeter of rectangle, circle and square objects.
 * FILE       : ShapeOperation.java
 * CREAETD BY : Santosh Hembram
 * DATED      : 05-10-20
 *
 */
import java.util.*;

 abstract class Shape {

 	abstract double area();
 	abstract double perimeter();
 	void Input(){

 	}
 }

Public class Rectangle extends Shape {

 	float l,b;

 	void Input() {

 		Scanner sc = new Scanner(System.in);

 		System.out.print("Enter the length of the Rectangle: ");
 		l = sc.nextFloat();
 		System.out.print("Enter the breadth of the Rectangle: ");
 		b = sc.nextFloat();

 	}

 	double area() {

 		double ar = l * b;
 		return ar;
 	}

 	double perimeter() {

 		double peri = 2 * (l + b);
 		return peri;
 	}
}

class Square extends Shape {

	float a;

	void Input() {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the side of square = ");
 		a = sc.nextFloat();

	}

 	double area() {

 		double ar = a * a;
 		return ar;
 	}

 	double perimeter() {

 		double peri = 4 * a;
 		return peri;  
 	}
} 

class Circle extends Shape {

	float r;

	void Input() {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter radius of the Circle: ");
 		r = sc.nextFloat();
	}

 	double area() {

 		double ar = 3.14 * r * r;
 		return ar;
 	}

 	double perimeter() {

 		double peri = 2 * 3.14 * r;
 		return peri;
 	}
}

class ShapeOperation {

 	public static void main(String[] args) {

 		Shape obj;

 		obj = new Rectangle();

 		obj.Input();
 		double arRect = obj.area();
 		double peRect = obj.perimeter();

 		System.out.println("Area of the rectangle = "+arRect);
 		System.out.println("Perimeter of the rectangle = "+peRect);

 		obj = new Square();

 		obj.Input();
 		double arSq = obj.area();
 		double peSq = obj.perimeter();

 		System.out.println("Area of the Square = "+arSq);
 		System.out.println("Perimeter of the Square = "+peSq);

 		obj = new Circle();

 		obj.Input();
 		double arCir = obj.area();
 		double peCir = obj.perimeter();

 		System.out.println("Area of the Circle = "+arCir);
 		System.out.println("Perimeter of the Circle = "+peCir); 
 	}
}
