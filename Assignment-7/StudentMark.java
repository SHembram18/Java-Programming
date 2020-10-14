/*
 * PROGRAM    : Calculate the percentage of marks obtained in three subjects(each out of 100) by student A and in four subjects(each out of 100) by student B.
 			    Create an Interface class "Marks" with an abstract method "getPercentage".
 			    It is inherited by two other classes "A" and "B" each having a method with the same name which returns the percentage of the students.
 			    The constructor of student A takes the marks in three subjects as its parameters and the marks in four subjects as it parameter for student B.
 			    Create an object for each of the two classes and print the percentage of marks for both the students. 
   
 * FILE       : StudentMark.java
 * CREATED BY : Santosh Hembram
 * DATED      : 05-10-20
 */ 
import java.util.*;
 interface Marks {

 	float getPercentage();
}	

class A implements Marks {

 	int total_marks=300,secured_marks;

 	A (int math, int gsc, int eng) {

 		secured_marks = math + gsc + eng;
 		System.out.println("Your score = "+secured_marks);

 	}
 	public float getPercentage(){

 		float per = (float)(secured_marks * 100) / total_marks;

 		return per;
 	}

}	

/* class B implements Marks {

 	B(float math, float gsc, float eng, float hindi) {

 	}

 }	*/    

 class StudentMark {

 	public static void main(String[] args) {
 		int math,gsc,eng;

 		Scanner sc = new Scanner(System.in);
 		
 		System.out.println("----- Enter the mark for student A ------");
 		
 			System.out.print("Mark obtained in Math out of 100 : ");
 			math = sc.nextInt();
 			while(math>100 || math<0) {
 				System.out.println("-----TRY AGAIN----");
 				System.out.print("Mark obtained in Math out of 100 : ");
 				math = sc.nextInt();
 			}

 			System.out.print("Mark obtained in Science out of 100 : ");
 			gsc = sc.nextInt();
 			while(gsc>100 || gsc<0) {
 				System.out.println("-----TRY AGAIN----");
 				System.out.print("Mark obtained in Science out of 100 : ");
 				gsc = sc.nextInt();
 			}

 			System.out.print("Mark obtained in English out of 100 : ");
 			eng = sc.nextInt();
 			while(eng>100 || eng<0) {
 				System.out.println("-----TRY AGAIN----");
 				System.out.print("Mark obtained in English out of 100 : ");
 				eng = sc.nextInt();
 			}

 			Marks obj;
 			obj = new A(math,gsc,eng);
 			float per = obj.getPercentage();
 			System.out.printf("percentage = %.2f",per,"%");

 		

 	}
 }

	