package GetOffer;

import util.ListNode;

public class Q14 {
	public static ListNode ReverseList(ListNode pHead){
		if(pHead == null)
			return null;
		ListNode reverseHead = null;
		ListNode preNode = null;
		ListNode currentNode = pHead;
		while(currentNode != null){
			ListNode nextNode = currentNode.next;
			if(nextNode == null){
				reverseHead = currentNode;
			}
			currentNode.next = preNode;
			preNode = currentNode;
			currentNode = nextNode;
		}
		return reverseHead;
	}
}
