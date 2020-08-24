package recursion;

public class Power {
	
	public static void main(String [] args) {
		int result = power(4, 4);
		System.out.println(result);
	}
	
	public static int power(int x, int n) {
		if (n == 0)
			return 1;
		else 
			return x * power(x, n - 1);
	}
	
}
