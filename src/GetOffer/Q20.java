package GetOffer;
import java.util.Stack;
public class Q20 {
	public static boolean IsPopOrder(int[] pushSequence, int[] popSequence){
		if(pushSequence == null || popSequence == null || pushSequence.length == 0 || popSequence.length == 0)
			return false;
		boolean isPossible = false;
		Stack<Integer> stack = new Stack<Integer>();
		int j = 0;
		for(int i = 0; i < pushSequence.length; i++){
			stack.push(pushSequence[i]);
			while((!stack.isEmpty()) && (stack.peek() == popSequence[j])){
				stack.pop();
				j++;
			}
		}
		if(stack.isEmpty())
			isPossible = true;
		else
			isPossible = false;
		return isPossible;
	}
	public static void main(String[] args){
		int[] pushSequence = {1,2,3,4,5};
		int[] popSequence = {4,5,3,2,1};
		int[] popSequence2 = {4,3,5,1,2};
		System.out.println(IsPopOrder(pushSequence,popSequence));
		System.out.println(IsPopOrder(pushSequence,popSequence2));
	}
}
