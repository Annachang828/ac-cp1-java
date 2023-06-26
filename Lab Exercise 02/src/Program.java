/*
 * Student Name: TSAICHUN CHANG
 * Student Number: 041095591
 * Lab Professor: Professor David Houtman
 * Due Date: Jun 2, 2023.
 * Modified: Jun 1, 2023.
 * Course Number: CST8116 #341
 * Description: Lab Exercise 02
 */

import java.util.Scanner;	

public class Program {
	
	public static void main(String[] args) {

		String vin, report;
		int engineSize;
		double invoicePrice;
		
		Scanner userInput = new Scanner(System.in);
		//create an object of Motorcycle using new keyword
		Motorcycle motorcycle = new Motorcycle();
		
		//Setters use user input as parameter
		System.out.println("Please enter vehicle identification number: ");
		vin = userInput.nextLine();
		motorcycle.setVin(vin);
		
		System.out.println("Please enter engine size (cc): ");
		engineSize = userInput.nextInt();
		motorcycle.setEngineSize(engineSize);
		
		System.out.println("Please enter invoice price: ");
		invoicePrice = userInput.nextDouble();
		motorcycle.setInvoicePrice(invoicePrice);	
		
		//Motorcycle motorcycle = new Motorcycle(vin, engineSize, invoicePrice); 
		
		report = motorcycle.toString();
		System.out.println(report);
		
		System.out.println("Program by TSAICHUN CHANG.");
		
		userInput.close();
	}

}
