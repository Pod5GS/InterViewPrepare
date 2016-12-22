package GetOffer;
import java.util.Stack;

import util.ListNode;

public class Q3 {
	public static void PrintListReversely_Recursive(ListNode list){
		if(list != null){
			if(list.next != null)
				PrintListReversely_Recursive(list.next);
			System.out.print(list.key);
		}
	}
	
	public static void PrintListReversely(ListNode head){
		Stack<ListNode> stack = new Stack<ListNode>();
		ListNode currentNode = head;
		while(currentNode != null){
			stack.push(currentNode);
			currentNode = currentNode.next;
		}
		while(!stack.isEmpty())
			System.out.print(stack.pop().key);
	}
	
	public static void main(String[] args){
		ListNode four = new ListNode(5,null);
		ListNode three = new ListNode(3,four);
		ListNode two = new ListNode(4,three);
		ListNode one = new ListNode(1,two);
		PrintListReversely_Recursive(one);
	}
}


