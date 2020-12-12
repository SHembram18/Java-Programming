/*
 * PROGRAM    : To create a string "I love India". Change it to "I love my India". Replace the substring "India" with "country". Again change it to "I love 
                my".Finally, change it to "I love India".
 * FILE       : StringbufferDemo.java
 * CREATED BY : Santosh Hembram
 * DATED      : 19-10-2020 
 */

  class StringbufferDemo {

  	public static void main(String[] args) {
  		
  	
  		StringBuffer sb = new StringBuffer("I love India");
  		System.out.println(sb);

  		sb.insert(6," my");
  		System.out.println(sb);

  		sb.replace(10,15,"country");
  		System.out.println(sb);

  		sb.delete(9,17);
  		System.out.println(sb);


  		sb.append(" India");
  		System.out.println(sb);
  	}
  }
