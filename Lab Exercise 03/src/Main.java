/*
 * Student Name: TSAICHUN CHANG
 * Student Number: 041095591
 * Lab Professor: Professor David Houtman
 * Due Date: Jun 23, 2023.
 * Modified: Jun 22, 2023.
 * Course Number: CST8116 #341
 * Description: Lab Exercise 03
 * 				this class outputs size, bytes, minimum and maximum value of each primitive datatype by using wrapper class
 */

public class Main {
	
	public static void main(String[] args) {
		
		//use printf method to format String and print out( %s for String, %d for integer, %n insert a line-feed)
		//Obtain size, bytes, minimum and maximum value of each datatype
		System.out.printf("%s%s%d%s%d%s%d%s%d%n", "byte,", "SIZE:", Byte.SIZE, ", BYTES: ", Byte.BYTES, ", MIN_VALUE: ", Byte.MIN_VALUE, ", MAX_VALUE: ", Byte.MAX_VALUE);
		
		System.out.printf("%s%s%d%s%d%s%d%s%d%n", "short,", "SIZE:", Short.SIZE, ", BYTES: ", Short.BYTES, ", MIN_VALUE: ", Short.MIN_VALUE, ", MAX_VALUE: ", Short.MAX_VALUE);

		System.out.printf("%s%s%d%s%d%s%d%s%d%n", "int,", "SIZE:", Integer.SIZE, ", BYTES: ", Integer.BYTES, ", MIN_VALUE: ", Integer.MIN_VALUE, ", MAX_VALUE: ", Integer.MAX_VALUE);

		System.out.printf("%s%s%d%s%d%s%d%s%d%n", "long,", "SIZE:", Long.SIZE, ", BYTES: ", Long.BYTES, ", MIN_VALUE: ", Long.MIN_VALUE, ", MAX_VALUE: ", Long.MAX_VALUE);
		/*This Scientific notation in the printf method follow the formula by greeks for greeks org website
		 * Reference:
		 * Scientific notation for double and float in https://www.geeksforgeeks.org
		 * https://www.geeksforgeeks.org/format-specifiers-in-java/ (accessed Jun 22, 2023)
		 * */
		System.out.printf("%s%s%d%s%d%s%e%s%e%n", "float,", "SIZE:", Float.SIZE, ", BYTES: ", Float.BYTES, ", MIN_VALUE: ", Float.MIN_VALUE, ", MAX_VALUE: ", Float.MAX_VALUE);

		System.out.printf("%s%s%d%s%d%s%e%s%e%n", "double,", "SIZE:", Double.SIZE, ", BYTES: ", Double.BYTES, ", MIN_VALUE: ", Double.MIN_VALUE, ", MAX_VALUE: ", Double.MAX_VALUE);
		
		//cast char into int and assign to variable
		int myCharMin = (int)Character.MIN_VALUE;
		int myCharMax = (int)Character.MAX_VALUE;
		
		System.out.printf("%s%s%d%s%d%s%d%s%d%n", "char,", "SIZE:", Character.SIZE, ", BYTES: ", Character.BYTES, ", MIN_VALUE: ", myCharMin, ", MAX_VALUE: ", myCharMax);
		
		System.out.println("Program by TSAICHUN CHANG");
		System.out.println("Student number: 041095591");
		System.out.println("Course name: Intro to Computer Programming");
		
	}
	
}
