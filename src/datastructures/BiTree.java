package datastructures;

import java.util.Stack;
import util.BiTreeNode;

public class BiTree {
	private BiTreeNode root;

	public BiTree() {
		root = null;
	}

	public void preorder(BiTreeNode root) {
		if (root != null) {
			System.out.print(root.value + " ");
			preorder(root.lchild);
			preorder(root.rchild);
		}
	}

	public void inorder(BiTreeNode root) {
		if (root != null) {
			inorder(root.lchild);
			System.out.print(root.value + " ");
			inorder(root.rchild);
		}
	}

	public void postorder(BiTreeNode root) {
		if (root != null) {
			postorder(root.lchild);
			postorder(root.rchild);
			System.out.print(root.value + " ");
		}
	}
	
	public void preorder_nonrecursion(){
		if(root == null)
			return;
		Stack<BiTreeNode> stack = new Stack<BiTreeNode>();
		stack.push(root);
		while(!stack.isEmpty()){
			BiTreeNode curNode = stack.pop();
			System.out.print(curNode.value + " ");
			if(curNode.rchild != null)
				stack.push(curNode.rchild);
			if(curNode.lchild != null)
				stack.push(curNode.lchild);
		}
	}
	public void inorder_nonrecursion(){
		if(root == null)
			return;
		Stack<BiTreeNode> stack = new Stack<BiTreeNode>();
		BiTreeNode curNode = root;
		while(curNode != null){
			stack.push(curNode);
			curNode = curNode.lchild;
		}
		while(!stack.isEmpty()){
			curNode = stack.pop();
			System.out.print(curNode.value + " ");
			if(curNode.rchild != null){
				curNode = curNode.rchild;
				while(curNode != null){
					stack.push(curNode);
					curNode = curNode.lchild;
				}
			}
		}
	}
	public void postorder_nonrecursion(){
		if(root == null)
			return;
		Stack<BiTreeNode> stack1 = new Stack<BiTreeNode>();
		Stack<BiTreeNode> stack2 = new Stack<BiTreeNode>();
		BiTreeNode curNode = root;
		stack1.push(root);
		while(!stack1.isEmpty()){
			curNode = stack1.pop();
			stack2.push(curNode);
			if(curNode.lchild != null)
				stack1.push(curNode.lchild);
			if(curNode.rchild != null)
				stack1.push(curNode.rchild);
		}
		while(!stack2.isEmpty()){
			curNode = stack2.pop();
			System.out.print(curNode.value + " ");
		}
	}
	
	public static void main(String[] args) throws Exception{
		BiTree tree = new BiTree();
		tree.root = new BiTreeNode(1);
		tree.root.lchild = new BiTreeNode(2);
		tree.root.rchild = new BiTreeNode(3);
		tree.root.lchild.lchild = new BiTreeNode(4);
		tree.root.lchild.rchild = new BiTreeNode(5);
		tree.preorder(tree.root);
		System.out.println();
		tree.preorder_nonrecursion();
		System.out.println();
		tree.inorder(tree.root);
		System.out.println();
		tree.inorder_nonrecursion();
		System.out.println();
		tree.postorder(tree.root);
		System.out.println();
		tree.postorder_nonrecursion();
	}
}
