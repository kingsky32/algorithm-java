package Recursion;

import java.util.Arrays;

public class Maze {
	
	private static int N = 8;
	
	private static final int PATHWAY_COLOR = 0; // white
	private static final int WALL_COLOR = 1; // blue
	private static final int BLOCKED_COLOR = 2; // red
	private static final int PATH_COLOR = 3; // green
	
	private static int [][] maze = {
		{0, 0, 0, 0, 0, 0, 0, 1},
		{0, 1, 1, 0, 1, 1, 0, 1},
		{0, 0, 0, 1, 0, 0, 0, 1},
		{0, 1, 0, 0, 1, 1, 0, 0},
		{0, 1, 1, 1, 0, 0, 1, 1},
		{0, 1, 0, 0, 0, 1, 0, 1},
		{0, 0, 0, 1, 0, 0, 0, 1},
		{0, 1, 1, 1, 0, 1, 0, 0}
	};
	
	public static boolean findMazePath(int x, int y) {
		if (x < 0 || y < 0 || x >= N || y >= N)
			return false;
		else if (maze[x][y] == WALL_COLOR)
			return false;
		else if (maze[x][y] != PATHWAY_COLOR)
			return false;
		else if (x == N - 1 && y == N - 1) {
			maze[x][y] = PATH_COLOR;
			return true;
		}
		else {
			maze[x][y] = PATH_COLOR;
			if (findMazePath(x - 1, y) || findMazePath(x, y + 1) ||
				findMazePath(x + 1, y) || findMazePath(x, y - 1)) {
				return true;
			}
			maze[x][y] = BLOCKED_COLOR; // dead end
			return false;
		}
	}
	
	public static void printMaze() {
		System.out.println(Arrays.deepToString(maze));
	}
	
	public static void main(String [] args) {
		printMaze();
		findMazePath(0, 0);
		printMaze();
	}
	
}
