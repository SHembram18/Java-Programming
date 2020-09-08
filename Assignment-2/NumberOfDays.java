/*
 * PROGRAM   : Write a Java program to find the number of days in a month as the year and month given as input.
 * FILE      : NumberOfDays.java
 * CREATED BY: Santosh Hembram
 * DATED     : 07-09-20
 *
 */ 
	import java.util.*;
	class NumberOfDays{

		public static void main(String[] args) {
			
			int year;
			int month;
			int days=0;

			Scanner sc = new Scanner(System.in);
			System.out.print("Enter a year: ");
			year = sc.nextInt();

			System.out.print("Enter a month number: ");
			month = sc.nextInt();
			

				switch (month) {

					case 1:
							System.out.println("January");
							days = 31;
							break;
					case 2:
							System.out.println("February");
							if( (year % 400 == 0) || (year % 4 == 0 ) && (year % 100 != 0)){
								days = 29;
							}
							else
								days = 28;
							break;
					case 3:
							System.out.print("March");
							days = 31;
							break;
					case 4:
							System.out.println("April");
							days = 30;
							break;
					case 5:
							System.out.println("May");
							days = 31;
							break;
					case 6:
							System.out.println("June");
							days = 30;
							break;
					case 7:
							System.out.println("July");
							days = 31;
							break;
					case 8:
							System.out.println("August");
							days = 31;
							break;
					case 9:
							System.out.println("September");
							days = 30;
							break;
					case 10:
							System.out.println("October");
							days = 31;
							break;
					case 11:
							System.out.println("November");
							days = 30;
							break;
					case 12:
							System.out.println("December");
							days = 31;
							break;
					default:
							System.out.println("===================\nWrong Input========================");

				}
				System.out.println("Days = "+days);
			}

		
	}