/*
 * Student Name: TSAICHUN CHANG
 * Student Number: 041095591
 * Lab Professor: Professor David Houtman
 * Due Date: Jun 23, 2023.
 * Modified: Jun 22, 2023.
 * Course Number: CST8116 #341
 * Description: Lab Exercise 03
 * 				this Class include all signature about HardBread, such as dimension, seasoning
 */

public class HardBread {
	//constant and static variables store the maximum dimension
	public static final double MAX_LENGTH = 10.5;
	public static final double MAX_WIDTH = 10.5;
	public static final double MAX_DEPTH = 5.5;
	//private instance variables
	private double length;
	private double width;
	private double depth;
	private boolean isSalted;
	
	//the no-argument constructor assigns value from constants into instance variables
	//set isSlated true
	public HardBread() {
		length = MAX_LENGTH;
		width = MAX_WIDTH;
		depth = MAX_DEPTH;
		isSalted = true;
	}
	//constructor that assigns each dimension to instance variables 
	public HardBread(double length, double width, double depth, boolean isSalted) {
		this.length = length;
		this.width = width;
		this.depth = depth;
		this.isSalted = isSalted;
	}
	
	//getter is to retrieve data in private fields in this Class, and return the data
	public double getLength() {
		return length;
	}
	//setter has parameter and set the value of variables in private fields in this Class
	public void setLength(double length) {
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getDepth() {
		return depth;
	}
	public void setDepth(double depth) {
		this.depth = depth;
	}
	//isSalted method is to retrieve boolean data in private fields and return the data
	public boolean isSalted() {
		return isSalted;
	}
	//setter has parameter and set the boolean value of variables in private fields in this Class
	public void setSalted(boolean isSalted) {
		this.isSalted = isSalted;
	}
	
	//multiply three variables to calculate volume and return 
	public double calculateVolume() {
		return length * width * depth;
	}
	
	//format String and return
	//%s is for String data, %.2f is for double to 2 decimal places 
	public String toString() {
		return String.format("%s %.2f,%s %.2f,%s %.2f", "Length", length, "Width", width, "Depth", depth);
	}
	
}
