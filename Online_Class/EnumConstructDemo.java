/*
	ENUM with Constructor DEMONSTRATION PROGRAM IN JAVA
*/

	enum Color{
		RED, GREEN, BLUE, BLACK, YELLOW;
		private Color(){
			System.out.println("Constructor called for " + this.toString() );
		}

		public void colorInfo(){
			System.out.println("Universal Color...");
		}
	}

	public class EnumConstructDemo{
		public static void main(String args[]){
			Color c1 = Color.GREEN;
		//	Color c2 = new Color(); // ERROR

			System.out.println("Color is " + c1);
			c1.colorInfo();
		}
	}
