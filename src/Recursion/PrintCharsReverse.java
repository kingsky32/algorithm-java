package recursion;

public class PrintCharsReverse {

	public static void main(String[] args) {
		printCharsReverse("Hello");
	}
	
	public static void printCharsReverse(String str) {
		if (str.length() == 0)
			return;
		else {
			printCharsReverse(str.substring(1));
			System.out.print(str.charAt(0));
		}
	}

}
