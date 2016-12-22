package GetOffer;
import datastructures.Stack;
public class Q19 {
	private Stack dataStack = new Stack();
	private Stack minStack = new Stack();
	public void push(int data){
		dataStack.push(data);
		if(minStack.length == 0)
			minStack.push(data);
		else{
			int currentMin = minStack.peek();
			if(minStack.peek() > data)
				currentMin = data;
			minStack.push(currentMin);
		}
	}
	public int pop(){
		if(dataStack.length != 0){
			minStack.pop();
			return dataStack.pop();
		}else
			return -1;
	}
	public int min(){
		if(minStack.length != 0)
			return minStack.peek();
		else
			return -1;
	}
	public static void main(String[] args){
		Q19 stack = new Q19();
		stack.push(4);
		stack.push(3);
		//System.out.print(stack.min());
		stack.pop();
		//System.out.print(stack.min());
		stack.push(5);
		stack.push(3);
		stack.pop();
		System.out.print(stack.min());
	}
}
