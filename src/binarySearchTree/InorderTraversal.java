package binarySearchTree;
import java.util.*;

public class InorderTraversal {
	
	List<Integer> ret;
	
	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int i) { val = i; }
	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		TreeNode t1 = new TreeNode(2);
		TreeNode t2 = new TreeNode(3);
		root.right = t1;
		t1.left = t2;
	
		InorderTraversal inorderTraversal = new InorderTraversal();
		for(Integer i : inorderTraversal.inorderTraversal(root))
			System.out.print(i + " ");
	
		System.out.println();
	
		for(Integer i : inorderTraversal.preorderTraversal(root)) 
			System.out.print(i + " ");
	
		System.out.println();

		for(Integer i : inorderTraversal.postorderTraversal(root))
			System.out.print(i + " ");
	}

	public List<Integer> inorderTraversal(TreeNode root) {
		ret = new ArrayList<Integer>();
		inorderTraverse(root);
		return ret;
	}

	public List<Integer> preorderTraversal(TreeNode root) {
		ret = new ArrayList<Integer>();
		preorderTraverse(root);
		return ret;
	}

	public List<Integer> postorderTraversal(TreeNode root) {
		ret = new ArrayList<Integer>();
		postorderTraverse(root);
		return ret;
	}

	private void preorderTraverse(TreeNode self) {
		if(self == null) return;
		ret.add(self.val);
		preorderTraverse(self.left);
		preorderTraverse(self.right);
	}

	private void inorderTraverse(TreeNode self) {
		if(self == null) return;
		inorderTraverse(self.left);
		ret.add(self.val);
		inorderTraverse(self.right);
	}

	private void postorderTraverse(TreeNode self) {
		if(self == null) return;
		postorderTraverse(self.left);
		postorderTraverse(self.right);
		ret.add(self.val);
	}
	
}
