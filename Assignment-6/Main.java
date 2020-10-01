/* 
 * PROGRAM : To design a class "Shape" with relevant members.
 			Design another class "Rectangle" that inherits class "Shape" 
 			and another class "Square" that inherit class "Rectangle". 
 			Find area and perimeter of rectangle and square using methods.Implement dynamic dispach method overriding in program.

 * FILE : 
 * CREATED BY : Santosh Hembram
 * DATED : 28-09-20
 */
 import java.util.*;
 class Shape {

 	float area(){

 		return 0;
 	}
 	float perimeter(){
 		return 0;
 	}
 	void input(){}

 }	

 class Rectangle extends Shape {

 	float l,b;

 	void input() {

 		Scanner sc = new Scanner(System.in);
 		System.out.print("Enter the length of the Rectangle: ");
 		l = sc.nextFloat();
 		System.out.print("Enter the breadth of the Rectangle: ");
 		b = sc.nextFloat();
 	}

 	float area() {

 		float rectArea = l * b;
 		return rectArea; 

 	}
 	float perimeter() {

 		float rectPeri = 2 * (l+b);
 		return rectPeri;
 	}

 }	

 class Square extends Rectangle {
 	float a;

 	void input() {

 		Scanner sc = new Scanner(System.in);

 		System.out.print("Enter the side of the square: ");
 		a = sc.nextFloat();
 	}

 	float area() {

 		float sqArea = a * a;
 		return sqArea; 

 	}
 	float perimeter() {

 		float sqPeri = 4 * a;
 		return sqPeri; 

 	}

 }	

 class Main {

 	public static void main(String[] args) {
 		
 		Shape ref;

 		ref = new Rectangle();

 		ref.input();
 		float ans = ref.area();
 		float ans1 = ref.perimeter();

 		System.out.println("Area of rectangle = "+ans);
 		System.out.println("Perimeter of rectangle = "+ans1);

 		ref = new Square();

 		ref.input();
 		float ans2 = ref.area();
 		float ans3 = ref.perimeter();

 		System.out.println("Area of square = "+ans2);
 		System.out.println("Perimeter of square = "+ans3);
 	}
 }