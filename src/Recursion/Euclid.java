package recursion;

public class Euclid {
	
	public static void main(String [] args) {
		int result = gcd(4, 4);
		System.out.println(result);
	}
	
	public static int gcd(int m, int n) {
		if (m < n) {
			int temp = m;
			m = n;
			n = temp;
		}
		if (m % n == 0) 
			return n;
		else 
			return gcd(n, m % n);
	}
	
}
