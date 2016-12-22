package GetOffer;
import util.BiTreeNode;
public class Q17 {
	public void MirrorBiTree(BiTreeNode root){
		if(root == null)
			return;
		if(root.lchild == null && root.rchild == null)
			return;
		BiTreeNode tmpNode = root.lchild;
		root.lchild = root.rchild;
		root.rchild = tmpNode;
		if(root.lchild != null)
			MirrorBiTree(root.lchild);
		if(root.rchild != null)
			MirrorBiTree(root.rchild);
	}
}
