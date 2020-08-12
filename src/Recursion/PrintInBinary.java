package Recursion;

public class PrintInBinary {

	public static void main(String[] args) {
		printInBinary(8);
	}
	
	public static void printInBinary(int n) {
		if (n < 2)
			System.out.print(n);
		else {
			printInBinary(n / 2);
			System.out.print(n % 2);
		}
	}

}
