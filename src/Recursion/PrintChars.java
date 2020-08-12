package Recursion;

public class PrintChars {
	
	public static void main(String [] args) {
		printChars("Hello");
	}
	
	public static void printChars(String str) {
		if (str.length() == 0)
			return;
		else {
			System.out.print(str.charAt(0));
			printChars(str.substring(1));
		}
	}
}
