/*
 * Student Name: TSAICHUN CHANG
 * Student Number: 041095591
 * Lab Professor: Professor David Houtman
 * Due Date: Jun 2, 2023.
 * Modified: Jun 2, 2023.
 * Course Number: CST8116 #341
 * Description: Lab Exercise 02
 */

public class Motorcycle {
	//private properties
	private String vin;
	private int engineSize;
	private double invoicePrice;
	public Motorcycle() {
	}
	
	public Motorcycle(String inVin, int inEngineSize, double inInvoicePrice) {
		vin = inVin;
		engineSize = inEngineSize;
		invoicePrice = inInvoicePrice;
	}
	
	// getters return the value of the property
	public String getVin() {
		return vin;
	}	
	
	public void setVin(String inVin) {
		vin = inVin;
	}
	
	public int getEngineSize() {
		return engineSize;
	}	
	
	public void setEngineSize(int inEngineSize) {
		//Engine size rounded up or down to the nearest 10’s of cc’s
		//Convert engine size to double, and divided by 10.0, because Math.round can only round up or down with decimal
		//Times 10.0 after round up or down, and convert back to integer
		engineSize = (int)(Math.round((double)inEngineSize / 10.0) * 10.0);
	}
	
	public double getInvoicePrice() {
		return invoicePrice;
	}	
	
	public void setInvoicePrice(double inInvoicePrice) {
		invoicePrice = inInvoicePrice;
	}
	
	public String toString(){
		//revise String format and assign to String report
		//the invoice price to 2 decimal places, and precede the invoice price with a dollar-sign
		//Place ‘(cc)’ after the engine size.
		//Separate each value with comma
		String report = String.format("%s, %d cc, $%.2f", vin, engineSize, invoicePrice);
		return report;	
	}
}
