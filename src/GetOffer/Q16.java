package GetOffer;
import util.BiTreeNode;
public class Q16 {
	public boolean HasSubTree(BiTreeNode root1, BiTreeNode root2){
		boolean result = false;
		if(root1 != null && root2 != null){
			if(root1.value == root2.value){
				result = DoesTree1HasTree2(root1,root2);
			}
			if(!result)
				result = HasSubTree(root1.lchild,root2);
			if(!result)
				result = HasSubTree(root1.rchild,root2);
		}
		return result;
	}
	public boolean DoesTree1HasTree2(BiTreeNode root1, BiTreeNode root2){
		if(root2 == null)
			return true;
		if(root1 == null)
			return false;
		if(root1.value != root2.value)
			return false;
		return DoesTree1HasTree2(root1.lchild,root2.lchild) && DoesTree1HasTree2(root1.rchild,root2.rchild);
	}
}
