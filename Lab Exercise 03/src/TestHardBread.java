/*
 * Student Name: TSAICHUN CHANG
 * Student Number: 041095591
 * Lab Professor: Professor David Houtman
 * Due Date: Jun 23, 2023.
 * Modified: Jun 17, 2023.
 * Course Number: CST8116 #341
 * Description: Lab Exercise 03
 * 				this class outputs two HardBread objects' volume and dimension within main method
 */

public class TestHardBread {

	public static void main(String[] args) {
		//use new keyword to create an object name hardBread1
		HardBread hardBread1 = new HardBread();
		//use new keyword to create an object name hardBread1 with arguments
		HardBread hardBread2= new HardBread(2.5, 5.75, 3.45, true);
		String report;
		double volume;
		
		//call calculateVolume method in object to calculate volume
		volume = hardBread1.calculateVolume();
		//call toString method to get a String report
		report = hardBread1.toString();
		System.out.println("Hard Bread 1:");
		//use printf method to print out in a format String. %s is for String data. %f is for double data. %n insert a new line-feed
		//format volume to 2 decimal places
		System.out.printf("%s%.2f%n", "volume: ", volume);
		System.out.println(report);		
		
		volume = hardBread2.calculateVolume();
		report = hardBread2.toString();
		System.out.println("Hard Bread 2:");
		System.out.printf("%s%.2f%n", "volume: ", volume);
		System.out.println(report);	
		
		System.out.println("Program by TSAICHUN CHANG.");
		
	}
	
}
