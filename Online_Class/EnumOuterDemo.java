/*
	
	OUTER ENUM DEMONSTRATION PROGRAM IN JAVA

*/

	enum Color{
		RED, GREEN, BLUE, BLACK, YELLOW;
	}

	enum Planet{
		MERCURY, VENUS, EARTH, MARS, JUPITOR, SATURN, URANUS, NEPTUNE;
	}

	enum DAY{
		SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
	}


	public class EnumOuterDemo{
		public static void main(String args[]){
		Color c1 = Color.GREEN;

		Planet p1 = Planet.EARTH;


		System.out.println("Color is : " + c1);
		System.out.println("We live in " +p1);
	}
}

