package recursion;

public class Code02 {
	
	public static void main(String [] args) {
		int n = 4;
		func(n);
	}
	
	public static void func(int n) {
		if (n<=0)
			return;
		else {
			System.out.println("Hello....");
			func(n-1);
		}
	}
}
