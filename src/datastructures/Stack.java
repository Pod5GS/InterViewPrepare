package datastructures;

import util.ListNode;

public class Stack {
	public ListNode top;
	public int length;
	public void push(int value){
		ListNode tmp = new ListNode();
		tmp.key = value;
		tmp.next = top;
		top = tmp;
		length++;
	}
	public int pop(){
		if(top == null)
			return -1;
		ListNode tmp = top;
		top = top.next;
		length--;
		return tmp.key;
	}
	public int peek(){
		if(top == null)
			return -1;
		else
			return top.key;
	}
}
