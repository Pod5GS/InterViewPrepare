package GetOffer;
import java.util.Stack;
import util.BiTreeNode;
public class Q23 {
	public static void findPath(BiTreeNode root, int target){
		if(root == null)
			return;
		Stack<Integer> path = new Stack<Integer>();//存储路径
		findPath(root,target,path);
	}
	public static void findPath(BiTreeNode root, int target, Stack<Integer> path){
		if(root == null)
			return;
		if(root.lchild == null && root.rchild == null){
			if(root.value == target){//当遍历到叶子节点时，若target的剩于值与叶子节点相同时，则表示次路径
				System.out.println("路径开始");  
                for(int i :path)  
                    System.out.print(i+",");  
                System.out.print(root.value);  
			}
		}else{  
            path.push(root.value);  
            if(root.lchild != null)
            	findPath(root.lchild,target - root.value,path);//开始遍历子节点时，用target减去父节点的值  
            if(root.rchild != null)
            	findPath(root.rchild,target - root.value,path);//开始遍历子节点时，用target减去父节点的值
            path.pop();  
        }  
	}
}
