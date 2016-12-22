package GetOffer;
import java.util.Stack;
public class Q5 {
	Stack<Integer> stack1 = new Stack<Integer>();
	Stack<Integer> stack2 = new Stack<Integer>();
	public void push(int value){
		stack1.push(new Integer(value));
	}
	public int pop(){
		if(stack2.isEmpty()){
			while(!stack1.isEmpty())
				stack2.push(stack1.pop());
		}
		if(stack2.isEmpty())
			return -1;
		else
			return stack2.pop().intValue();
	}
}
