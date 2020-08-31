package recursion;

import java.util.Arrays;

public class NQueensProblem {
	private static int N = 8;
	private static int [] cols = new int [N + 1];
	private static int [][] result = new int [N][N];
	public static boolean promising(int level) {
		for(int i = 1; i < level; i ++) {
			if (cols[i] == cols[level])
				return false;
			else if (level - i == Math.abs(cols[level] - cols[i]))
				return false;
		}
		return true;
	}
	
	public static boolean queens(int level) {
		if (!promising(level))
			return false;
		else if (level == N) {
			for (int i = 1; i <= N; i ++) {
				if (cols[i] >= N) {
					for (int j = 0; j <= N - 1; j ++) {
						for (int k = 0; k <= N - 1; k ++) {
							result[j][k] = 0;
						}
					}
					return false;
				}
				result[i - 1][cols[i]] = 1;
			}
			return true;
		}
		for (int i = 0; i <= N; i++) {
			cols[level + 1] = i;
			if (queens(level + 1))
				return true;
		}
		return false;
	}
	
	public static void main(String [] args) {
		queens(0);
		
		for (int i = 0; i <= N - 1; i ++) {
			System.out.println(Arrays.toString(result[i]));
		}
	}
	
}