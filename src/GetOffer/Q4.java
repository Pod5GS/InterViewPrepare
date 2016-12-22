package GetOffer;

import util.BiTreeNode;

public class Q4 {
	public static BiTreeNode constructTree(int[] preorder, int[] inorder) {
		BiTreeNode root = constructCore(preorder, 0, preorder.length - 1,
				inorder, 0, inorder.length - 1);
		return root;
	}

	public static BiTreeNode constructCore(int[] preorder, int startPre,
			int endPre, int[] inorder, int startIn, int endIn) {
		if (startPre > endPre || startIn > endIn) {
			return null;
		}
		BiTreeNode root = new BiTreeNode(preorder[startPre]);
		for (int i = startIn; i <= endIn; i++) {
			if (inorder[i] == preorder[startPre]) {
				root.lchild = constructCore(preorder, startPre + 1, startPre
						+ i - startIn, inorder, startIn, i - 1);
				root.rchild = constructCore(preorder, i - startIn + startPre
						+ 1, endPre, inorder, i + 1, endIn);
			}
		}
		return root;
	}

	public static void main(String[] args) {
		int[] preorder = {1,2,4,5,3};
		int[] inorder = {4,2,5,1,3};
		BiTreeNode root = constructTree(preorder,inorder);
		System.out.println(root.value);
	}
}
