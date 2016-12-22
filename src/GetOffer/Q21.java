package GetOffer;
import java.util.Queue;
import java.util.LinkedList;
import util.BiTreeNode;
public class Q21 {
	public static void PrintFromTopToBottom(BiTreeNode root){
		if(root == null)
			return;
		Queue<BiTreeNode> queue = new LinkedList<BiTreeNode>();
		queue.add(root);
		while(!queue.isEmpty()){
			BiTreeNode tmp = queue.remove();
			System.out.print(tmp.value + " ");
			if(tmp.lchild != null)
				queue.add(tmp.lchild);
			if(tmp.rchild != null)
				queue.add(tmp.rchild);
		}
	}
	public static void main(String[] args){
		BiTreeNode root = new BiTreeNode(1);
		root.lchild = new BiTreeNode(2);
		root.rchild = new BiTreeNode(3);
	    root.lchild.lchild = new BiTreeNode(4);
		root.lchild.rchild = new BiTreeNode(5);
		PrintFromTopToBottom(root);
	}
}
