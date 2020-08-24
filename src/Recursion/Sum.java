package recursion;

public class Sum {

	public static void main(String[] args) {
		int [] arr = {1, 2, 3, 4, 5};
		int result = sum(5, arr);
		System.out.println(result);
	}
	
	public static int sum(int n, int [] data) {
		if (n <= 0)
			return 0;
		else
			return sum(n - 1, data) + data[n - 1];
	}

}
